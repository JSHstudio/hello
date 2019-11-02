package 이욱_2018204044_과제1;

public class DoublyLinkedList <E>{
	
	private static class Node<E> {
	      private E element;
	      private Node<E> prev;
	      private Node<E> next;

	      public Node(E e, Node<E> p, Node<E> n) {
	         this.element = e;
	         this.prev = p;
	         this.next = n;
	      }

	      public E getElement() {
	         return element;
	      }

	      public Node<E> getPrev() {
	         return prev;
	      }

	      public Node<E> getNext() {
	         return next;
	      }

	      public void setPrev(Node<E> p) {
	         this.prev = p;
	      }
	      public void setElement(E e) {
	    	  this.element = e;
	      }
	      public void setNext(Node<E> n) {
	         this.next = n;
	      }
	   }

	   private Node<E> header;
	   private Node<E> trailer;
	   private int size = 0;
	   
	   public DoublyLinkedList() {
	      this.header = new Node<>(null, null, null);
	      this.trailer = new Node<>(null, this.header, null);
	      this.header.setNext(this.trailer);
	   }    

	   public int size() {
	      return size;
	   }

	   public boolean isEmpty() {
	      return size == 0;
	   }

	   public E first() {
	      if (isEmpty())
	         return null;
	      return header.getNext().getElement();
	   }

	   public E last() {
	      if (isEmpty())
	         return null;
	      return trailer.getPrev().getElement();
	   }
	   
	   public void addFirst(E e) {
	      this.addBetween(e, header, header.getNext());
	   }
	   
	   public void addLast(E e) {
	      addBetween(e, trailer.getPrev(), trailer);
	   }
	   
	   public boolean add(E e) {
		   if(e.getClass() != GameEntry.class) {
			   return false;
		   }
		   if(size == 0) {
			   addLast(e);
			   return true;
		   }
		   Node<E> tmp = trailer.getPrev();
		   addBetween(e, trailer.getPrev(), trailer);
		   Node<E> preNode;
		   Node<E> newNode;
		   Node<E> nextNode;
		   
		   int newScore = ((GameEntry) e).getScore();
		   while(tmp.getPrev() != null && ((GameEntry) tmp.getElement()).getScore() < newScore) {
			   preNode = tmp.getPrev();
			   newNode = tmp.getNext();
			   nextNode = tmp.getNext().getNext();
			   
			   preNode.setNext(newNode);
			   
			   newNode.setPrev(preNode);
			   newNode.setNext(tmp);
			   
			   tmp.setPrev(newNode);
			   tmp.setNext(nextNode);
			   
			   nextNode.setPrev(tmp);
			   tmp = preNode;
		   }
		   return true;
	   }
	   
	   public E removeFirst() {
	      if(isEmpty()) return null;
	      return remove(header.getNext());
	   }
	   
	   public E removeLast() {
	      if(isEmpty()) return null;
	      return remove(trailer.getPrev());
	   }
	   
	   private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
	      Node<E> newest = new Node<E>(e, predecessor, successor);
	      predecessor.setNext(newest);
	      successor.setPrev(newest);
	      size++;
	   }
	   
	   private E remove(Node<E> node) {
	      Node<E> predecessor = node.getPrev();
	      Node<E> successor = node.getNext();
	      predecessor.setNext(successor);
	      successor.setPrev(predecessor);
	      size--;
	      return node.getElement();
	   }
	   
	   public E remove(String str) {
		   
		   Node<GameEntry> tmp = (Node<GameEntry>)header.getNext();
		   Node<E> current = header.getNext();
		   while(tmp.getElement().getName() != str && tmp != trailer) {
			   tmp = tmp.getNext();
			   current = current.getNext();
		   }
		   
		   if(tmp == trailer) 
			   return null;
		   remove(current);
		   return current.getElement();
	   }
	   
	   public String toString(String str) {
		   String result = "";
		   result += "[DoyblyLinkedList] " + str + ": [";
		   Node<GameEntry> node = (Node<GameEntry>) header.getNext();
		   while(node != trailer) {
			   result += "(" + node.getElement().getName()+", "+node.getElement().getScore()+")";
			   if(node != trailer.getPrev())
				   result += ", ";
			   node = node.getNext();
		   }
		   result += "]";
		   
		   return result;
	   }
	  
}

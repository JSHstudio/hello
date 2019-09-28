package 이욱_2018204044_과제1;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<GameEntry> doublyLinkedList = new DoublyLinkedList<GameEntry>();
		String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Paul", "Bob"};
		String[] removes = {"Mike", "Paul", "Bob"};
		
		int[] scores = { 750, 1105, 590, 740, 610, 410, 840 };
		
		for (int i = 0; i < names.length; i++) {
			GameEntry b = new GameEntry(names[i], scores[i]);
			doublyLinkedList.add(b);
			System.out.println(doublyLinkedList.toString("Added"));
		}
		
		for(int i=0;i<removes.length;i++) {
			doublyLinkedList.remove(removes[i]);
			System.out.println(doublyLinkedList.toString("removed"));
		}
	}

}

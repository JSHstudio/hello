package 이욱_2018204044_과제3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyMatrixGraph<V, E> implements Graph<V, E> {

	private class VertexImpl<V> implements Vertex<V> {
		private V element;

		public VertexImpl(V element) {
			this.element = element;
		}

		public V getElement() {
			// TODO Auto-generated method stub
			return element;
		}
		
		public boolean validate(Graph<V, E> graph) {
			return (AdjacencyMatrixGraph.this == graph);
		}
	}

	private class EdgeImpl<E> implements Edge<E> {
		private E element;
		private Vertex<V>[] endpoints;

		@SuppressWarnings("{unchecked}")
		public EdgeImpl(Vertex<V> u, Vertex<V> v, E elem) {
			// TODO Auto-generated constructor stub
			endpoints = new Vertex[] { u, v };
			element = elem;
		}

		@Override
		public E getElement() {
			// TODO Auto-generated method stub
			return element;
		}

		public Vertex<V>[] getEndpoints() {
			return endpoints;
		}

		public boolean validate(Graph<V, E> graph) {
			return (AdjacencyMatrixGraph.this == graph);
		}
	}

	private boolean isDirected;
	private List<Vertex<V>> vertices = new LinkedList<>();
	private List<Edge<E>> edges = new LinkedList<>();
	private Edge<E>[][] matrix;

	public AdjacencyMatrixGraph(boolean isDirected) {
		// TODO Auto-generated constructor stub
		this.isDirected = isDirected;
	}

	@SuppressWarnings({ "unchecked" })
	private VertexImpl<V> validate(Vertex<V> vertex) throws IllegalArgumentException {
		if (!(vertex instanceof VertexImpl))
			throw new IllegalArgumentException("Invalid vertex");
		VertexImpl<V> vert = (VertexImpl<V>) vertex;
		if (!vert.validate(this))
			throw new IllegalArgumentException("Invalid vertex");
		return vert;
	}

	@SuppressWarnings({ "unchecked" })
	private EdgeImpl<E> validate(Edge<E> e) throws IllegalArgumentException {
		if (!(e instanceof EdgeImpl))
			throw new IllegalArgumentException("Invalid edge");
		EdgeImpl<E> edge = (EdgeImpl<E>) e;
		if (!edge.validate(this))
			throw new IllegalArgumentException("Invalid edge");
		return edge;
	}

	@Override
	public int numVertices() {
		// TODO Auto-generated method stub
		return vertices.size();
	}

	@Override
	public int numEdges() {
		// TODO Auto-generated method stub
		return edges.size();
	}

	@Override
	public Iterable<Vertex<V>> vertices() {
		// TODO Auto-generated method stub
		return vertices;
	}

	@Override
	public Iterable<Edge<E>> edges() {
		// TODO Auto-generated method stub
		return edges;
	}

	@Override
	public int outDegree(Vertex<V> v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		VertexImpl<V> vert = validate(v);
		int counter = 0;
		int index = vertices.indexOf(v);
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[index][i] != null)
				counter++;
		}
		return counter;
	}

	@Override
	public int inDegree(Vertex<V> v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		VertexImpl<V> vert = validate(v);
		int counter = 0;
		int index = vertices.indexOf(v);
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][index] != null)
				counter++;
		}
		return counter;
	}

	@Override
	public Iterable<Edge<E>> outgoingEdges(Vertex<V> v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		VertexImpl<V> vert = validate(v);
		List<Edge<E>> list = new ArrayList<>();
		int index = vertices.indexOf(v);
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[index][i] != null)
				list.add(matrix[index][i]);
		}
		return list;
	}

	@Override
	public Iterable<Edge<E>> incomingEdges(Vertex<V> v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		VertexImpl<V> vert = validate(v);
		List<Edge<E>> list = new ArrayList<>();
		int index = vertices.indexOf(v);
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][index] != null)
				list.add(matrix[i][index]);
		}
		return list;
	}

	@Override
	public Edge<E> getEdge(Vertex<V> u, Vertex<V> v) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		VertexImpl<V> vertU = validate(u);
		VertexImpl<V> vertV = validate(v);
		int indexU = vertices.indexOf(u);
		int indexV = vertices.indexOf(v);
		if (indexU == -1 || indexV == -1)
			return null;
		return matrix[indexU][indexV];
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public Vertex<V>[] endVertices(Edge<E> e) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		EdgeImpl<E> edge = (EdgeImpl<E>) e;
		return edge.getEndpoints();
	}

	@Override
	public Vertex<V> opposite(Vertex<V> v, Edge<E> e) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		Vertex<V>[] endV = endVertices(e);
		if (v == endV[0]) {
			return endV[1];
		} else if (v == endV[1]) {
			return endV[0];
		} else
			throw new IllegalArgumentException();
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public Vertex<V> insertVertex(V element) {
		// TODO Auto-generated method stub
		VertexImpl<V> vert = new VertexImpl(element);
		vertices.add(vert);
		int vertexNumber = vertices.size();
		Edge<E>[][] newMatrix = new Edge[vertexNumber][vertexNumber];
		for (int i = 0; i < vertexNumber - 1; i++) {
			for (int j = 0; j < vertexNumber - 1; j++) {
				newMatrix[i][j] = matrix[i][j];
			}
		}
		matrix = newMatrix;
		return vert;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public Edge<E> insertEdge(Vertex<V> u, Vertex<V> v, E element) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		if (getEdge(u, v) == null) {
			EdgeImpl<E> edge = new EdgeImpl(u, v, element);
			edges.add(edge);
			VertexImpl<V> startVertex = validate(u);
			VertexImpl<V> endVertex = validate(v);
			matrix[vertices.indexOf(startVertex)][vertices.indexOf(endVertex)] = edge;
			return edge;

		} else
			throw new IllegalArgumentException();
	}
	
	public Edge<E> DFS(Graph<V, E> g) {
		return null;
	}
	
	public Edge<E> DFS(Graph<V, E>g, VertexImpl<V> v){
		return null;
	}
	
}

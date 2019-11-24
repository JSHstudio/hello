package 이욱_2018204044_과제3;

import java.util.*;

import javax.imageio.IIOException;


public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<String, String> graph = new AdjacencyMatrixGraph<String, String>(true);
		
		Vertex<String> v_HNL = graph.insertVertex("HNL");
		Vertex<String> v_SFO = graph.insertVertex("SFO");
		Vertex<String> v_LAX = graph.insertVertex("LAX");
		Vertex<String> v_ORD = graph.insertVertex("ORD");
		Vertex<String> v_DFW = graph.insertVertex("DFW");
		Vertex<String> v_PVD = graph.insertVertex("PVD");
		Vertex<String> v_LGA = graph.insertVertex("LGA");
		Vertex<String> v_MIA = graph.insertVertex("MIA");
		
		Edge<String> e_HL = graph.insertEdge(v_HNL, v_LAX, "2555");
		Edge<String> e_SL = graph.insertEdge(v_SFO, v_LAX, "337");
		Edge<String> e_SO = graph.insertEdge(v_SFO, v_ORD, "1843");
		Edge<String> e_LO = graph.insertEdge(v_LAX, v_ORD, "1743");
		Edge<String> e_LD = graph.insertEdge(v_LAX, v_DFW, "1233");
		Edge<String> e_OD = graph.insertEdge(v_ORD, v_DFW, "802");
		Edge<String> e_OP = graph.insertEdge(v_ORD, v_PVD, "849");
		Edge<String> e_DL = graph.insertEdge(v_DFW, v_LGA, "1387");
		Edge<String> e_DM = graph.insertEdge(v_DFW, v_MIA, "1120");
		Edge<String> e_PL = graph.insertEdge(v_PVD, v_LGA, "142");
		Edge<String> e_LM = graph.insertEdge(v_LGA, v_MIA, "1099");
		
		
	}
	
}

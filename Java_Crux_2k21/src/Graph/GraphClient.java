package Graph;

public class GraphClient {

	public static void main(String[] args) {
		
		graph gp = new graph();
		gp.addVertex("A");
		gp.addVertex("B");
		gp.addVertex("C");
		gp.addVertex("D");
		gp.addVertex("E");
		gp.addVertex("F");
		gp.addVertex("G");
		
		
		gp.addEdge("A", "B", 2);
		gp.addEdge("A", "D", 3);
		gp.addEdge("B", "C", 1);
		gp.addEdge("C", "D", 8);
		gp.addEdge("D", "E", 10);
		gp.addEdge("E", "F", 45);
		gp.addEdge("E", "G", 7);
		gp.addEdge("F", "G", 8);
		
		gp.display();
		
//		System.out.println(gp.numEdges());
		System.out.println(gp.numVertex());
		System.out.println(gp.numEdges());
		
		System.out.println(gp.containEdge("A", "C"));
		System.out.println(gp.containEdge("E", "F"));
		
		
		
	}

}

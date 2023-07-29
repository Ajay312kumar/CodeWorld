package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class graph {
	
	private class Vertex
	{
		HashMap<String, Integer> nbrs = new HashMap<>();
		
	}
	HashMap<String, Vertex> vrtces;
	
	public graph()   //it is a constructor for initializing.
	{
		vrtces = new HashMap<>(); //it will allocate the space in vrtces. 
	}

	
	public int numVertex() // it return total no. of vertex present in Graph
	{
		return this.vrtces.size();
	}
	
	public boolean containVertex(String vname) // it tell us vertex present or not in the graph
	{
		return this.vrtces.containsKey(vname);
	}
	
	
	public void addVertex(String vname) // we have to add vertex in the graph that is already given
	{
		Vertex vtx = new Vertex();
		vrtces.put(vname, vtx);
	}
	
	public void removeVertex(String vname) // for removing the vertex from the graph.
	{
		 Vertex vtx = vrtces.get(vname);
		 ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
		 for(String key : keys)
		 {
			 Vertex nbrvtx = vrtces.get(key);
			 nbrvtx.nbrs.remove(vname);
		 }
		 vrtces.remove(vname);
	}
	
	public int numEdges()
	{
		int count=0;
		ArrayList<String> keys = new ArrayList<>();
		for(String key : keys)
		{
			Vertex  vtx = vrtces.get(key);
			count = count+vtx.nbrs.size();
		}
		return count/2;
	}
	
	public boolean containEdge(String vname1, String vname2)
	{
		Vertex vtx1 = vrtces.get(vname1);
		Vertex vtx2 = vrtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2))
		{
			return false;
		}
		return true;
	}
	
	
	public void addEdge(String vname1, String vname2, int cost)
	{
		
		Vertex vtx1 = vrtces.get(vname1);
		Vertex vtx2 = vrtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2))
		{
			return ;
		}
		   
		vtx1.nbrs.put(vname2, cost); //2k nbrs put C with given cost
		vtx2.nbrs.put(vname1, cost);  //4k nbrs put A with given cost
		 
		
	}
	
	public void removeEdge(String vname1, String vname2)
	{
		Vertex vtx1 = vrtces.get(vname1);  //2k
		Vertex vtx2 = vrtces.get(vname2);  //4k
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2))
		{
			return ;
		}
		   
		vtx1.nbrs.remove(vname2); // 2k nbrs remove C
		vtx2.nbrs.remove(vname1);  // 4k nbrs remove A
	}
	
	public void display()
	{
		
		System.out.println("-----------------------------");
		ArrayList<String> keys = new ArrayList<>(vrtces.keySet());
		
		for(String key : keys)
		{
			Vertex vtx = vrtces.get(key);
			System.out.println(key+ " : " + vtx.nbrs);
		}
	}
	
	
	
	
	
	
}

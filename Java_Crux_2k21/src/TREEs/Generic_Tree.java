package TREEs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//import TREEs.Binary_tree.Node;
public class Generic_Tree {
  
	Scanner sc = new Scanner(System.in);
	
	private class Node{
		
		int data;
		ArrayList<Node> children;
		
		Node(int val)
		{
			data  = val;
		    children = new ArrayList<>();	
		}
		Node()
		{
			this(0);
		}
	}
	private  Node root;
	
	public void createTree()
	{
		root = createTree(null, -1);
	}
	private Node createTree(Node parent, int ith)
	{
		if(parent == null)
		{
			System.out.println("enter root node value: ");
		}
		else {
//			System.out.println("Enter the value of "+ith+"child on ");
		System.out.println("Enter the value of "+ith+" child of "+parent.data);
		}
		
		int val = sc.nextInt();
		Node n = new Node(val);
//		System.out.println("node data->" + n.data);
//		System.out.println("node data->" + n.children.size());
		System.out.println("Enter no. of children for this node: ");
		int noc = sc.nextInt();
		for(int i = 0; i < noc; i++)
		{
			Node child = createTree(n, i);
			n.children.add(child);
			System.out.print("node data-> " + n.children.size());
		}
		return n;
	}
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node n)
	{
		System.out.println(n.data +" -----> ");
		for(int i = 0; i < n.children.size(); i++)
		{
			System.out.println(n.children.get(i).data+ " ");
		}
		System.out.println();
		for(Node child: n.children)
		{
			display(child);
		}
	}
	
	
	public void mirror()
    {
    	mirror(this.root);
    }
    
    private void mirror(Node node)
    {
    	for(Node child : node.children)
    	{
    		mirror(child);
    	}
    	
    	Collections.reverse(node.children);
    	
    }
	
    public void preorder()
    {
    	preorder(this.root);
    }
    
    private void preorder(Node node)
    {
    	System.out.println(node.data+" ");
   
    	for(Node child : node.children)
    	{
    		preorder(child);
    	}
    }
	
	public void postorder()
	{
		postorder(this.root);
	}
	
	private void postorder(Node node)
	{
		for(Node child: node.children)
		{
			postorder(child);
		}
		
		System.out.println(node.data+" ");
	}
	
	public void levelOrder()
	{
		levelOrder(this.root);
	}
	private void levelOrder(Node node)
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(node);
		
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			for(Node child: node.children)
			{
				qt.add(child);
				
				System.out.println(n.data+" ");
			}
		}
	}
	
	
	
	
	
	
}

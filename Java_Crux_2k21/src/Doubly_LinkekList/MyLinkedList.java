package Doubly_LinkekList;

public class MyLinkedList {

	class Node
	{
		int data;
		Node next;
		Node prev;
	
	
	Node(int data)
	{
		this.data=data;
	}
	
}
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	private void addFirstNode(Node node)
	{
		if(size==0)
		{
			this.head = this.tail = node;
		}
		else
		{
			node.next = this.head;
			this.head.prev = node;
			this.head = node;
		}
		this.size++;
	}
	
	public void addFirst(int val)
	{
		Node node = new Node(val);
		addFirstNode(node);
	}
	
	private Node removeFirst()
	{
		Node node = this.head;
		if(this.size==1)
		{
		 this.head=this.tail=null;
	    }
		else
		{
			Node farw = node.next;
			node.next = null;
			farw.prev = null;
			this.head = farw;
		}
	
	     this.size--;
	     return node;
	}
	
	
	
	
	
	
	
	
	
}
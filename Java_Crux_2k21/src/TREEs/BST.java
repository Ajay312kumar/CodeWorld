package TREEs;

public class BST {

	private class Node
	{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BST(int[] arr)
	{
		this.root = construct(arr, 0, arr.length-1);
	}
	
	private Node construct(int[] arr, int lo, int hi)
	{
		
//		Base case.
		if(lo > hi)
		{
			return null;
		}
		
//		find mid for root Node.
		int mid = (lo+hi)/2;
		
//		create a new node

		 Node nn = new Node();
		 nn.data = arr[mid];
		 nn.left = construct(arr, lo, mid-1);
		 nn.right  = construct(arr, mid+1, hi);
		 
		 return nn;
	}
	
	public void display()
	{
		display(this.root);
	}
	
	
	private void display(Node node)
	{
		if(node == null)
		{
			return;
		}
		
//		self work
		String str = "";
		if(node.left == null)
		{
			str += ".";
		}
		else
		{
			str += node.left.data;
		}
		str += " --> " + node.data + " <--";
		
		
		if(node.right == null)
		{
			str += ".";
		}
		else
		{
			str += node.right.data;
		}
		
		System.out.println(str);
		
		display(node.left);
		display(node.right);
	}
	
	public boolean find(int item)
	{
	  return find(this.root, item);
	}
	
	private boolean find(Node node, int item)
	{
		if(node == null)
		{
			return false;
		}
		if(item > node.data)
		{
			return find(node.right, item);
		}
		else if(item < node.data)
		{
			return find(node.left, item);
		}
		else
		{
			return true;
		}
	}
	
	public void add(int item)
	{
//		int item;
		add(this.root, item);
	}
	
	private void add(Node node,int item)
	{
		if(item > node.data)
		{
			if(node.right == null)
			{
				Node nn = new Node();
				nn.data=item;
				node.right = nn;
			}else {
				add(node.right, item);
			}
		}
		else
		{
			if(node.left==null)
			{
				Node nn= new Node();
				nn.data = item;
				node.left = nn;
			}
			else
			{
				add(node.left,item);
			}
		}
	}
	
	public void max()
	{
		max(this.root);
	}
	
	private int max(Node node)
	{
	    	if(node.right == null)
	    	{
	    		return node.data;
	    	}
	    	
	    	return max(node.right);
	}
	
	
	private void remove(int item)
	{
		remove(this.root, null,false, item);
	}
	
	public void remove(Node node,Node parent, boolean ilc,int item)
	{
		if(item > node.data)
		{
			remove(node.right, parent, false, item);
		}
		else if(item < node.data)
		{
			remove(node.left, parent, true, item);
		}
		else
		{
			if(node.left == null && node.right==null)
			{
				if(ilc)
				{
					parent.left=null;
				}
				else
				{
					parent.right=null;
				}
			}
			
			else if(node.left == null && node.right != null)
			{
				if(ilc)
				{
					parent.left = node.right;
				}
				else
				{
					parent.right = node.right;
				}
			}
			
			else if(node.left != null && node.right == null)
			{
				if(ilc)
				{
					parent.left = node.left;
				}
				else
				{
					parent.right = node.left;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

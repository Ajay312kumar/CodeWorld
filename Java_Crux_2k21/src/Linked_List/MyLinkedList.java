 package Linked_List;

public class MyLinkedList {
	
     class Node
     {
    	 int data;
    	 Node next;
    
     Node()
     {
    	 this(0);
     }
     Node(int data)
     {
    	 this(data,null); 
     }
     Node(int data,Node n)
     {
    	 this.data = data;
    	 this.next = null;
     }
 }
     private static Node head;
     private Node tail;
     private int size;
     
     public void display()
     {
    	 Node temp = head;
    	 while(temp != null)
    	 {
    		 System.out.print(temp.data+" ");
    		 temp =  temp.next;
    	 }
    	 System.out.println( );
     }
     
     public void addFirst(int ele)
     {
    	 Node n = new Node(ele,head);
    	 head = n;
     }
    
     public static int size()
     {
    	int count = 0;
    	Node temp = head;
    	while(temp != null)
    	{
    		count++;
    		temp = temp.next;
    	}
    	return count;
     }
     
      public boolean isEmpty()
     {
    	 return head == null;
     }
     
     public void addLast(int ele)
     {
    	 if(isEmpty())
    	 {
    		 addFirst(ele);
    		 return;
    	 }
    	 Node temp = getNodeAt(size()-1);
    	 while(temp.next != null)
    	 {
    		 temp = temp.next;
    	 }
    	 Node n = new Node(ele);
    	 temp.next = n;
     }
     
     public void addAt(int ele, int id) throws Exception
     {
    	 if(id < 0 || id > size())
    	 {
    		 throw new Exception("Invalid index");
    	 }
    	 if(id == 0)
    	 {
    		 addFirst(ele);
    		 return;
    	 }
    	 Node temp = getNodeAt(id-1);
    	 Node n = new Node(ele,temp.next);
    	 temp.next = n;
     }
     
     public int getFirst() throws Exception
     {
    	 if(isEmpty())
    	 {
    		 throw new Exception("List is empty");
    	 }
    	 return head.data;
     }
     
     public int getLast() throws Exception
     {
    	 if(isEmpty())
    	 {
    		 throw new Exception("list is empty");
    	 }
    	 Node temp = getNodeAt(size()-1);
    	 return temp.data;
     }
     
     public int getAt(int id) throws Exception
     {
    	 if(id < 0 || id > size())
    	 {
    		 throw new Exception("Invalid index");
    	 }
    	 Node temp = getNodeAt(id);
    	 return temp.data;
     }
     
     private Node getNodeAt(int id)
     {
    	 Node temp = head;
    	 while(id > 0)
    	 {
    		 temp = temp.next;
    		 id--;
    	 }
    	 return temp;
     }
     
     public int removeFirst() throws Exception
     {
    	 if(isEmpty())
    	 {
    		 throw new Exception("list is empty");
    	 }
    	 int td = head.data;
    	 head = head.next;
    	 return td;
     }
     
     public int removeLast() throws Exception
     {
    	 if(isEmpty())
    	 {
    		 throw new Exception("list is empty");
    	 }
    	 
    	 int s = size();
    	 if(s == 1)
    	 {
    		return removeFirst();
    	 }
    	 
    	 Node temp = getNodeAt(s-2);
    	 int td = temp.next.data;
    	 temp.next = null;
    	 return td;
     }
     
    public int removeAt(int id) throws Exception
    {
    	if(id < 0 || id > size())
   	    {
   		 throw new Exception("Invalid index");
    	}
    	
    	Node temp = getNodeAt(id-1);
    	int td = temp.next.data;
    	temp.next = temp.next.next;
    	return td;
    	
    }
       
    public void reverse()
    {
    	Node prev = null;
    	Node cur = head;
    	
    	while(cur != null)
    	{
    		Node ahead = cur.next;
    		cur.next =  prev;
    		prev = cur;
    		cur = ahead;
    		
    	}
    	head = prev;
    }
     
    public void reverseR()
    {
    	reverseRR(head,null);
    }
    
    private void reverseRR(Node cur, Node prev)
    {
    	if(cur == null)
    	{
    		head = prev;
    		return;
    	}
    	reverseRR(cur.next, cur);
    	cur.next = prev;
    }
     
    public static int mid()
    {
       Node slow = head;
       Node fast = head;
       while(fast != null && fast.next != null)
       {
    	  slow = slow.next;
    	  fast = fast.next.next;
       }
       return slow.data;
    }
     
    public static int kthsumFromLast(int k) throws Exception
    {
    	if(k <= 0 || k > size())
    	{
    		throw new Exception("invalid value of K");
    	}
    	
    	Node slow = head;
        Node fast = head;
        
        for(int i = 0; i < k; i++)
        {
        	 fast = fast.next;
        }
        
        while(fast != null)
        {
        	slow = slow.next;
            fast =	fast.next;
        }
//        return slow.data;
        int sum = 0;
        while(k < size())
        {
        	if(slow != null)
        	{
        		sum += slow.data;
        		slow = slow.next;
        	}
        	k++;
        }
        return sum;
    	
    }
     
//     public static int Add1(Node head)
//     {
//    	 Node head = reverse(head);
//    	 Node curr = head, prev = head;
//    	 int sum = curr.data+1;
//    	 curr.data = sum % 10;
//    	 int carry = sum / 10;
//    	 curr = curr.next;
//    	 
//    	 while(curr!=null)
//    	 {
//    		 sum = curr.data + carry;
//    		 curr.data = sum % 10;
//    		 carry = sum / 10;
//    		 prev = curr;
//    		 curr = curr.next;
//    	 }
//    	 
//    	 if(carry!=0)
//    	 {
//    		 prev.next = new Node(carry);
//    		 
//    	 }
//    	 head = reverse(head);
//    	 return head1;
//    	 
//     }
//    
    
    
}
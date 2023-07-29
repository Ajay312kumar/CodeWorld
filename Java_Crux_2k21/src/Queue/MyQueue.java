package Queue;

public class MyQueue {
protected int[] arr;
protected int front;
protected int size;
 public MyQueue(int n)
 {
	 arr = new int[n];
	 front = 0;
	 size = 0;
 }
  public MyQueue()
  {
	  this(10);
  }
  public boolean isFull()
  {
	  if(size == arr.length)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }  
	  public boolean isEmpty()
	  {
		  if(size == 0)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	  public int size()
	  {
		  return size;
	  }
	  public void enqueue(int ele) throws Exception
	  {
		  if(isFull())
		  {
			  throw new Exception("Queue overflow");
		  }
		  arr[(front + size)% arr.length] = ele;
		  size++;
	  }
	  public int peek() throws Exception
	  {
		 if(isFull())
		 {
			 throw new Exception("Queue overflow");
		 }
		 return arr[front];
	  }
	  public int dequeue() throws Exception
	  {
		  if(isEmpty())
		  {
			  throw new Exception("Queue overflow"); 
		  }
		  int ele = arr[front];
		  front = (front+1)%arr.length;
		  size--;
		  return ele;
	  }
	  public void display()
	  {
		  for(int i = 1; i <= 5; i++)
		  {
			  System.out.print(arr[i%arr.length]+" ");
		  }
		  System.out.println();
	  }
  }


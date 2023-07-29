package Queue;

import stack.DynamicStack;
//import queue.DynamicQueue;
public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	DynamicQueue qt = new DynamicQueue();
	for(int i = 1; i <= 5; i++)
	{
		qt.enqueue(i);
	}
	qt.display();
	ar(qt);
	qt.display();	
	}

	public static void ar(DynamicQueue qt) throws Exception
	{
		DynamicStack st = new DynamicStack();
		while(!qt.isEmpty())
		{
			st.push(qt.dequeue());
		}
		while(!st.isEmpty())
		{
			qt.enqueue(st.pop());
			
		}
	}
	
}

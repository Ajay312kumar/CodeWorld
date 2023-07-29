package stack;

import Queue.DynamicQueue;
import Queue.MyQueue;

public class DSClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//     MyStack st = new DynamicStack();
//     for(int i = 1; i <= 20; i++)
//     {
//    	 st.push(i);
//    	 st.display();
//     }
//     
//     st.pop();
//     st.display();
		
		
		MyQueue qt = new DynamicQueue();
		for(int i = 1; i <= 20; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

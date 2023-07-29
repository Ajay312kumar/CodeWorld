package stack;

public class Stack_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    DynamicStack st = new DynamicStack();
		for(int i = 1; i <= 5; i++)
			st.push(i);
		   	
//		st.display();
//		displayReverse(st);
//		st.display();
		
		reverserec(st);
		st.display();
	}

	public static void displayReverse(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		temp.display();
		
		while(!temp.isEmpty())
		{
			st.push(temp.pop());
		}
	}
	
	public static void reverserec(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
		   return;	
		}
		else
		{
			int n = st.pop();
			reverserec(st);
			System.out.println(n);
			st.push(n);
		}
	}
	
}

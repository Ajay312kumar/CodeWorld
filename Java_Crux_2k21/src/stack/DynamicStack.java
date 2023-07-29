package stack;

public class DynamicStack extends MyStack{

	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			int[] newarr = new int[arr.length*2];
			for(int i = 0; i <= top; i++)
			{
				newarr[i]  = arr[i];
			}
			arr = newarr;    //passing the address of newarr into  the arr.
		}
		super.push(ele);
	}
}


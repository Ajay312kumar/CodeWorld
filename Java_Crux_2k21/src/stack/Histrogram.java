package stack;

import java.util.Stack;

public class Histrogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int[] arr = {6,2,5,4,5,1,6};
		maxArea(arr);
	}
	
	public static void maxArea(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		int max = 0;
		for(int i = 0; i <arr.length; i++)
		{
			while(!st.isEmpty() && arr[i] < arr[st.peek()]) 
			{
				int ans = st.pop();
				int j;
				if(st.isEmpty())
					j = -1;
				else
					j = st.peek();
				int area = (i-j-1)*arr[ans];
				if(area > max)
						max = area;
				}
			st.push(i);
			}
		while(!st.isEmpty())
		{
			int ans = st.pop();
			int j;
				if(st.isEmpty())
					j = -1;
				else
					j = st.peek();
				int area = (arr.length-j-1)*arr[ans];
				if(area > max)
					max = area;
		  }
		System.out.println("Max area :"+ max);
		}
	}



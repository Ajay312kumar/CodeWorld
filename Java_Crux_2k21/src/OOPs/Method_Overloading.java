package OOPs;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
	}
		
		public static int sum(int a, int b)
		{
			return a+b;
		}
		
		public static int  sum(int a, int b, int c)
		{
			return a+b+c;
		}
	}



package Recursion;

//import com.sun.tools.sjavac.server.SysInfo;

public class Lexographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           for(int i = 1; i <= 9; i++)
        	   lexo(10,i);
	}
        public static int lexo(int n, int count)
        {
        	if(count > n)
        	{
        		return n;
        	}
        	else
        	{
        		System.out.println(count);
        		for(int i = 0; i <= 9; i++)
        		{
        		 return	lexo(n, count*10+i);
        		}
        	}
			return count;
        }
}

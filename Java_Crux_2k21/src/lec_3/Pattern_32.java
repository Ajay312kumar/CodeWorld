package lec_3;
import java.util.Scanner;
public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2*n-1;
        int nst = 1;
        int val ;
        int row = 1;
        while(row <= nr)
        {
        	if(row <= nr/2+1)
        	{
        		val = row;
        	}
        	else
        	{
        		val = nr - row + 1;
        	}
        	
        	
        	
//        	 val = row;
        	int cst = 1;
        	while(cst <= nst)
        	{
        		if(cst %2 == 0)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(val);
        		}
        		cst++;
        		
        	}
        	System.out.println();
        	nst++;
        	row++;
        	
        	
        }
	
	}

}

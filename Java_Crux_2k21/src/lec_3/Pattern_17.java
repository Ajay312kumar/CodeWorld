package lec_3;
import java.util.Scanner;
public class Pattern_17 {
	
	
//	**** ****
//	***   ***
//	**     **
//	*       *
//	         
//	*       *
//	**     **
//	***   ***
//	**** ****
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row  = 1;
		int nsp = 1;
		int nst = n/2;
		while(row <= n)
		{
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("*");
			}
			
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print(" ");
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("*");
			}
			
			System.out.println();
				if(row <= n/2)
				{
					nst = nst-1;
					nsp = nsp+2;
				}
				else
				{
					nst = nst+1;
					nsp = nsp-2;
				}
				row++;
		}
		
	}

}

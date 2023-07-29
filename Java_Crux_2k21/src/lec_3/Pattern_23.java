package lec_3;

public class Pattern_23 {
	
	
//	
//	    1
//     111
//    11111
//   1111111
//  111111111
// 11111111111
//1111111111111
//	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row =1 ;
		int nst  = 1;
		int n = 7;
//		int val = 1;
		int nsp = n-1;
		while(row <= n)
		{
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print(" ");
			}
			
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
			nst = nst+2;
			nsp--;
//			val++;
		}
		
		
	}

}

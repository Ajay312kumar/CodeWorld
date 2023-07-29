package lec_3;
 import java.util.Scanner;
public class PatternWithZero {
	
//	1
//	22
//	303
//	4004
//	50005


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
	//	int val =1;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				if(cst == 1 || cst == nst)
				{
					System.out.print(val);
				}
				else
				{
				  System.out.print("0");	
				}
				cst++;
				//val++;
			}
			System.out.println();
			nst++;
			if(row >= val)
			{
				val++;
				row++;
			}
			
		}
 
	}

}

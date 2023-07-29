package Lec_6;
import java.util.Scanner;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int val = 1;
    int nst = 1;
    while(row < n)
    {
       int cst = 0;
       while(cst < nst)
       {
    	   System.out.print(val+" ");
    	   cst++;
    	   val = (row-cst+1)*val/cst;
       }
       row++;
       nst++;
       val = 1;
       System.out.println();
    }
	}

}

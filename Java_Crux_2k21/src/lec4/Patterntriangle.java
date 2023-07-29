package lec4;
 import java.util.Scanner; 
public class Patterntriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int nst = 1;
     int nsp  = n-1;
     int row = 1;
     int val = 1;
     while(row<=n)
     {
    	 int csp = 1; 
     while(csp<=nsp)
     {
    	 System.out.print(" ");
    	 csp++;
     }
      int cst = 1;
      while(cst<=nst)
      {   
    	  System.out.print(val);
         if(cst<=nst/2)
    	 {
    		 val++;
    	 }
    	 else
    	 {
    		 val--;
    	 }
    	 cst++;
     }
    }
     val += 2;
     nst += 2;
     nsp -= 1;
     row++;
     System.out.println();
     }
   }

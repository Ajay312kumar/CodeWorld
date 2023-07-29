package lec_3;
 //import java.util.Scanner;
public class MountainStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		int R = 5; 
      int row = 1;
      int nst = 1;
      while(row < R)
      {
    	  int cst = 1;
    	  while(cst <= nst )
          {
    		  System.out.print("*");
    		  cst++;
          }
    	  if(row == R)
    	  {
    		   cst = 1;
    		  while(cst <= 5)
    		  {
    		  System.out.print("*");
    	     }
      } 
	
      }
      }

}

package QuadratricEquation;
 import java.util.Scanner;
public class quadratric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Eneter the coefficient of a , b , and c");
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   double det = (b*b)-(4*a*c);
   double sqrt = Math.sqrt(det);
   int r1 = (int)(-b+sqrt)/(2*a);
   int r2 = (int)(-b-sqrt)/(2*a);
   
   if(det > 0)
   {
	  System.out.println("Real and Distinct");
	  if(r1 > r2)
	  {
		  System.out.println(r2 +" "+r1);
	  }
	  else
	  {
		  System.out.println(r1 +" "+r2);
	  }
   }
   else if(det == 0)
   {
	   System.out.println("Real and Equal"); 
		System.out.println(r1+" "+r2);
	}
   else
   {
	   System.out.println("imaginary");
   }
   }
	

}

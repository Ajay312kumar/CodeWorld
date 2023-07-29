package String;
import java.util.Scanner;
public class sumofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
   String st = sc.nextLine();
   int num = Integer.parseInt(st);
   sum(num);
	}
         public static void sum(int num)
         {     
        	 int sum = 0;
        	while(num > 0)
        	{
        		int r = num % 10;
        	    num = num / 10;
        		sum = sum + r;
        	}
        	 System.out.println(sum);
         }
}

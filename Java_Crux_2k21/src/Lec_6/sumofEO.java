package Lec_6;
import java.util.Scanner;
public class sumofEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int sum = 0;
    int evensum = 0;
    int oddsum = 0;
    int pos = 0;
    while(input != 0)
    {
    	int rem = input % 10;
    	pos++;
    	if(pos % 2 == 0)
    	{
    		evensum = evensum + rem;
    	}
    	else
    	{
    		oddsum = oddsum + rem;
    	}
    	input = input / 10;
    }
      System.out.println(evensum);
      System.out.println(oddsum);
	}

}

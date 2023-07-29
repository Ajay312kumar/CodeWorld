package lac_2;
 import java.util.Scanner;
public class greaterNo {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int max = Integer.MIN_VALUE;
     int i = 1;
     while(i <= n)
     {
    	int b = sc.nextInt();
    	if(b>max)
    	{
    		max = b;
    	}
    	i++;
     }
     System.out.println(max);
	}

}

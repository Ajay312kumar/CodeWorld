package Array;
 import java.util.ArrayList;
import java.util.Scanner;
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for(int j = 0; j < n; j++)
		{
			b[j] = sc.nextInt();
		}
           ArrayList <Integer> al = new ArrayList <Integer>();
           int i = 0;
           int j = 0;
           while(i < a.length && j < b.length)
           {
        	   if(a[i] == b[j])
        	   {
        		   al.add(a[i]);
        		   i++;
        		   j++;
        	   }
        	   else if(a[i] < b[j])
        	   {
        		   i++;
        	   }
        	   else
        	   {
        		   j++;
        	   }
           }
            System.out.println(al);
	}
}

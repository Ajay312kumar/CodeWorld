package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
	int x=0,y=0;
	while(t>0)
	{
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m= sc.nextInt();
		int min= Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==m)
				{
					int d= Math.abs(a[i]-a[j]);
					if(d<min)
					{
						min=d;
						x=a[i];
						y=a[j];
					}
				}
			}
		}
		int s=Math.max(x, y);
		int u=Math.min(x, y);
		System.out.println("Deepak should buy roses whose prices are "+u+" and "+s+".");
		

		t--;
	}
}
	
	}



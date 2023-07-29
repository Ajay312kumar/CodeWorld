package lec4;
  import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{ 
		   n = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{ 
		int ans = 0;
		
		int multi = 1;
		while( n!=0)
		{
			int rem = n%10;
			ans = rem * multi + ans;
			n = n / 10;
			multi = multi * 2;
		}
			
		System.out.println(ans);
		}
	}
	}


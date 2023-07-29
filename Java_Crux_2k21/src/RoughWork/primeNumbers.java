package RoughWork;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		for(int no = 1; no <= 100; no++)
		{
			
			for(int i = 2; i<= no-1; i++)
			{
				if(no % i==0)
				{
					flag = flag+1;
				}
			}
			if(flag == 0)
			{
				System.out.println(no);
			}
			else
			{
				flag=0;
			}
		}
		
		
	}

}

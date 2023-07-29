package lac_2;

public class check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag = 1;
		int nn = 15;
		for(int i = 2; i < nn; i++)
		{
			if(nn % i == 0)
			{
				flag = 0;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
		
	}

}

package Array_2D;



public class count_Max_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  n = 4, m = 4;
		int mat[][] = { {0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        System.out.print("the row is based on zero index = ");
		System.out.println(rowMax1(mat, n, m));
		
		              
	}

	public static int rowMax1(int mat[][], int n, int m)
	{
		int res = 0, ind = -1;
		for(int i=0; i<n; i++)
		{
			int count=0;
			int max=0;
			for(int j=0; j<m; j++)
			{
				if(mat[i][j] == 1)
				{
					count++;
					max = Math.max(max, count);
				}
				else
				{
					count = 0;
				}
			}
			if(res < count)
			{
				res = count;
				ind = i;
			}
		}
		return ind;
	}
	 
}

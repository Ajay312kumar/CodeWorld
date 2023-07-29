package Array_2D;

public class Search_AnElement {

	static int r=4, c=4;
	
	public static void Search(int mat[][], int x)
	{
		int i = 0;
		int j = c-1;
		
		while(i<r && j>=0)
		{
			if(mat[i][j] == x)
			{
				System.out.print("the "+ x +" is found at ("+ i + " "+ j+")");
			    return;
			}
			else if(mat[i][j] > x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.print("not found "+ x);
	}
	
	
	
	
	public static void main(String[] args) {
		
		int mat[][] = {{10, 20, 30, 40},
				       {15, 25, 35, 45},
				       {27, 29, 35, 45},
				       {32, 33, 39, 50}};
		
		int x = 29;
		Search(mat, x);

	}

}

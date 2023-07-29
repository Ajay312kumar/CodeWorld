package Array_2D;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16} };
		Transpose(arr);
		display(arr);
		
	}
	public static void Transpose(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int t = arr[i][j];
				arr[i][j] =  arr[j][i];
				arr[j][i] = t;
			}
		}
	}
	 public static void display(int[][] arr)
	 {
		 for(int[] val : arr)
		 {
			 for(int i : val)
			 {
			    System.out.print(i+" "); 
		    }
		    System.out.println();
	 }
	
	 }
}

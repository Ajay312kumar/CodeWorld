package Array_2D;
import java.util.Scanner;
public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n =  sc.nextInt();
   int m =  sc.nextInt();
   int[][] arr = new int[n][m];
   for(int i = 0; i < n; i++)
   {
	   for(int j = 0; j < m; j++)
	   {    
	     arr[i][j] = sc.nextInt();
       }
	}
    System.out.println("the rotate array is:");
    for(int col = m; col > 0; col--)
    {
    	for(int row = 0; row <= col; row++)
    	{
    		System.out.println(arr[col][row]+" ");
    	}
    }
   
   
	}
}

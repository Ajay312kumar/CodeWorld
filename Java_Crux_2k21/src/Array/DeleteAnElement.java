package Array;
//import java.util.Scanner;
public class DeleteAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // Scanner sc = new Scanner(System.in);
     int[] array = {1,2,3,4,5};
     int ele = 4;
     for(int i = 0; i < array.length-1; i++)
     {
    	 if(array[i] == ele)
    	 {
    		 i++;
    	 }
    	 System.out.println(array[i]);
     }
	}

}

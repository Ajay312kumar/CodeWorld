package Recursion;

public class PrintAllOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,2,3,2,5,2,4,2,6};
    int ele = 2;
    printAlloc(arr,0,ele);
	}

	public static void printAlloc(int[] arr, int id, int ele)
	{
		if(id == arr.length)
		{
			return;
		}
		else
		{
			if(arr[id] == ele)		
			System.out.print(" "+id);
			printAlloc(arr,id+1,ele);
		}
	}
}

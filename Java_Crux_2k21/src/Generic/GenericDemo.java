package Generic;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr1[] = {1,2,3,4,5};
		String arr2[] = {"hii", "I", "am", "generic"};
		
		display(arr1);
		display(arr2);
		
		
	}
	
	public static <T>  void display(T[] arr)
	{
		for(T val : arr)
		{
			System.out.println(val);
		}
		System.out.println();
	}
	

}

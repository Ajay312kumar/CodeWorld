package String;

public class StringTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "";
	long start = System.currentTimeMillis();
	for(int i = 1; i <= 100000; i++)
	{
		s += "a";
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	}

}

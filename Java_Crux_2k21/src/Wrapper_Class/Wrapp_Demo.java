package Wrapper_Class;

public class Wrapp_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i= new Integer(10);
		i=5;
		System.out.println(i);
		
		
		int m = 10;
		Integer n = m;
		System.out.println(n);
		
		Float h=Float.valueOf("123.4");
		float x=h.floatValue();
		System.out.println(x);
		
		
		System.out.println("------------------");
		System.out.println(StrictMath.abs(-123.4));
		System.out.println(Math.log10(100));
	    System.out.println(Math.toRadians(90));
	    System.out.println(Math.random()*10);
	    int min=Integer.MIN_VALUE;
	    System.out.println(min);
	    
	}

}

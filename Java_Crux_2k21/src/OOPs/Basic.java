package OOPs;

public class Basic {

	public static void as()
	{
		System.out.println(as(4));
	}

	private static int as(int w)
	{
		return w;
	}
	
	
	
	
	public static void main(String[] args)
	{
//		System.out.println("main function");
		Basic vv =new Basic();
		vv.as();
		
//        B sb =  new B();
//        System.out.println(sb.a);
//        A b =  new A();
//        System.out.println(b.a);   ----> parent class can't access data member of child class
	}
	}


class A
{
	
	int b = 110;
	String st = "ajay"; 

public void eat()
{
	System.out.println("eat");
}
}
class B extends A
{
	
	int a = 10;
	String st = "ajay"; 

public void eat()
{
	System.out.println("eat");
}
}
	
	


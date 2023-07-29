package String;

public class BasicString<S> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // String s4 = new String("abc");
   //String s2 = new String("abc");
  // System.out.println(s4 == s2);
    String s = "hellollolll";
    String s1 = "abc";
    String s3 = "abc";
    String cd = "abc";
    System.out.println("----------Immatuble Conept------------------");
    s3 = s3+"d";
    System.out.println(s1);
   System.out.println(s3);
   String a = "asd";
    a = "edf";
    System.out.println(a);
	
    
	System.out.println("----------String length------------------");
      System.out.println(s3.length());
      System.out.println((int)s.charAt(0));
      System.out.println(s.charAt(0));
      System.out.println("----SubString----");
      System.out.println(s.substring(0,1));
      
      
   
	System.out.println(s.replace("ll", "r"));  
	
	System.out.println("----------character array to string:---------------");
	char[] ch = {'A','B','C'};
	String st = new String(ch);
	System.out.println(ch);
	
	System.out.println("-----remove space----");
	String a1 = "    welcome     ";
	System.out.println(a1);
	System.out.println(a1.trim());
	
	System.out.println("-----Matching string---------");
	String b = "Q";
	System.out.println(b.matches("[a-g]"));
	
	String c = new String("java ");
	c = c.concat("is very good language.");
	System.out.println(c);
	
	String d = new String("");
	System.out.println(d);
	
	int[] arr = new int[2];
	System.out.println(arr);
	
	String ee = "  ajay  ";
	System.out.println(ee);
	System.out.println(ee.trim());
	}
}
	


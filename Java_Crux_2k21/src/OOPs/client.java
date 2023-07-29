package OOPs;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student();
         System.out.println(s);
         s.name="Amit";
         s.age=22;
         System.out.println(s.age);
         System.out.println(s.name);
         
         Student s1 = s;
         System.out.println(s1);
         System.out.println(s1.age);
         System.out.println(s1.name);
         
         s1.name="vikas";
         s1.age=11;
         System.out.println(s1.age);
         System.out.println(s1.name);
         System.out.println(s.age);
         System.out.println(s.name);
	}

}

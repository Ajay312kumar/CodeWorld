package Access_Modifier;

public class StrudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1 = new Student();
          s1.name = "java";
//          s1.rollNumber = 11;
          s1.setRollNumber(-123);
//          
//          Student s2 = new Student();
//          s2.name = "arsh";
//          s2.rollNumber = 121;
          System.out.println(s1.getRollNumber());
//          System.out.println(s2.name);
	}

}

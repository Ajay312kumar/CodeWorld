package Access_Modifier;

public class Student {
 
	public String name = "Ajay";
	private int rollNumber=10;
	 
	 public void setRollNumber(int rn)
	 {
		 if(rn <= 0)   //if rollNumber is negative than we can't change.
		 {
			 return;
		 }
	   rollNumber = rn;  // if rollNumber is positive than we are able to change the rollNumber.
	 }
	 
	 public int getRollNumber()
	 {
		 return rollNumber;
	 }
}

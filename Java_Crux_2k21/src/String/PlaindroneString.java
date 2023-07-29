package String;

public class PlaindroneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(isPlaindrone("nitin"));
	}
     public static boolean isPlaindrone(String s)
     {
	 int i = 0;
	 int j = s.length()-1;
	 
	 while(i < j)
	 {
		 if(s.charAt(i) != s.charAt(j))
		    return false;
		  
		 i++;
		  j--;
	 }
	 return true;
     
	}

}

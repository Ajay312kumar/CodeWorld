package RoughWork;

public class first_non_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
          String str = "hello";
         char s = 0;
	     for(int i = 0; i < str.length(); i++)
	     {
	    	s = str.charAt(i);
	    	 for(int j = i+1; j < str.length(); j++)
	    	 {
	    		 if(str.charAt(i)!=str.charAt(j))
	    		 {
	    			 continue;
	    		 }
	    		 else
	    		 {
	    			 break;
	    		 }
	    	 }
	     
	    	
	     }
	     System.out.println(str.charAt(s));
	}

}

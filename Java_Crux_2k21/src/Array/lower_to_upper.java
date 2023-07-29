package Array;

public class lower_to_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String input = "TAKE_this_input";
		String result = "";
		
		char c[] = input.toCharArray();
		int i=0;
         while(i<c.length)
	    {
        	 i++;
	    	if(c[i] == '_')
	    	{
	    		i++;
//	    		if(c[i] == input.charAt(i).toLowerCase());
	    		{
	    			result += c[i];
	    		}
	    	}
	    }
	
	}

}

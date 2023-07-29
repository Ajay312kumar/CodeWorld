package Array;

public class indexFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int ele = 2;
   int pos = 0;
    
    int[] arr = {3,2,1,2,2};
    for(int i = 0; i < arr.length; i++)
    {
    	if(arr[i] == ele)
    	{
    		
    		pos = i;
    		break;
    	}
    }
    	System.out.println("first index of "+ele +" is "+ pos);
    }
	}


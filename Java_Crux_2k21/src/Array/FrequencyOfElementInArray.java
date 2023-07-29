package Array;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {0,1,2,3,4,5,0,0,3,4,5};
		int n=nums.length;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for( int i=0;i<n;i++) {
			
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
			
		}
		
		
		System.out.println(min+" " +max);
		int[]a=new int[max-min+1];
		
		for(int i=0;i<nums.length;i++) {
			a[nums[i]-min]++;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println(i+min+" occurs "+ a[i]+" times ");
			}
		}

	}

}

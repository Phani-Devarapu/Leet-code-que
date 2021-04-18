
public class FindtheMissingNumArray {

	
	
	
	public void missingNum()
	{
		int[] nums= {0};
		
		int n = nums.length;
		int sum  = n*(n+1)/2;
		
		for(int i=0; i<nums.length;i++)
		{
			sum = sum-nums[i];	
		}
		
		System.out.println(sum);
		
	}
	
}

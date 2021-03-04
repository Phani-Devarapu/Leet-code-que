
public class MaximumSubArray {
	
	
	public void subarray()
	{
		int array[] = {-3,1,-8,4,-1,2,1,-5,5};
		
		int sumAtIndex =0;
		int maxSoFar =Integer.MIN_VALUE;
		int start =0;
		int end=0;
		
		for(int i=0;i<array.length;i++)
		{
			int temp = array[i]+ sumAtIndex;
			
			if(array[i]<temp)
			{
				sumAtIndex = temp;
				
			}
			else
			{
				sumAtIndex = array[i];
				start = i;
			}
			
			if(maxSoFar < sumAtIndex)
			{
				maxSoFar = sumAtIndex;
				end =i;
			}
			
			
			
		}
		
		System.out.println(start + " " + end);
		System.out.println(maxSoFar);
	}
		
	
	public int subarraywithourPositions()
	{
		int array[] = {-3,1,-8,4,-1,2,1,-5,5};
		int sumAtIndex =0;
		int maxSoFar =Integer.MIN_VALUE;
		int start =0;
		int end=0;
		
		for(int i=0;i<array.length;i++)
		{
			int temp = array[i]+ sumAtIndex;
			sumAtIndex = Math.max(temp, array[i]);
			maxSoFar = Math.max(sumAtIndex, maxSoFar);
			
		
		}
		return maxSoFar;
		
	}
	
	
	
	

}


public class TwoSum {
	
	
	
	public void twoSum()
	{
		int numArry[] = {-1,-2,-3,-4,-5};
		int target = -8;
		int index1 = 0;
		int index2 = 0;
		
		
		for(int i =0; i<=numArry.length-1;i++)
		{
			if(numArry[i]<=target)
			{
				int temp = target -numArry[i];
				
				for(int j=i+1;j<=numArry.length-1;j++)
				{
					if(temp==numArry[j])
					{
						index2 = j;
						index1=i;
					}
				}
				
			}
		}
		
		System.out.println(index1 + " " + index2);
		
		
		 int output[] = new int[2];
	}
	
	
	public void twoSum2()
	{
		int numArry[] = {0,4,3,0};
		int target = 0;
		int index1 = 0;
		int index2 = 0;
		
		for(int i=0;i<=numArry.length-1;i++)
		{
			for(int j=i+1;j<=numArry.length-1;j++)
			{
				if(target==(numArry[i]+numArry[j]))
				{
					index2 = j;
					index1=i;
				}
			}
		}
		
		System.out.println(index1 + " " + index2);
		
	}

}

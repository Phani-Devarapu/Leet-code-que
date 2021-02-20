
public class ShiftingZeros {
	
	//int array1[] = {0,0,1};    
	
	int array1[] = {0,0};    
	
	
	public void shiftZeos()
	{
	
		for(int i =0 ; i< array1.length;i++)
		{
			while(array1[i]==0)
			{
				
				for(int j =i ;j<array1.length ;j++)
				{
					int temp = array1[j];
					if((j+1)<array1.length)
					{
						array1[j] = array1[j+1];
						array1[j+1] = temp;
					}
					
				}
				
			}
		}
		
		for(int k=0 ;k< array1.length;k++)
		{
			System.out.println(array1[k]);
			
		}
	}
	
	
	public void shiftZeros2()
	{
		int zeros =0;
		int j =0;
		for(int i=0;i<array1.length;i++)
		{
			
			
			if(array1[i]==0)
			{
				zeros++;
				
			}
			else
			{
				array1[j] = array1[i];
				j++;
			}
		}
		
	
		
		for(int z=1 ; z<=zeros ; z++)
		{
			int len  = array1.length;
			array1[len-z]= 0;
		}
		
		for(int k=0;k<array1.length;k++)
		{
			System.out.println(array1[k]);
		}
	}
	
	
	public int[] remove(int[] array1, int index )
	{
		for(int j=index;j< array1.length;j++)
		{
			if((j+1)<array1.length)
			{
				array1[j]=array1[j+1];
			}
		}
		
		 return array1;
	}

}

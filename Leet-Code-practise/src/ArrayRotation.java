import java.lang.reflect.Array;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayRotation {
	
	
	public void arrayRotation(int a)
	{
	 
		int[] ary = {1,2,3,4,5};
		
		
		for(int k=1;k<=a;k++)
		{
			int temp =ary[0];
			for(int i=0;i<ary.length;i++)
			{		
			if((i+1)<ary.length) ary[i] = ary[i+1];
			}
			
			ary[ary.length-1] = temp;
			
		}
		
		for(int i=0;i<ary.length;i++)
		{
			System.out.println(ary[i]);
		}
		
		
		
	}
	
	
	
	
	
	

	
	
			

}

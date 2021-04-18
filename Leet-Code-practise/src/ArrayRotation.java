import java.lang.reflect.Array;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayRotation {
	
	
	public void arrayRotation(int a)
	{
	 //right rotation
		
		int nums[] = {-1,-100,3,99};
		//int nums[] = {-1,-100,3,99};
		
		int lastEle = nums.length-1;
		
		//withOher array
		int numsDupli[] = new int[nums.length];
		
		for(int i=0; i<a ;i++)
		{
			numsDupli[a-i-1] = nums[lastEle-i];
	
		}
		
		for(int k=0;k<nums.length-a;k++)
		{
			numsDupli[a+k] = nums[k];
		}
		
		for(int j=0; j<numsDupli.length;j++)
		{
			System.out.println(numsDupli[j]);
		}
		
		
		
		
	}
	
	
	public void arrayRotaionWitnin(int a)
	{
		int nums[] = {1,2,3,4,5,6,7};
		int lastEle =nums.length-1;
		
		int[] numsDupli = new int[a];
		
		for(int i=0;i<a;i++)
		{
			numsDupli[i] = nums[lastEle-i];
			nums[lastEle-i] = nums[lastEle-i-1];
		}
		
		for(int l=0;l<a ;l++)
		{ 
			nums[l] = numsDupli[numsDupli.length-l-1];
		}
		
		
		for(int j=0;j<nums.length;j++)
		{
			System.out.println(nums[j]);
		}
		
			
		
		
	}
	
	
	
	public void checking()
	{
		Employee e1 = new Employee(1, "Phani");
		Employee e2 = new Employee(1, "Phani");
		
		String s1 = new String();
		String s2 = new String();
		
		String s3 = "Phani";
		String s4 ="Phani";
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println("----------------");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	}
	
	
	
			

}

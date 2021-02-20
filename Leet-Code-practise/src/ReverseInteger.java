
public class ReverseInteger {
	
	
	int result;
	String str="";
	int negative=0;
	
	public int reverseInt(long x)
	{
		if(x<0)
		{
			x = (-1)*x;
			negative=1;
		}
		
		
		
		
		if(x==0 || (x< ((-1)*(Math.pow(2, 31)))) || (x>=(Math.pow(2, 31)-1)))
		{
			return (int) x;
		}
	
		
		while(x>0)
		{
			int temp = (int) (x%10);
			str = str+temp;
			x = x/10;
		}
		
		if(negative==1) return (int) ((-1)*(Long.parseLong(str)));
		else return Integer.parseInt(str);
		
		
	}
    
	public int reverseInt2(int x)
	{
		int result =0;
		long  er = 543;
		
		
		
		while(x!=0)
		{
			int temp = x%10;
			result = (result*10) + temp;
			x = x/10;
		}
		
		
		if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
		else return result;
		
		
	
	
	}
}

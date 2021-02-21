
public class PalindromeNum {
	
	public boolean isPalindrome(int x)
	{
		int numRev=0;
		int orginNum =x;
		if( x < 0)
		{
			return false;
		}
		
		while(x!=0)
		{
			int temp = x%10;
			numRev = numRev*10 + temp;
			x=x/10;
		}
		
		if(orginNum == numRev) return true;
		else return false;
	
	}

}

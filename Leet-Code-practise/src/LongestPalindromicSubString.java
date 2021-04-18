import java.util.ArrayList;

public class LongestPalindromicSubString {
	
	int length=0;
	int indexStart;
	int indetEnd;
	
	public void palin()
	{
		String s ="0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
		String result;
		
		char[] charArray = s.toCharArray();
		
		ArrayList<Character> dupleChar = new ArrayList<Character>();
		
		for(int k=0;k<charArray.length;k++)
		{
			dupleChar.clear();
			for(int i=k;i<charArray.length;i++)
			{
				dupleChar.add(charArray[i]) ;
				//checkPalin(dupleChar);
				
				boolean isPalin = true;
				if(dupleChar.size()==1)
				{
					
					
				}
				else
				{
					int len = dupleChar.size();
					
					if(len%2 ==0)
					{
						for(int j=0; j<len;j++)
						{
							if(!(dupleChar.get(j)==dupleChar.get(len-j-1))) 
							{
								isPalin = false;
								break;
							}
							
						}
					}
					else
					{
						for(int j=0; j<len;j++)
						{
							if(!(j==len/2))
							{
								if(!(dupleChar.get(j)==dupleChar.get(len-j-1))) 
								{
									isPalin = false;
									break;
								}
								
							}
							
						}
					}
					
				}
				
				if(isPalin)
				{
					
						if(dupleChar.size()>length)
						{
							length = dupleChar.size();
							result = String.valueOf(dupleChar);
							
							StringBuilder builder = new StringBuilder(dupleChar.size());
						    for(Character ch: dupleChar)
						    {
						        builder.append(ch);
						    }
						  
							
							System.out.println(builder.toString());
						}
					
					
				}
			}
		}
		
		
		
		
	}
//	
//	public void checkPalin(ArrayList<Character> dupleChar)
//	{
//		boolean isPalin = true;
//		if(dupleChar.size()==1)
//		{
//			
//			
//		}
//		else
//		{
//			int len = dupleChar.size();
//			
//			if(len%2 ==0)
//			{
//				for(int j=0; j<len;j++)
//				{
//					if(!(dupleChar.get(j)==dupleChar.get(len-j-1))) 
//					{
//						isPalin = false;
//						break;
//					}
//					
//				}
//			}
//			else
//			{
//				for(int j=0; j<len;j++)
//				{
//					if(!(j==len/2))
//					{
//						if(!(dupleChar.get(j)==dupleChar.get(len-0-1))) 
//						{
//							isPalin = false;
//							break;
//						}
//						
//					}
//					
//				}
//			}
//			
//		}
//		
//		if(isPalin)
//		{
//			
//				if(dupleChar.size()>length)
//				{
//					length = dupleChar.size();
//					String str = dupleChar.toString();
//					System.out.println(str);
//				}
//			
//			
//		}
//	}
	
	
	public String PalinDronmeMeth2(String s)
	{
		
		int len = s.length();
		
		for(int i =0; i<s.length();i++)
		{
			checkPalin(s,i,i);
			checkPalin(s,i,i+1);
		}
		System.out.println(indexStart);
		System.out.println(length);
		return s.substring(indexStart, indexStart+length);
			
	}
	
	public void checkPalin(String s, int start, int end)
	{
		while(start>=0&&end<s.length()&& s.charAt(start)==s.charAt(end)) {
		
			start--;
			end++;
		}
		
		if(length <end-start-1)
		{
			indexStart= start+1;
			length = end-start-1;
		}
	}

}

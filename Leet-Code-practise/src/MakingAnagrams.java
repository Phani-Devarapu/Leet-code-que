import java.util.HashMap;

public class MakingAnagrams {
	
	static HashMap<Character,Integer> aHashmap = new HashMap<Character, Integer>();
	static HashMap<Character,Integer> bHashmap = new HashMap<Character, Integer>();
	
	public static  void anagrams(String a , String b)
	{
		
		aHashmap.clear();
		bHashmap.clear();

//		
//		for(int i=0; i<maxLen;i++)
//		{
//			//if(i<lenA && !(aHashmap.containsKey(a.charAt(i))))
//		}
		
		wordCount(a,aHashmap);
		wordCount(b,bHashmap);
		
		int lenA = a.length();
		int lenB =b.length();
		int count=0;
	
		
		
		for(Character ch :aHashmap.keySet())
		{
			
			if(bHashmap.containsKey(ch)) 
			{
				if(bHashmap.get(ch) == aHashmap.get(ch))
				{
					
				}
				else
				{
					count = count + Math.abs(bHashmap.get(ch) -aHashmap.get(ch));
				}
				
			}
			else
			{
				count = count + aHashmap.get(ch);
			}
		}
		for(Character ch :bHashmap.keySet())
		{
			if(aHashmap.containsKey(ch)) 
			{
//				if(aHashmap.get(ch)>1) aHashmap.put(ch, aHashmap.get(ch)-1);
//				lenB = lenB-1;
			}
			else
			{
				count = count+bHashmap.get(ch);
			}
			
		}
		
		System.out.println(count);
		
	
		
	}
	
	public static void wordCount(String str, HashMap<Character, Integer> abHashmap)
	{
		for(int j=0;j<=str.length()-1;j++)
		{
		if(abHashmap.containsKey(str.charAt(j)))
			{
				abHashmap.put(str.charAt(j), abHashmap.get(str.charAt(j))+1);
			}
			else
			{
				abHashmap.put(str.charAt(j), 1);
			}
		}
	}

}

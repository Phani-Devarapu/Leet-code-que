import java.util.ArrayList;
import java.util.HashMap;

public class SherlockandAnagram { 
	
	int count =0;
	
	ArrayList hmapList = new ArrayList();
	
	public int  sherAndAnagram( String input)
	{
		for(int i=0 ; i<input.length() ; i++)
		{
			for(int j=0;j<input.length();j++)
			{
				String sub = input.substring(i,j+1);
				wordCount(sub);
			}
		}
		
		System.out.println(hmapList.size());
		
		for(int j=0;j<hmapList.size();j++)
		{
			if((j+1)<hmapList.size())
			{
				if(hmapList.get(j).equals(hmapList.get(j+1)))
				{
					count++;
				}
				
			}
		}
		
		return count;
		
	}
	
	public void wordCount(String st)
	{
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(int i=0;i<st.length() ;i++)
		{
			if(!(hmap.containsKey(st.charAt(i))))
			{
				hmap.put(st.charAt(i), 1);
			}
			else
			{
				hmap.put(st.charAt(i), hmap.get(st.charAt(i))+1);
			}
		}
		
		for(Character ch : hmap.keySet())
		{
			System.out.println(ch + " " + hmap.get(ch));
		}
		
		hmapList.add(hmap);
	}

}

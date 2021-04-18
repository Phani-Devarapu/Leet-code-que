import java.util.ArrayList;

public class AlternatingCharacters {
	
	public void alternationg(String s)
	{
		ArrayList<Integer> aList = new ArrayList();
		
		
		for(int i =0; i<=s.length()-1;i++)
		{
			
			if((i+1)<=s.length()-1)
			{
				if(s.charAt(i)==s.charAt(i+1) )
				{
					aList.add(i+1);
				}
			}
			
			
		}
		
		System.out.println(aList.size());
		
	}

}

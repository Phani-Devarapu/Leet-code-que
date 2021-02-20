import java.util.HashMap;

public class DuplicateValueArray {
	
	//LeetCode 217
	
	public boolean duplicates()
	{
		int array[] = {1,1,1,3,3,4,3,2,4,2};
		
		HashMap<Integer,Boolean> hmap = new HashMap<Integer, Boolean>();
		
		for(int i =0 ; i< array.length ; i++)
		{
			if(hmap.containsKey(array[i]))
			{
				return true;
			}
			else
			{
				hmap.put(array[i], true);
			}
		}
		return false;
		
	}

}

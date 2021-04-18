import java.util.Stack;

public class BalancedString {
	
	private Stack<Character> simStack;

	public boolean isBalanced( String str)
	{
		simStack = new Stack<Character>();
		
		for( int i=0; i< str.length();i++)
		{
			Character ch = str.charAt(i);
			
			if( ch =='{' || ch=='[' ||ch=='(')
			{
				simStack.push(ch);
			}
			
			else if( ch =='}' || ch==']' ||ch==')')
			{
				Character pop = simStack.pop();
				
				
				if((ch=='}'&&pop=='{') || (ch==']'&&pop=='[') || (ch==')'&&pop=='('))
				{
					
				}
				else
				{
					return false;
				}
				
				
				
					
				
			}
			
		}
		return true;
		
	}

}

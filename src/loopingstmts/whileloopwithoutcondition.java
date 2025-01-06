package loopingstmts;

public class whileloopwithoutcondition {
	public static void main( String args[])
	{
		int i=1;
		while(true)
		
		if(i<=10)
		{
			System.out.println("hello");
			i++;
			
		}
		else
		{
			break;  // break is used to break the condition, else statement will be executed infinite times
		}
	}

}

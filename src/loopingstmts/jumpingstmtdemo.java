package loopingstmts;

public class jumpingstmtdemo {
public static void main(String[] args)
{
	
	// break statement
	
/*	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
	     break;
		}
		System.out.println(i); */
	
	
	// continue statement
	for(int i=1;i<=12;i++)
	{
		if(i==4||i==5||i==7)
		{
			continue;
		}
		System.out.println(i);
	}
}

}

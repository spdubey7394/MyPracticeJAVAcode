package session18;
import java.util.*;

public class HandlingAllExceptionWithOneCatchBock 
{

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		System.out.println("enter the length of square");
		Scanner sc=new Scanner(System.in);
		try 
		{
			int a=sc.nextInt();
			a=a*4;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handled");
			System.out.println(e.getMessage());
		}
		System.out.println("Program execution is completed and exited................");

			
			

	}

}

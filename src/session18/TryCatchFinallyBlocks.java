package session18;

import java.util.Scanner;

public class TryCatchFinallyBlocks {

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		System.out.println("enter the length of square");
		Scanner sc=new Scanner(System.in);
		try  //It will contain statements which may provide exception
		{
			int a=sc.nextInt();
			a=a*4;
			System.out.println(a);
		}
		catch(Exception e) // this block will handle the exception
		{
			System.out.println("Catch block is executed and Exception is Handled");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("final block is executed");
		}
		System.out.println("Program execution is completed and exited................");
	}

}

package session18;

import java.util.Scanner;

public class HandlingArithmeticException {

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		System.out.println("Please enter the no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); // input num as zero to get this exception
		int arth=0;
		try //it will contain statements which may lead to exception
		{
		arth= 100/num;  // java.lang.ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter should not be zero or negative");
			System.out.println(e.getMessage());
		}
		System.out.println(arth);
		System.out.println("Program execution is completed and exited");
	}

}

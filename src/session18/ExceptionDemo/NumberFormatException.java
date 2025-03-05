package session18.ExceptionDemo;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args)
	{
		System.out.println("Program execution is started");
		System.out.println("Please enter the no to store in string and convery in number");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		//Wrapper class for conversion string to num format
		
		Integer.parseInt(s); // NumberFormatException
		System.out.println(s);
		System.out.println("Program execution is completed and exited");
		

	}

}

package session18.ExceptionDemo;
import java.util.*;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		System.out.println("Please enter the no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); // input num as zero to get this exception
		int arth= 100/num;  // java.lang.ArithmeticException
		System.out.println(arth);
		System.out.println("Program execution is completed and exited");
		
		//if we put string instead of number we will get "InputMismatchException"

	}

}

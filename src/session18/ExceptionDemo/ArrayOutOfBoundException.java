package session18.ExceptionDemo;
import java.util.*;

public class ArrayOutOfBoundException {

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		int a[]=new int[5]; // Array starting position is from 0
		System.out.println("Please enter the no"); 
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt(); // If we put array index position more than the actual exception will be thrown
		
		System.out.println("Please enter the value");
		Scanner sc1=new Scanner(System.in);
		int value=sc1.nextInt();
		
		a[pos]=value; //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		System.out.println("Program execution is completed and exited");


		
	}

}

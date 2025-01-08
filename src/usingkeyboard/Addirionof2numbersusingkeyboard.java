package usingkeyboard;
import java.util.*;

public class Addirionof2numbersusingkeyboard {

	public static void main(String[] args) 
	{
		System.out.println("Enter the 1st number");
		Scanner x=new Scanner(System.in);
		int num1=x.nextInt();
		
		System.out.println("Enter the 2nd number");
		Scanner y=new Scanner(System.in);
		int num2=y.nextInt();
		
		int z=num1+num2;
		
		System.out.println("The additions of 2 numbers " + num1 + " and " + num2 + " is: " + z);


	}

}

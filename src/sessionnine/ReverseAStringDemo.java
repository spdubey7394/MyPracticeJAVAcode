package sessionnine;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ReverseAStringDemo {

	public static void main(String[] args) {
		//Reverse a string
		
		System.out.println("Please enter a string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The reverse string is " + rev);
        sc.close();

	}

}

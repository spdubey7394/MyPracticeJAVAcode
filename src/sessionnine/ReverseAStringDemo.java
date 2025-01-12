package sessionnine;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ReverseAStringDemo {

	public static void main(String[] args) {
		//Reverse a string - approach 1 - length() and charAt()
		
	/*	System.out.println("Please enter a string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The reverse string is " + rev);
        sc.close(); */
		
		//Approach 2 - without using string method and converting string to array
		
		System.out.println("Please enter a string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("The reverse string is " + rev);
		sc.close();
	}
}

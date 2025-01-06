package loopingstmts;

import java.util.*;

public class ReverseUsingInputFromKeyboard {

	public static void main(String[] args) {
		int rem;
		int sum=0;
		int temp;
		
		System.out.println("Enter number to reverse");
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		
		System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println("palindrome");	
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}

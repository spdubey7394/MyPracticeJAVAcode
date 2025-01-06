package arrademo;

import java.util.Arrays;

public class SortingCharacterUsingArray {

	public static void main(String[] args) 
	{
		char ch[]= {'f','s','x','c','q','w'};
		
		String S[]= {"Gucci","LouisVittion","Armani","Rolex","Pagani"};
		
		System.out.println("Characters before sorting" + Arrays.toString(ch));
		
		Arrays.sort(ch);
		
		System.out.println("Characters after sorting" + Arrays.toString(ch));

        System.out.println("STRING before sorting" + Arrays.toString(S));
		
		Arrays.sort(S);
		
		System.out.println("STRING after sorting" + Arrays.toString(S));
	}

}

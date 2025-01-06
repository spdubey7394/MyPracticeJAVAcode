package arrademo;

import java.util.Arrays;

public class SortingCharacterUsingArray {

	public static void main(String[] args) 
	{
		char ch[]= {'f','s','x','c','q','w'};
		
		System.out.println("Characters before sorting" + Arrays.toString(ch));
		
		Arrays.sort(ch);
		
		System.out.println("Characters after sorting" + Arrays.toString(ch));

	}

}

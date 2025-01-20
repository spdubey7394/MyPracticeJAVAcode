package sessionnine;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//Arrays - it is mutable- we can change
		
		int a[]= {1,9,3,7,8};
		System.out.println("before sort" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort" + Arrays.toString(a));
		
		//String - It is immutable and we cannot change. 
		
		String b=("String");
		System.out.println("before concat  " + b );
		b.concat(" is immutable");
		System.out.println("after concat  " + b ); // string needs a need variable to store and display the latest results
		String c=b.concat(" is immutable");
		System.out.println("After adding a new string variable  " + c );
		
		//StringBuffer - it is mutable and we can change
		
		StringBuffer d=new StringBuffer("StringBuffer is ");
		System.out.println("before append  " + d );
		d.append("mutable");
		System.out.println("before append  " + d );

		//StringBuilder - it is mutable and we can change

		StringBuilder e=new StringBuilder("StringBuilder is ");
		System.out.println("before append  " + e );
		e.append("mutable");
		System.out.println("before append  " + e );

		

		



	}

}

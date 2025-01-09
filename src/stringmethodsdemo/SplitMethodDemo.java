package stringmethodsdemo;

import java.util.Arrays;

public class SplitMethodDemo {

	public static void main(String[] args) {
	String s="sprakash,07031994@gmail.com";
	// this method is used to split the string into muliple parts based on delimeter
	// delimeter can be @, spaces and so on
	// split values is store in string array since it is multiple strings is stored in one array
	// cannot be used as delimeter ( ) - * % ^ & 
	String arr1[]=(s.split("@"));
	System.out.println(Arrays.toString(arr1));
	
	String arr2[]=(arr1[0].split(","));
	System.out.println(Arrays.toString(arr2));
	
	System.out.println(arr2[0]);
	System.out.println(arr2[1]);
	System.out.println(arr1[1]);

	}

}

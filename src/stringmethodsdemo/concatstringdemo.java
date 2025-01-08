package stringmethodsdemo;
import java.util.*;

public class concatstringdemo {

	public static void main(String[] args) {
		System.out.println("enter 1st string"); // we can also use + operator for concat but we do have specific method for string in 
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.next();
		String s2="hello ";
		String s3="Welcome ";
		
		System.out.println(s1.concat(s2).concat(s3));
		
		//to find lenth of string
		System.out.println(s1.length());

	}

}

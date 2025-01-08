package stringmethodsdemo;

public class trimmethoddemo {

	public static void main(String[] args) {
		String s1=("   Happy New Year   ");
		System.out.println(s1); // printing string
		System.out.println("length before trim " + s1.length()); // length before trim
		

		System.out.println("after trimimg spaces "+ s1.trim()); // string after trimming spaces
	    System.out.println("length after trimmimg spaces "+ s1.trim().length()); // length after triming spaces

// charAt() method to identify location of character in a string based on index no
	    
	    String s2="Welcome";
	    System.out.println(s2.charAt(6) );
	    
	    

	}

}

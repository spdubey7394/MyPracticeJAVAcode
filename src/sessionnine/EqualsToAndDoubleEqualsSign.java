package sessionnine;

public class EqualsToAndDoubleEqualsSign {

	public static void main(String[] args) {
		
		// Case 1:  == and Equals() difference  (WHEN CREATING STRING AS VARIABLE)
		
		//whenever we are initializing and declaring a string directly. Equals and == behavior will be same.
		
		String s1= "Welcome";
		String s2= "Welcome";
		System.out.println(s1==s2); // will return boolean value // true
		System.out.println(s1.equals(s2)); // will return boolean value //true
		
		//case 2: == and Equals() difference  (WHEN CREATING STRING AS OBJECTS)
		
		//whenever we are initializing and declaring a string using new string it is considered as objects and behavior will be different.
		// whenever we use new keyword object will be created and we have to use only equals() method.
		String s3= new String("Welcome");
		String s4= new String("Welcome");
		System.out.println(s3==s4); //false  //it is comparing the objects s3 and s4
		System.out.println(s3.equals(s4)); //true  //comparing the values of objects - "Welcome"
		
		
		//case 3: using string variable and object
		
		String s5= ("Welcome");
		String s6= new String("Welcome");
		System.out.println(s5==s6); //false  //it is comparing the objects s5 and s6
		System.out.println(s5.equals(s6)); //true;
		
		//case 3: using string variable and object. And Cloning a object. 
		
		String s7= ("Welcome");
		String s8= new String("Welcome");
		String s9=s8;
		System.out.println(s7==s8); //false  //it is comparing the objects s7 and s8
		System.out.println(s7.equals(s8)); //true;
		
		//s9 is a clone object of s8
		System.out.println(s8==s9); //true //it is comparing the objects s8 and s9
		System.out.println(s8.equals(s9)); //true - comparing values
		
		
	}

}

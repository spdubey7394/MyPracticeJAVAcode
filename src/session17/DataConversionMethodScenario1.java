package session17;

public class DataConversionMethodScenario1 {

	public static void main(String[] args) {
		
		
	//	String---> int, double , boolean , char
		
		//1) String ----> int
		
		String S1="15";  // string which contains numbers only that can be converted
		String S2="17";
		// Integer.parseInt will convert string to integer number 
		System.out.println(Integer.parseInt(S1)+Integer.parseInt(S2)); 
		
		//2) String---> double
		
		String S3="15.3";  // string which contains numbers only that can be converted
		String S4="16.5";
		//Double.parseDouble will covert string to double data type number
		System.out.println(Double.parseDouble(S3)+Double.parseDouble(S4));
		
		//3) String----> boolean
		
		String S5= "true"; // if string contains true it will convert it in boolean
		String S6= "false"; // if string contains true it will convert it in boolean
		String S7= "true1"; //if string contains other values than true and false, by default value after conversion will be false
		
		//Boolean.parseBoolean will convert to boolean value, only if contains true or false
		
		System.out.println(Boolean.parseBoolean(S5));
		System.out.println(Boolean.parseBoolean(S6));
		System.out.println(Boolean.parseBoolean(S7));


		//4) String ---> char -- not supported since string is a collection of character
		
		

	}

}

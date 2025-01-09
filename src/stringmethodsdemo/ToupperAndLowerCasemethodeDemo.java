package stringmethodsdemo;

public class ToupperAndLowerCasemethodeDemo {

	public static void main(String[] args) {
		String s=" Welcome";
		
		System.out.println(s.toUpperCase()); // tHIS WILL CONVERT STRING IN UPPER CASE
		System.out.println(s.toLowerCase()); // tHIS WILL CONVERT STRING IN LOWER CASE
  // example to find whether string is having john or not:
		
		String name="John Kennedy";
		System.out.println(name.toLowerCase().contains("john")); // true, first converting to lower case and then checking it 
		

	}

}

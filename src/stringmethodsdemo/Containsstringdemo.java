package stringmethodsdemo;

public class Containsstringdemo {

	public static void main(String[] args) {
	// string method will return boolean value to check whether the main string have particular string present in it
	String s1="welcome";
	System.out.println(s1.contains("wel"));//true
	System.out.println(s1.contains("come"));//true
	System.out.println(s1.contains("weL")); // case sensitive-false
	System.out.println(s1.contains("Come")); //false
	System.out.println(s1.contains("welce")); //false
	}

}

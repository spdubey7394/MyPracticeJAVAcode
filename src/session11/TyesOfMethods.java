package session11;

public class TyesOfMethods 
{
	//method 1: No parameter, no return value
	void m1()
	{
		System.out.println("No parameter, no return value jst print");
	}
	
	//method 2: No parameter, returns value
	String m2()
	{
		return "No parameter, returns value"; 
	}
	
	//method 3: Takes parameter, returns value
	String m3(String name)
	{
		return "my name is: " + name;
	}
	
    //method 4: Takes parameter, no return value
	void m4(String name1)
	{
	System.out.println("how are you?..." + name1);	
	}

}

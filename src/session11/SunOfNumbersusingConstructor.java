package session11;

public class SunOfNumbersusingConstructor 
{
	// class variable is declared
	
	int x,y;
	
	// Approach 1: using default constructor
	SunOfNumbersusingConstructor()
	{
	//	x=200;
	//	y=300;
		System.out.println("The sum of numbers: " + (x+y));
	}
	
	// Approach 2: using parameterized constructor and local variables
	SunOfNumbersusingConstructor(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void Sum()
	{
		System.out.println("The sum of numbers: " + (x+y));
	}

	public static void main(String[] args) 
	{
		// Approach 1: using default constructor
		SunOfNumbersusingConstructor sum=new SunOfNumbersusingConstructor();
		
		
		// Approach 2: using parameterized constructor
	//	SunOfNumbersusingConstructor sum=new SunOfNumbersusingConstructor(131,238);
	//	sum.Sum();
		

	}

}

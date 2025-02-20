package session16;

interface Shape
{
	int length=2; // Interface variables are by default static and final
 final static int breadth=3;// we an also declare static or final by using keyword
	double r=4;
	double pi=3.14;
	
	//below is abstract method
	 void circle(); // In interface by default method is public,
	                     //but we should use public bcoz while implementation it can provide an error
	
	default void triangle() //default method
	{
		System.out.println("This is a default method -triangle" + length * breadth);
	}
	
	static void square() //static method
	{
		System.out.println("This is a static method -square " + 4*length );
	}
	
	
}

public class InterfaceDemo implements Shape // class can implement an interface 
{
	
	public void circle() //implementing the abstract method
	{
		System.out.println("This is a abstract method -circle - " + 2*pi*r );

	}
	

	public static void main(String[] args) {
		
	//	Scenario 1: by using class object reference
		
	//	InterfaceDemo id=new InterfaceDemo();
	// id.circle(); 
		//id.triangle();
	//Shape.square();
		
	//Scenario 2: by using interface obj reference that will hold object of child class
		Shape sh=new InterfaceDemo();
		sh.circle(); //abstract class
		sh.triangle(); // default class
		
		Shape.square(); //static class, can be directly accessed using interface "interfacename.method"
		
		System.out.println(Shape.length*Shape.breadth); //accessing static variable directly using interface name
		
		
			

	}

}

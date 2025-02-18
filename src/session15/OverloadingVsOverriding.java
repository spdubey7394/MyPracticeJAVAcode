package session15;

class ABC
{
	void m1(double a)
	{
		System.out.println(a);
	}
	
	void m2(double b)
	{
		System.out.println(b);
	}
	
}

class XYZ extends ABC
{
	void m1(double a) // overriding with inheritance  //definition is same but implementation is different
	{
		System.out.println(a*a); // For overriding minimum one parent and one child class is needed
	}
	
	void m2(double b, double c) //overloading with inheritance  //definition and implementation both are different
	{
		System.out.println(b+c); // For overloading
	}
}

public class OverloadingVsOverriding 
{
	public static void main(String[] args) 
	{
		XYZ xa=new XYZ(); // created obj for XYZ CLASS
		xa.m1(5); //m1 of ABC
		xa.m1(10);//m1 of xyz
		xa.m2(5,4); //m2 of xyz
	}

}

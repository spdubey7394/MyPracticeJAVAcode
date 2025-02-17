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
		System.out.println(a*a);
	}
	
	void m2(double b, double c) //overloading with inheritance  //definition and implementation both are different
	{
		System.out.println(b+c);
	}
}

public class OverloadingVsOverriding 
{
	public static void main(String[] args) 
	{
		XYZ xa=new XYZ();
		xa.m1(5);
		xa.m2(5,4);
	}

}

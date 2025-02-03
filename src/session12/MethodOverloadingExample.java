package session12;

public class MethodOverloadingExample
{
	int x=15,y=11; 
	
	//Type 1: default method with no parameter
	
	void sum()
	{
	System.out.println(x+y);	
	}
	
	//Type 2: Method with no. of different parameter
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	//Type 3: Method with different data types of the parameter
	
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
	
	//Type 3: Method with different order of data types of the parameter
	
	void sum(double a, int b)
	{
		System.out.println(a+b);
	}
}

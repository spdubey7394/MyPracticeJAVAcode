package session12;

public class ConstructorOverloadingExample 
{
	int x=10,y=20;
	
	//Type 1: Default constructor
	
	ConstructorOverloadingExample()
	{
		System.out.println(x+y);
	}
	
	//type 2: Constructor with different parameter
	
	ConstructorOverloadingExample(int c,int d)
	{
		x=c;
		y=d;
		System.out.println(x+y);

	}
	
	//type 3: Constructor with different data types of parameter

	ConstructorOverloadingExample(int c,double d)
	{
		System.out.println(c+d);
	}

	//type 4: Constructor with different order of data types of parameter

		ConstructorOverloadingExample(double c,int d)
		{
			System.out.println(c+d);
		}
}

package session12;

public class ConstructorOverloadingExampleMain {

	public static void main(String[] args)
	{
		
		//Type 1: Default constructor
		
		ConstructorOverloadingExample c0=new ConstructorOverloadingExample();
		
		//type 2: Constructor with different parameter
		
		ConstructorOverloadingExample c1= new ConstructorOverloadingExample(11,12);
		
		
		//type 3: Constructor with different data types of parameter

		ConstructorOverloadingExample c2= new ConstructorOverloadingExample(17,19.5);
		

		//type 4: Constructor with different order of data types of parameter

			ConstructorOverloadingExample c3= new ConstructorOverloadingExample(88.5,10);
			
	}

}

package session12;

public class MethodOverloadingExampleMain {

	public static void main(String[] args) 
	{
		MethodOverloadingExample me=new MethodOverloadingExample();
		
		//Type 1: default method with no parameter
		
		me.sum();

		
		//Type 2: Method with no. of different parameter
		
		me.sum(33, 36);
		
		
		//Type 3: Method with different data types of the parameter
		
		me.sum(11, 33.5);
		
		
		//Type 3: Method with different order of data types of the parameter
		
		me.sum(41.5, 12);
	
	}

}

package session19;

public class TypeCastingDemo 
{
	// Converting datatype from one type to another
	// Types of type casting:
	
	// 1) Upcasting: Converting value from smaller datatype to higher datatype. It is an Automatic process.
	// Eg: int----->long,  float----->double;
	
	// 2) Downcasting: Converting value from higher datatype to lower datatype. It is an Manual process.
	// Eg: long----->int, double---->float;
	
	
	
	public static void main(String[] args) 
	{
		
		// Upcasting Example: 
		
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		int x=150;
		double y=x;
		System.out.println(y);
		
		// Downcasting Example:
		
		double doublevalue=10000.5;
		float floatvalue=(float)doublevalue; // in downcasting we need to also specify the lower datatype along with the higher variable
		System.out.println(floatvalue);      // before the variable
		
		long longvalue1=200;
		int intvalue1=(int)longvalue1;
		System.out.println(intvalue1);
		
		
		
		

	}

}

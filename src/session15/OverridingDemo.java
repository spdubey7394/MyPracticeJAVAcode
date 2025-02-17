package session15;

//method overriding

class Bank
{
	double roi() // same defination in all the class
	{
		return 0;  //different implementation
	}
}

class SBI extends Bank
{
	double roi() // same method name, same no of variables and their data types
	{
		return 9; // only diferent type of implementation
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 7;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		//obj need to be only created for the class whose method needs to be called
		
		ICICI ic=new ICICI();  // obj for icici class
		System.out.println(ic.roi());  //print for icici
		
		SBI sb=new SBI(); // obj for sbi class
		System.out.println(sb.roi()); // print for sbi
 
	}

}

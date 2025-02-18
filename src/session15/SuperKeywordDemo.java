package session15;

class Super1
{
	String color="Black"; 
	
	void print()
	{
		System.out.println("this is a parent class");
	}
}

class Super2 extends Super1
{
	String color="White";
	
	void displaycolor()
	{
	//	System.out.println(color); // by default using overriding concept to the value of the variable
		
		System.out.println(super.color); //by using super keyword immediate parent class value is invoked
	}
	
	void print()
	{
		super.print(); // invoking print method from parent class using super keyword
	}
}
public class SuperKeywordDemo {

	public static void main(String[] args) {
		Super2  skd=new Super2();
		skd.displaycolor(); // since we had used the super keyword parent variable value is displayed,
		skd.print(); //// invoking print method from parent class using super keyword

	}

}

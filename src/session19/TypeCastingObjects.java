package session19;


class Parent
{
	int x=100;
	void show1()
	{
		System.out.println("This is a parent class");
	}
}

class Child extends Parent
{
	int y=150;
	void show2()
	{
		System.out.println("This is a child class");
	}
}

public class TypeCastingObjects {

	public static void main(String[] args) 
	{
		// Scenario 1: using inheritance concept to access data
		
	/*	Child c=new Child();
		System.out.println(c.x);
		c.show1();
		System.out.println(c.y);
		c.show2(); */
		
		// Scenario 2: Upcasting /Widening / automatic casting ------>> lower to higher
		
	/*	Parent p=new Child(); // parent is higher and child is lower
		System.out.println(p.x); // Parent variable access 
		p.show1(); // parent method access
		
		System.out.println(p.y); // cannot access child variable using this approach
		p.show2(); // cannot access child method using this approach
		*/
		
		// Scenario 3: Downcasting / narrowing /explicitly casting ---->> higher to lower
		// At run time we will get exception class cast exception
		//This scenario is not used since it will throw error
		
	/*	Parent p=new Parent(); // Parent class object
		Child c=(Child)p;      // Trying to store the parent class object in child class 
		System.out.println(c.x);
		c.show1();
		System.out.println(c.y);
		c.show2(); */
		
		
		//note: only used approach 1 or approach 2 
				

	}

}

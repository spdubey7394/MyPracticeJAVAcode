package session14;

class Fish
{
	void parent()  // parent class
	{
		System.out.println("This is a parent class for hierarchy inheritance");
	}
}

class Goldfish extends Fish // child class 1
{
	void child1()
	{
		System.out.println("This Goldfish is a child 1 class for hierarchy inheritance");
	}
}

class Shark extends Fish // child class 2
{
	void child2()
	{
		System.out.println("This Shark is a child 2 class for hierarchy inheritance");
	}
}

class Whale extends Fish // child class 3
{
	void child3()
	{
		System.out.println("This Whale is a child 3 class for hierarchy inheritance");
	}
}
public class HierarchyInheritance {
public static void main(String[] args)
{
	//creating object for 1st child class
	Goldfish gf=new Goldfish();
	gf.parent();
	gf.child1();
	System.out.println();
	
	//creating object for 2nd child class
	Shark sh=new Shark();
	sh.parent();
	sh.child2();
	System.out.println();
	
	//	//creating object for 3rd child class
	Whale wl=new Whale();
	wl.parent();
	wl.child3();


		

	}

}

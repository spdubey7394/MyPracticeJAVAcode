package session14;

class Animaal
{
	void Base()
	{
		System.out.println("Animal is a Base/Super/Parent class");
	}
}

class Cat extends Animaal
{
	void Sub1()
	{
		System.out.println("Cat is a Sub/Derived/Child class");

	}
}

class Persian extends Cat
{
	void Sub2()
	{
		System.out.println("Persian is a child class of Cat Parent class and Cat is a child class of parent Animal class");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
	Persian meow=new Persian();
	meow.Base();
	meow.Sub1();
	meow.Sub2();
	

	}

}

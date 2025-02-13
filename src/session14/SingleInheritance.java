package session14;

class Animal
{
int x=10;
	
	void printx()
	{
		System.out.println("This animal eats food at " +x +"pm.");
	}
}
	
	
	class Dog extends Animal // child class/derived class/sub class
	{
		int y=20;
		
		void printy()
		{
			System.out.println(y);
		}
		
	}

class SingleInheritance //parent class/super class/Base class
{
	public static void main(String[] args) 
	{
		Dog si=new Dog();
		si.printx();
		si.printy();
		

	}

}

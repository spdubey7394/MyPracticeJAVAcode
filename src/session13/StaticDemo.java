package session13;

public class StaticDemo 
{
	static int a=10; // static variable
	int b=20;  //non static variable
	
	static void m1()  //this is static method
	{
		System.out.println("this is static method");
	}
	
	void m2()  //this is non static method
	{
		System.out.println("this is non-static method");
	}
	
	
	//3) non static methods can directly access everything
	void m3() // this is no static method
	{         
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args)
	{
		// 1) static methods can directly access static stuffs, without creating object
		System.out.println(a);  //classname.static_variable if main method is in different class
		m1();
		
		//System.out.println(b); // cannot be access // this is non static variable
		//m2();  // cannot be access // this is non static variable
		
		
		// 2) static methods can also  call non-static stuffs, with creating object
		StaticDemo sd=new StaticDemo();
		
		System.out.println(sd.b); //static method can access non-static stuff through object
		sd.m2(); //static method can access non-static stuff through object

		//3) non static methods can directly access everything
		sd.m3();  //if main method is in different class, then classname.static_variable

	}

}

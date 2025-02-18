package session15;
 
class DEF
{
	final void m1()
	{
		System.out.println("this is final method we cannot overide this method");
	}
	
	void m2()
	{
		System.out.println("this can be overrided since there is not final method");
	}
}

class GHI extends DEF
{
	final void m1(int a) // method overloading is possible for final keyword
	{
		System.out.println(a); 
	}
	
	void m2()
	{
		System.out.println("overriding is not supported for the final keyword");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
	DEF d=new DEF(); // obj for def
	d.m1();
	d.m2();
		
	 GHI g=new GHI(); //obj for ghi
	 g.m1(20);
	 g.m2();
	 

	}

}

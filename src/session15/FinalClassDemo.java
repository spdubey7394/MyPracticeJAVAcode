package session15;

final class DE
{
	 void m1()
	{
		System.out.println("this is final method we cannot overide this method");
	}
	
	void m2()
	{
		System.out.println("this can be overrided since there is not final method");
	}
}

class GH  // extends DEF  ; extends keyword is not supported for final class
{
	void m2()
	{
		System.out.println("overriding is not supported for the final keyword");
	}
}


public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

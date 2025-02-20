package session16;

//extends allow once class whereas implements allow n no. of interfaces

public class C1 extends C2 implements I1,I2 // A class can implement n no. of interfaces
{
	public void xsquare()
	{
		System.out.println("The square root of x is " + x*x); //Implementation of abstract class
	}
	
	public void multiply()
	{
		System.out.println("The multiplication of y is " + 5*y); //Implementation of abstract class
	}

	public static void main(String[] args) 
	{
	C1 c1obj=new C1(); // created obj of class C!
	
	c1obj.xsquare(); //calling method of interface 1 by implementation in class C! and using Class c1 object reference
	c1obj.multiply(); //calling method of interface 2 by implementation in class C! and using Class c1 object reference
	
	c1obj.addition(); //calling method of class 2 by extending in class 1 and using Class c1 object reference

	}

}

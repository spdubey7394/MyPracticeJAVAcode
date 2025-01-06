package Day3;

public class Demooperators {

	public static void main(String[] args) {
		// 1) Arithmetic operators + - * / % 
		float a=30l,b=20l;
	float	c,d,e;
	float f;
	c=a+b;
	d=a-b;
	e=a*b;
	f=a/b;
		System.out.println(c+" "+" "+d+" "+e+" "+f);
		
		
		
		//2) REALTIONAL / Comparison operator 
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
	boolean resu=a>b;
	System.out.println(resu);

	//3) Logical operators && || ! and it returns a boolean value
	    // logical operators are always boolean values
	
	boolean x=true;
	boolean y=false;
	System.out.println(x&&y);
	System.out.println(x||y);
	System.out.println(!x);
	System.out.println(!y);
	
	//4) increment and decrement operator  ++ --
	
	a=15;
	System.out.println(a);
	
	a=a+1;
	System.out.println(a);

	a++;
	System.out.println(a);
	
	// pre increment
	
	int g=77;
	
	g++;
	System.out.println("The new value is:" + g);
	
	
	//pre increent case 2
	
	
	int n;
	n=g++;
	
	System.out.println(n);
	System.out.println(g);
	
	n=++g;
	
	System.out.println(n);
	System.out.println(g);

	
	
	
	
	
	
	
	
	
	
	
	// post increment
	
	
	int l;
	l=g++;
	
	System.out.println(l);
	System.out.println(g);
	
	
	
	
	
	
	
	
	
	
	}

}

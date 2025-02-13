package session13;

//int a; variable declare outside the class is global variable but java does not support global variable

public class ThisKeywordUsingConstructor 
{
	int a, b;
	
	ThisKeywordUsingConstructor(int a, int b)
	{
		//this represents class variable 
		this.a=a;
		this.b=b;
	}
	 
	void sumPrint()
	{
		System.out.println(a+b);
	}
	

	public static void main(String[] args) 
	{
		ThisKeywordUsingConstructor th=new ThisKeywordUsingConstructor(15,4);
		th.sumPrint();
		
	}

}

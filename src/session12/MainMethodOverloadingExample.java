package session12;

public class MainMethodOverloadingExample 
{
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main(int x,int y)
	{
		System.out.println(x*y);
	}
	
	void main(String name, char ch)
	{
		System.out.println(name+ch);
	}
	
	
	public static void main(String[] args) 
	{
		MainMethodOverloadingExample mme=new MainMethodOverloadingExample();
		mme.main(07);
		mme.main(2, 3);
		mme.main("mahi", 'D');

	}

}

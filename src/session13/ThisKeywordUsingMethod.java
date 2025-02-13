package session13;

public class ThisKeywordUsingMethod 
{
	int x,y;
	
	void setData(int x,int y)
	{
		//this keyword represents variable is a class variable
		this.x=x;
		this.y=y;
	}

	
	void PrintData()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		ThisKeywordUsingMethod th=new ThisKeywordUsingMethod();
		th.setData(47, 47);
		th.PrintData();
		

	}

}

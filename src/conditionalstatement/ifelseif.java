package conditionalstatement;

public class ifelseif {

	public static void main(String[] args) 
	{
		int num=(11);
		if(num>0)
		{
			System.out.println("it is a positive number");
		}
		else if(num<0)
		{
			System.out.println("it is a negative number");
		}
		else
		{
			System.out.println("it is zero");
		}
		
		// grade of student
		int marks=5;
		if(marks>=80)
			
		{
			System.out.println("a grade ");
		}
		else if(marks>=60)
		{
			System.out.println("b grade");
		}
		else if(marks>=40)
		{
			System.out.println("c grade");
		}
		else
		
		{
			System.out.println("fail");
		}
		
		//find the largest from 3
		
		int a=100;int b=200;int c=300;
		if(a>b&&a>c)
		{
			System.out.println("a is greater no");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater no");
		}
		else
		{
			System.out.println("c is greater no");
		}
	}

}

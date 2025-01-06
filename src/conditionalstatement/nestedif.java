package conditionalstatement;

public class nestedif {

	public static void main(String[] args) 
	{
		int weekno=7;
		if(weekno>=0&&weekno<8)
		{
			if(weekno==1)
			{
				System.out.println("Today is monday");
			}
			 else if (weekno==2)
			{
				System.out.println("Today is Tuesday");
			}
			 else if (weekno==3)
				{
					System.out.println("Today is wednesday");
				}
			 else if (weekno==4)
				{
					System.out.println("Today is thursday");
				}
			 else if (weekno==5)
				{
					System.out.println("Today is friday");
				}
			 else if (weekno==6)
				{
					System.out.println("Today is saturday");
				}
			 else if (weekno==7)
				{
					System.out.println("Today is sunday");
				}
		}
		else
		{
			System.out.println("please enter valid week no");
		}
			
	}

}

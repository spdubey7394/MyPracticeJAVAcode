package arrademo;

public class PrintEvenAndOddFromArrayDemo {

	public static void main(String[] args) {
	int	a[]= {1,2,3,4,5,6,7};
	
	
    for(int k:a)
    {
		if(k%2==0)
		{
			System.out.println("the even no is " + k);
		}
    }
		
		for(int m:a)
		{
			if(m%2!=0)
			{
				System.out.println("the odd number is " + m);
			}
		}
	}

}

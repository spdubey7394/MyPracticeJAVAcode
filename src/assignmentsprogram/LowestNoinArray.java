package assignmentsprogram;

public class LowestNoinArray {

	public static void main(String[] args) 
	{
		int num[]= {4,22,77,45,6,88,9,12,3};
		int lowest=num[0];
		
		for(int i=1;i<=num.length-1;i++)
		{
			if(num[i]<lowest)
			{
				lowest=num[i];
			}
		}
		System.out.println(lowest);

	}

}

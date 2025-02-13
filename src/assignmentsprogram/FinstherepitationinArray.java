package assignmentsprogram;

public class FinstherepitationinArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,2,2,2,3,3,3,3,8,4,4,4,5,5,5,5,5,6,6,9,7,7,7};
		int count=0;
		int repetative_no=7;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==repetative_no)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}

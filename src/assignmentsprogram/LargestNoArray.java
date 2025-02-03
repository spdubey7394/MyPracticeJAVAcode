package assignmentsprogram;

public class LargestNoArray {

	public static void main(String[] args) 
	{
	 int num[]= { 1,2,3,4,5,6,7,8,10};
	 int largest=num[0];
	 
	 for( int i=1;i<=num.length-1;i++)
	 {
		 if(num[i]>largest)
		 {
			 largest = num[i];
		 }
		 
	 }
	 System.out.println("the largest number is:" + largest);
	 

	}

}

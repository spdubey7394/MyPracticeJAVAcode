package arrademo;

public class NumberOfRepetitionsOfAnElementInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,7,7,7,4,7,5,6,7};
		int num=8;
		 int count=0; 
		 for(int x:a)
		 {
			 if(x==num)
			 {
				 count++;
			 }
			 
		 }
		 if(count>0)
		 {
		 System.out.println("The repeated no is " + num + " and is repeated for " + count + " times");
		 }
		 else
		 {
			 System.out.println("There is no repetitve element in the Array");
		 }
	}

}

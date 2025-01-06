package arrademo;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int sum=0;
		
		for(int i: a) // by using enchanced loop
		{
			sum=sum+i;
		}
          System.out.println(sum);
	}

}

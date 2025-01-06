package arrademo;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		Object a[]= {777,7.7,'s',"Seven",false}; // this is a example of heterogenious data type using array, we need to create object
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The value of an obeject" + " [" + a[i] + "]");
		}
          
	}

}

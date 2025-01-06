package arrademo;

public class FindElementInAnArray 
{  // ToFindElementInAnArray
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int search_element=50;
		boolean status=false;
		
	// Using classical for loop 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				status=true;
				System.out.println("The founded element is " + a[i] );
				break; //this is used to break the loop or it will print not founded element 
			}
		//	System.out.println("The element " + a[i] + " not found in the Array");
		}
		//Using enhanced loop
			for(int x:a)
			{
				if(x==search_element)
				{
					status=true;
					System.out.println("The founded element is " + x );
					
					break; //this is used to break the loop or it will print not founded element 
				}
			}
			
		
		    if(status==false)
		    {
		    	System.out.println("The element " + search_element + " not found in the Array");
		    }
		
           
	}

}

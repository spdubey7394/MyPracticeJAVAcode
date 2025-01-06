package arrademo;

public class Twodimensionalarraydemo {

	public static void main(String[] args) {
		int a[][]= new int[3][2];  // approach 1 declaring an array
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println("no.of rows is:" + a.length); // read row
		
		System.out.println("no.of columns is:" + a[0].length); // reading column
		
		for(int row=0;row<a.length;row++) // reading the value of row of an array using for loop
		{
			for(int col=0;col<a[row].length;col++) // reading the value of col of an array using for loop
			{
				System.out.println("the array is" + a[row][col]);
			}
				
		}
		
          int b[][]= { {100,200,300}, //approach 2 for declaring ana aary
          				{300,400,500},
          				{500,600,700}
          				};
          
          
         System.out.println("the no of rows is:" + b.length);
         System.out.println("the no of columns is:" + b[0].length);
         
         for(int c=0;c<b.length;c++)
         {
        	 for(int d=0;d<b[c].length;d++)
        	 {
        		 System.out.print("[" + b[c] [d] + "] "); // to print array in tabular form
        	 }
        	 System.out.println(); // to print array in next line
         }
        	
         
        //enhanced for loop
         for(int arr[]:b) // we can int array because we have 2 dimensional values as compared to single dimensional
         {
        	 for(int z:arr)
        	 {
        		System.out.print("[" + z + "]"); 
        	 }
        	 System.out.println();
         }
        		  
          }
	}



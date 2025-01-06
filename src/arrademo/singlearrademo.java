package arrademo;

public class singlearrademo 
{
public static void main(String[] args) {
	int a[]=new int[7]; // approach 1
	a[0]=10;    // declaring value of an array 
	a[1]=20;
	a[2]=30;
	a[3]=35;
	a[4]=40;
	a[5]=50;
	a[6]=70;
	
	for(int i=0;i<=7-1;i++) // reading the value of an array using for loop
	{
	System.out.println("the array is;" + a[i]); 
	}
	
	int b[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // approach 2
	System.out.println(b.length); // identifying the length of array
	System.out.println(b[9]);  // reading value of an array using index
	for(int j=0; j<b.length; j++)
	{
		System.out.println("the value of array b is:" + b[j]);	
		
	}
	
	//enhanced for loop
	int c[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	for(int k:c)
	{
		System.out.println(k);
	}
}
}

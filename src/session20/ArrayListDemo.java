package session20;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		// Declaration of ArrayList for Homogeneous data
		//If the data is of Integer object
		
	//	ArrayList <Integer> mylist=new ArrayList <Integer> (); //Integer is a wrapper class
		
		// Declaration of ArrayList for Heterogeneous data:
		
	//	Approach - 1) here List is predefined class in util package 
	//	List mylist = new ArrayList();
		
		//Aproach -2) mostly used for heterogeneous data:
		
		ArrayList <Object>mylist=new ArrayList<>(); //using generics
		
		
		// Adding data into ArrayList and it is added at the end of the ArrayList:
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Surya");
		mylist.add('A');
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		// find the size of ArrayList using size method:
		
		System.out.println("Size of the ArrayList is: "+mylist.size());
		
		// Printing data from the ArrayList :
		
		System.out.println("Elements in the ArrayList: " + mylist);
		
		//Remove specific data/element from ArrayList using Index no:
		
		System.out.println("Elements in the ArrayList before removing 2 index element: " + mylist);
		
		mylist.remove(2);
		
		System.out.println("Elements in the ArrayList after removing 2 index element: " + mylist);
		
		System.out.println("Printing size of the ArrayList after removing 2 index element: " + mylist.size());
		
		
		//Insertion of element in middle of the ArrayList, elements are shifted next and it is not deleted:
		
		mylist.add(2,"NewElement");
		
		System.out.println("Elements in the ArrayList: " + mylist);
		
		//Modify/replace/change the data in ArrayList: (Using set method)
		
		mylist.set(2, "SURYA");
		
		System.out.println("Elements in the ArrayList: " + mylist);

		// Access specific element using index no; (Using get method)
		
		System.out.println(mylist.get(3));
		
		// Reading all the elements from ArrayList:
		
		// Appraoch 1 using for loop;
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		// Approach 2 using enchanced / for each loop"
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}

		// Approach 3 using iterator class present in java.util. class
		
		Iterator<Object> it=mylist.iterator ();
		
		while(it.hasNext()) // hasNext method will check element present or not
		{
			System.out.println(it.next()); // next method will print next elements
		}
		
		// Checking ArrayList is empty or not
		
		System.out.println(mylist.isEmpty());
		
		// Removing all the elements from the ArrayList
		
	   //	mylist.clear();
		
	   // Removing random data based on the requirement from the arraylist
		
		ArrayList <Object> mylist2=new ArrayList<>(); // new object is create to store the element which needs to be removed
		mylist2.add("SURYA"); // elements which has to be removed from ArrayList
		mylist2.add(null);
		
		//System.out.println(mylist);
		 mylist.removeAll(mylist2); // removeAll method
		//System.out.println(mylist);

		



		
		
		

		
		
		
	}

	
}

package session20;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		
		//Declaration of HashSet - for homogeneous data
		
	//	HashSet<String> myset=new HashSet<String>(); //Here string is a wrapper class, primitive data type is not supported by HashSet
		
		//For Heterogeneous data:
		
		//Set<Object> myset=new HashSet<>();
		
		HashSet<Object> myset=new HashSet<>();
		
		//Adding Elements into HashSet
		
		myset.add(100);
		myset.add(10.5);
		myset.add("SURYA");
		myset.add('S');
		myset.add(true);
		myset.add(null);
		
		//printing all the elements
		
		System.out.println(myset);
		
		//size of hashset
		
		System.out.println(myset.size());
		
		//removing  element from HashSet:
		
		System.out.println("HashSet before removing elements: "+ myset);
		
		myset.remove(10.5);
		
		System.out.println("HashSet after removing elements: "+ myset);
		
		// to check hashset is empty or not
		
		System.out.println(myset.isEmpty());
		
		//Insertion of element ---->> Not possible
		
		//Accessing specific element ----->>> Not possible
		
		// Alternate approach to access specific element by converting HashSet to ArrayList
		
		ArrayList<Object> al=new ArrayList<>(myset); //using this hashset is convert to ArrayList
		
		System.out.println(al.get(2));
		
		// Reading all the elements from HashSet
		
		//Approach-1 by converting hashset to arraylist and using for loop
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		// Approach-2: by using for each loop / enhanced loop
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//Approach-3: Using Iterator
		
		Iterator it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// clear all elements in hashset
		
		myset.clear();
		
		System.out.println(myset);
		
		
		
		
		
		


		
		
		
		
		

	}

}

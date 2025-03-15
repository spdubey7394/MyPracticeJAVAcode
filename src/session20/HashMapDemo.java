package session20;
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
	
		
		// Declaration of hashmap:
		
	//	Map hm=new HashMap(); 
	//	HashMap hm=new HashMap();
		
		//if we are aware of object data type of of key and value
		
		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		
		//Adding pairs:
		
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Mary");
		
		// printing pairs: we will not get same order as index is not preserved
		
		System.out.println(hm);
		
		// Size of hashmap:
		
		System.out.println("Size of Hashmap:" + hm.size());
		
		// removing pair: 
		
		hm.remove(103); // 103 is the key
		System.out.println(hm);
		
		//Access value of a key
		
		System.out.println(hm.get(102)); // get method is used
		
		//get all the key from the hashmap
		
		System.out.println(hm.keySet()); // returns on key
		
		//get all the values from the hashmap:
		
		System.out.println(hm.values());
		
		// get key along with values:
		
		System.out.println(hm.entrySet());
		 
		// change/replace the vale of a key
		
		hm.put(101,"SURYA");
		System.out.println(hm);
		
		// Reading data from hashmap
		
		//using for each loop
		
		for(int k: hm.keySet())
		{
			System.out.println("k " + hm.get(k));
		}

		
		// to clear 
		
		hm.clear();
		
		// to check whether is empty or not
		
		System.out.println(hm.isEmpty());
	}

}

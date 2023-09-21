package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 12345);  // storing kay and value
		td.put("Marc", 35345);
		td.put("John", 5345);
		td.put("Jaya", 5345);
		td.put("James", 34535);
		
		// print the values of the Hash map
		// it retrievs all the values but doesnot maintain sequence
		// duplicate values not allowed
		
		/*
		 * for(Entry m: td.entrySet()) { System.out.println(m.getKey() + " - " +
		 * m.getValue()); }
		 */
		// a key and value is called as Entry and we use entry interafce
		// it has an EntrySet method which return values as a Set
		
		Set set = td.entrySet();
		
		//System.out.println(set);  // square braces indicates as a single set
		
	// the set can use a method called as iterator to iterate over the set of values and print them
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		// remove methods
		
		td.remove("Marc"); // Remves the key marc and its value
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

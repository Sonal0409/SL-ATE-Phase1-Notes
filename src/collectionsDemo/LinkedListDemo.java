package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add(2, "New Delhi");  // add value at an index in the list
		cities.add("Mumbai");
		
		// Size of the linked list
		
		System.out.println(cities.size());
		
		// Print the values of the list
		
	Iterator itr=	cities.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	
	// get a value from the list
	
		System.out.println(cities.get(1));
		
		// does list contain a value
		
		System.out.println(cities.contains("Hyderabad")); // return true or false

	}

}

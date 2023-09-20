package javaPrograms;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print a statement 7 times, if the condition is true
		
		// if condition is not true, even then print the statement atleast once.
		
		/*Syntax of Do while loop
		 * 
		 * initialize the value
		 * 
		 * do{    // In this case the loop will be executed atleaset onve
		 * 
		 * loop statements
		 * increment operation
		 * 
		 * }
		 * while(condition);

		 * 
		 */
		
		int i = 1;
		
		do {
		
		System.out.println("Today is Wednesday");
		i++; // increment the value of i by 1
		
		}
		while(i>=7);
		
		
		System.out.println("Printed the messages. I am out of the loop");
		
	
		

	}

}

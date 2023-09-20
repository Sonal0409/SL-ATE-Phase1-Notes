package javaPrograms;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Syntax of for loop
		 * 
		 * for(intialized variable;condition;increment/decrement)
		 * {
		 *      // loop statements
		 * }
		 */
		// Print values from 1 to 10
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		for(int i=100;i>=50;i--)  // print values from 100 to 50
		{
			System.out.println(i);
		}
		
		System.out.println("Im out of the loop");
		
		// WHAT is difference between ++i and i++
		// var i =10
		// i++; or ++i;

	}

}

package javaPrograms;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Write a for loop to print characters of a String
		
		// A String is  pre-defined class in Java
		// A string stores a series of characters
		// Every character in a string has a index number
		// index number starts with 0 - (n-1)
		// String variable value will have a length that can be computed
		// The syntax to call method already defined in a class is
		// objectname.methodname()
		
		String s1 = "Learning Java";
		
		// Find the length of the String
		
		int len = s1.length();
		
		for(int i=0;i<len;i++)
		
		{
			//System.out.println(i); // this will just print the index of every chanracter in the string
			System.out.print(s1.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

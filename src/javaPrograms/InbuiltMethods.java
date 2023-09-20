package javaPrograms;

public class InbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of how to use inbuilt methods of String class
		
		String s1 = "Selenium ";  
		String s2 = "training";   
		
		// concatinate both the strings and print it.
		// use + operator
		
		String s3 = s1+s2;   // Selenium training
		
		// Concatinate using String class concat method
		
		String s4 = s1.concat(s2); // Selenium training
		
		String s5 = s1.concat("with Simplilearn");
		
		System.out.println("Concatination using + operator : " + s3);  // Selenium training
		
		System.out.println("Concatination using concat method :" + s4);

	}

}

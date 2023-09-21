package collectionsDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We can a variable storing single value
		
		String s1 = "vaule1";
		
		int i1 = 10;
		
		// Arrays -> will store multiple values
		// An array can store fixed number of values
		// it has a fixed size
		// In an array you can multiple values of same datatype
		// no new values can be added to the array at runtime
		// 
		
		// Syntax
		
		int [] arr1 = {10,20,30,40,50};
		
		int len = arr1.length;
		
		for(int i =0; i<len;i++)
		{
		System.out.println(arr1[i]);
		
		}
		
	}

}

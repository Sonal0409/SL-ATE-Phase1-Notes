package exceptionsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num1 = scan.nextInt();
			System.out.println("Enter another number");
			int num2 = scan.nextInt();
			
			int result = num1/num2;
			
			System.out.println("The division of 2 numbers is : " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter a zero in denominator");
		}
		catch(InputMismatchException e) {
			System.out.println("Only Integer values are allowed");
		}
		// Generic catch block should always be written at the bottom
		catch(Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package exceptionPracticies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trywithresources {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// go to download folder of lab
// right click and create a file with name as test.txt
// let the file be in the same localtion
		
	try(PrintWriter writer = new  PrintWriter(new File("/home/mittalsonal04gm/Downloads/test.txt"))) {
		
		writer.println("hello All");
		
	}
	catch(ArithmeticException e){
	   System.out.println(e.getMessage());
	   System.out.println("No fiel found");
	}
		

	}

}

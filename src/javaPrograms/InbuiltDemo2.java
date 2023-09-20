package javaPrograms;

public class InbuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// contains() method
		// this method will check if your expected string has desired set of charcters or not
		// this method will return a boolean output (true or false)
		
		// title page ==> validate if title is correct or not
		// if title is correct print Test case pass, else print testcase fail
		
	// method1 : using contains() method
		
		String title = "Simplilearn Online courses";
		
		if(title.contains("Simplilearn")) {
			System.out.println("Title is valid. Test case pass");
		}
		else {
			System.out.println("Title is not valid. Test case failed");
		}
		
		// Method2: equals()
		// this method will compare 2 strings every character
		// it will give output as true or false

		if(title.equals("Simplilearn Online courses")) {
			System.out.println("Title is valid. Test case pass");
		}
		else {
			System.out.println("Title is not valid. Test case failed");
		}
		
		// Method3: substring()
		
		String title2 = "Practice Labs Java";
		
		// from string title2 extract only Java using substring() method
		// store it in a new string - result
		
	String result =	title2.substring(14);
		
		// Write condition if result equals Java - test case pass
	
	if(result.equals("Java"))
	{
		System.out.println("String is valid");
		
	}
		// else test case fail
	else {
		System.out.println("String is invalid");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

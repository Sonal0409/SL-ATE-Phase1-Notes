package inheritanceDemo;

public class MethodsDemo2 {
	
	// Global variable : variables which are declared at class level.
	// these variables can be be used in any method of the class
	
	int x = 100;
	String str3 = "Java";
	
	public int sum()
	{
		// local variables : variables within a method
		// the scope of variables is only within this method
		// these variables cannot be used outside the methods
		int a =10;
		int b=20;
		int result = a+b+x;
		return result;   // returning integer value hence data type is int
		
	}
	
	public String concatmethod()
	{
		String str1 = "selenium";
		String str2 = "training";
		String result = str1+str2+str3;
		return result;
	}
	
	public void printmethod()
	{
		System.out.println("The global integer variable : " + x);
		System.out.println("The global String variable : " + str3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo2 obj = new MethodsDemo2();
		
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		
		System.out.println(value);
		
		
		obj.printmethod();
		
	

	}

}

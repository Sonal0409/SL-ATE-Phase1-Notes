package inheritanceDemo;

public class MethodsDemo1 {
	 
	// Method written here
	// methods which donot return a value
	
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail()
	{
		System.out.println("Compose an Email");
	}
	
	public void logut()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Create Java Class Object
	// Give a name to the object
		
		MethodsDemo1 obj = new MethodsDemo1();
		
// call the method created in the class
		
		// objname.methodname();
		
		obj.login();
		
		obj.ComposeEmail();
		
		obj.logut();
		
		
		
		
	}

}









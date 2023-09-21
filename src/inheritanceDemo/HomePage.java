package inheritanceDemo;

public class HomePage extends Base{
	// This is going to be child class
	// This is Single level Inheritance
	
	// this is a child class method
	public void Homepagetest()
	{
		System.out.println("Test for Home Page");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create object of child class
		
		HomePage obj = new HomePage();
		
		obj.openbrowser("Chrome");
		login("admin", "admin");
		obj.Homepagetest();
		obj.logut();
		

	}

}

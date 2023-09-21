package inheritanceDemo;

public class OverRiding extends OverLoading {
	

	public String sum(String a, String b)
	{
		
		String result = a+b;
		return result;   // returning integer value hence data type is int
		
	}
	

	public int sum()   // this method is there in parent class and is there in child class
	{
		int a =10;
		int b=20;
		int result = a+b;
		return result;   // returning integer value hence data type is int
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRiding obj = new OverRiding();
		
		
		obj.sum(); // this will call method of child class and not of the parent class
		
	

	}

}








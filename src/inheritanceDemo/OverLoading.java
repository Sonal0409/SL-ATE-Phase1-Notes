package inheritanceDemo;

public class OverLoading {
	
	// In a class can we have methods with same name?
	// method with same name can exisit in a class but each method should have a different paramenter count or 
	// parameter type
	
	public int sum()
	{
		int a =10;
		int b=20;
		int result = a+b;
		return result;   // returning integer value hence data type is int
		
	}

	public int sum(int a, int b)
	{
		a = 10;
		b=20;
		int result = a+b;
		return result;   // returning integer value hence data type is int
		
	}

	public int sum(int a, int b, int c)
	{
		
		int result = a+b+c;
		return result;   // returning integer value hence data type is int
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading obj = new OverLoading();
		
		System.out.println(obj.sum());
		System.out.println(obj.sum(10, 20, 30));

	}

}


















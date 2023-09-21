package exceptionsPrograms;

public class ThrowsDemo {
	
	public void div(int a , int b) throws ArithmeticException
	{
		if (b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c = a/b;
			System.out.println(c);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsDemo t = new ThrowsDemo();
		
		try {
			t.div(10, 0);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Do not give b value as 0");
		}
		
		System.out.println("Execute the code1");
		System.out.println("Execute the code1");
	}

}

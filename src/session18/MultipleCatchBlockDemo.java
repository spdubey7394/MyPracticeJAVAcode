package session18;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program execution is started");
		String s=null; // input as null

		try
		{
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program execution is completed and exited......................");
	}

}

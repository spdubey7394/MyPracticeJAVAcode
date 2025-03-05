package session18;

public class CheckedExceptionWithThrows {

	public static void main(String[] args) throws InterruptedException // throws keyword along with exception name
	{
		System.out.println("Program is staring...");
		System.out.println("Program is executed...");
		
		Thread.sleep(5000); // this statement will throw InterruptedException
		
		System.out.println("Program is exiting...");
		System.out.println("Program is stopped...");

	}

}

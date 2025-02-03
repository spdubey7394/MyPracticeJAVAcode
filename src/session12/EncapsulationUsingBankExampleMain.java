package session12;

public class EncapsulationUsingBankExampleMain {

	public static void main(String[] args) 
	{
		EncapsulationUsingBankExample ee=new EncapsulationUsingBankExample();
		
		//after object creation first the value is set using the set method
		ee.Setcustid(132428156);
		ee.Setaccno(98333);
		ee.setName("Demo");
		ee.setBal(1818);
		
		
		//after the setting the value in the variable, get method is called
		ee.Getcustid();
		ee.Getaccno();
		ee.getName();
		ee.getBal();
		
		//print the values
		System.out.println(ee.Getcustid()+" " + ee.Getaccno()+" " + ee.getName()+" "+ ee.getBal());
		
		
		
		

	}

}

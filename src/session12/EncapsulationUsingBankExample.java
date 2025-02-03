package session12;

public class EncapsulationUsingBankExample 
{
	//in encapsulation all the variables should be declare private using private access modifier and it is class variable
	
	private int custid;
	private int accno;
	private String name;
	private int bal;
	
	//get method is created for each variable individually
	void Setcustid(int custid)
	{
		this.custid=custid; //this keyword represent the class variable 
	}
	
	//set method is created for each variable individually
	int Getcustid()
	{
		return custid;
	}
	
	void Setaccno(int accnoo)
	{
		this.accno=accnoo;
	}
	
	int Getaccno()
	{
		return accno;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getBal() 
	{
		return bal;
	}

	public void setBal(int bal) 
	{
		this.bal = bal;
	}

	//We can also the generate the get and set method, by using feature in eclipse by moving the cursor on variable
	//from the Source tab, select the generate setters and getters option

}

package sessionTen;

public class Employee {

	//variables
	int eid;
	int esal;
	String location;
	String ename;
	
	//Methods
	
	void display()
	{
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(location);
		System.out.println(ename);

		
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.eid=123;
		emp.esal=77100;
		emp.location="mumbai";
		emp.ename="savid";
		emp.display();
		
		
		

	}

}

package sessionTen;

public class Employee {

	//variables - variable declared outside main method can be used in the class anywhere
	int eid;
	int esal;
	String location;
	String ename;
	
	//Methods
	
	void display()  // when method will not return any value void should be declared
	{
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(location);
		System.out.println(ename);

		
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee(); // new object is created
		emp.eid=123; // to call the method (object.method variable + object.method) is used; 
		emp.esal=77100;
		emp.location="mumbai";
		emp.ename="savid";
		emp.display();
		
		
		

	}

}

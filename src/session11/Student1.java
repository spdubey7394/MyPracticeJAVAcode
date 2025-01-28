package session11;

public class Student1
{
	//below are the class variable it can be used anywhere in the class
	int rollno;
	String name;
	char grade;
	
	
	//Approach 1: Store data using object variable reference
	void PrintStudentData()
	{
		System.out.println(rollno+ " " + name+ " " + grade);
	}
	
	//Approach 2: Using user defined method
	//below variables are the local variables whose can be accessible in the method only 
	void SetStudentData(int srollno, String sname, char sgrade)
	{
		//first class variable = local variable
		rollno=srollno;
		name=sname;
		grade=sgrade;
	}
	
	//Approach 3: Using constructor
	
	Student1(int srollno, String sname, char sgrade)
	{
		rollno=srollno;
		name=sname;
		grade=sgrade;
	}
	

}

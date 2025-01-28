package session11;

public class Student1Main
{
	public static void main(String[] args) {
		//Approach 1: Store data using object variable reference
	
	//	Student1 stu=new Student1();
	/*	stu.rollno=07;
		stu.name="Surya";
		stu.grade='A';
		stu.PrintStudentData(); */
		
		//Approach 2: Using user defined method
		//stu.SetStudentData(7, "Surya", 'A');
		//stu.PrintStudentData();
		
		
	//Note: commented the above created object for the class, 
		//since we need to have parameters while created object based on approach 3 constructor	
		
	//Approach 3: using constructor
		
		Student1 stu=new Student1(07, "Suryaprakash", 'A');
        stu.PrintStudentData();
		
		
		
		
		
		
		
	}

}

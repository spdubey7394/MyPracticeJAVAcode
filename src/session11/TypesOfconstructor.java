package session11;

public class TypesOfconstructor {
	//TYPE 1: Default constructor
	
			TypesOfconstructor()
			{
				System.out.println("this is a default constructor");
			}
			
			
   //TYPE 2: Parameterized Constructor
			
			TypesOfconstructor(int id)
			{
				System.out.println("this is a parameterized constructor:  " + id);
			}

	public static void main(String[] args) 
	{
		//Type 1: Default constructor
	//	TypesOfconstructor con=new TypesOfconstructor();
		
		//Type 2: Default constructor
		TypesOfconstructor con=new TypesOfconstructor(77);
	}

}

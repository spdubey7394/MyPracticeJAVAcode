package session11;

public class TyesOfMethodsMain {

	public static void main(String[] args) 
	{
		//method 1: No parameter, no return value
		
		TyesOfMethods tm=new TyesOfMethods();
		tm.m1();
		
		//method 2: No parameter, returns value
        String s1=tm.m2(); // always needs a variable to store and display the data
        System.out.println(s1);
        
    	//method 3: Takes parameter, returns value
         String s2=tm.m3("Surya"); // we can also display the results by directly putting tm.m3 in print statement
         System.out.println(s2);
         
        //method 4: Takes parameter, no return value
         tm.m4("Surya");


	}

}

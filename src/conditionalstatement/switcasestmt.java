package conditionalstatement;

public class switcasestmt {

	public static void main(String[] args) {
		int weekday=12;
		
		switch(weekday)
		{
		
		    
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		            default:
		                System.out.println("Invalid day number");
		               break;
		        }
		String weekname = "monday";
		
			switch(weekname)
			{
			case "sunday": System.out.println("today is holiday ");
			break;
			case "monday": System.out.println("today is working");
			break;
			default: System.out.println("koi na aaj sick leave le lo");
			break;
			
		}
		    }
		
		

	}



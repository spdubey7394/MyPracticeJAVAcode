package Day3;

public class Ternaryconditionaloperator {

	public static void main(String[] args) {
		// example 1
		
		int a=200; int b=100;
		int x=(a>b)?a:b;
		System.out.println(x);
		
		// example 2
		int c=200; int d=300;
		int y=(c>d)?c:d;
		System.out.println(y);
		
		//example 3
		
		int z=(1==1)?50:100;
		System.out.println(z);
		
		//example 4 for voting eligible using string
		
		int age=40;
		String result=(age>=18)?"You are eligible for voting":"You are not eligible for voting";
		System.out.println(result);
		
		
		

		

	}

}

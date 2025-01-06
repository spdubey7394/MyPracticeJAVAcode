package loopingstmts;

public class reversenumberdemo {

	public static void main(String[] args) {
		int num=454;
		int rem, temp, sum=0; 
		temp=num;
		
		while(num!=0||num>0)
		{
		  rem=num%10;
		  sum= sum * 10 + rem;
		  num=num/10;
		}
         System.out.println("reverse no:" + sum);  // reverse no
	
         if(sum==temp)   // palindrome
         {
        	 System.out.println("it it palindrome");
         } 
         else
         {
        	 System.out.println("it is not palindrome");
         }
	}
	

}

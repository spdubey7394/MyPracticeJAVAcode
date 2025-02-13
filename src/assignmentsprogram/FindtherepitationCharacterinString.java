package assignmentsprogram;

public class FindtherepitationCharacterinString {

	public static void main(String[] args) 
	{
		String s="suryaprakash";
		int count=0;
		char find_char='s';
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==find_char)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}

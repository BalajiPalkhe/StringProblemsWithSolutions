package stringlec;

public class ProgramtoComapretwoStringsLexicographically 
{

	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2 ="abcd";
		int count=0;
		
		if(s1.length()==s2.length())
		{
			for(int i=0; i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println((int)s1.charAt(i)-(int)s2.charAt(i));
					count++;
					break;
				}
			}
			if(count==0)
			System.out.println(s1.length()-s2.length());
		}
		else
		System.out.println(s1.length()-s2.length());
	}

}

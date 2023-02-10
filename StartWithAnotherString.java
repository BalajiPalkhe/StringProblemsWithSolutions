package stringlec;

public class StartWithAnotherString 
{
	public static void main(String[] args) 
	{
		String s1 ="Priyaabcd";
		String s2 ="abcd";
				
		boolean result=check(s1,s2);
		System.out.print(result);
	}
	static boolean check(String s1, String s2)
	{
		for(int i=0; i<s2.length()|| i<s1.length();i++)
		{
			if(s2.charAt(i)!=s1.charAt(i))
			return false;
		}
		return true;
	}
		

}







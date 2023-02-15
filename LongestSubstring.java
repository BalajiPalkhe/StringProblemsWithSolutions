package stringlec;

public class LongestSubstring {

	public static void main(String[] args) 
	{
		String s2="";//it will be the longest String-

		String s= "abcdabcabaabcdef";
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				String s1=mySubstring(s,i,j);
				boolean result=areAllCharacterUnique(s1);
				if(result)
					if(s1.length()>s2.length())
						s2=s1;
			}
		}
		System.out.println(s2);
	}

	private static boolean areAllCharacterUnique(String s1) 
	{
		for(int i=0; i<s1.length();i++)
		{
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					return false;
			}
		}
		return true;
	}

	private static String mySubstring(String s, int i, int j) 
	{
		String s1="";
		for (int k = i; k <=j ; k++) 
		{
			s1=s1+s.charAt(k);
		}
		return s1;
	}

}

package stringlec;

public class IsPalindromeString 
{

	public static void main(String[] args) 
	{
		String s="nitin";
		boolean result=isPalindrome(s);
		
		System.out.println(result?"Palindrome":"Not");
	}

	private static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}

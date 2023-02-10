package stringlec;

public class ComapreTwoStringLexicographicallyIngnoringCaseDiff 
{

	public static void main(String[] args)
	{
		String s1 ="abcd";
		String s2 ="abCd";
		s1=myLowercase(s1);
		s2=myLowercase(s2);
		int a=myCompare(s1,s2);
		System.out.println(a);
	}
	static int myCompare(String s1, String s2)
	{
		for(int i=0; i<s1.length() && i<s2.length();i++)
		{
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1!=ch2)
			{
				return ch1-ch2;
			}
		}
		return s1.length()-s2.length();
	}
	static String myLowercase(String s1)
	{
		char[] a=s1.toCharArray();
		char[] al=new char[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				al[i]=(char)((int)a[i]+32);
			}
			else
			al[i]=a[i];
		}
		String sa=new String(al);
		return sa;

	}

}

package stringlec;

public class RemoveSpecificChar 
{

	public static void main(String[] args) 
	{
		String s1="abccd";
		
		String[] s=s1.split("c");
		String s2="";
		for (int i = 0; i < s.length; i++) {
			s2=s2+s[i];
		}
		System.out.println(s2);
	}
}
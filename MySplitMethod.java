package stringlec;

public class MySplitMethod {

	public static void main(String[] args) 
	{

		String s1="You are very good student";
		
		String s2="";
		
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==' ')
			{
				System.out.println(s2);
				s2="";
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}

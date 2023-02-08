package stringlec;

public class ReverseStringChar 
{

	public static void main(String[] args) 
	{

		String s1="Pune";
		
		String s2="";
		//by applying normal for loop
		for (int i = 0; i < s1.length(); i++) 
		{
			s2=s1.charAt(i)+s2;
		}
		
		System.out.println(s2);
		
		String s3="";
		// By applying reverse for loop
		for (int i = s1.length()-1; i >=0; i--) 
		{
			s3=s3+s1.charAt(i);
			
		}
		System.out.println(s3);
	}

}

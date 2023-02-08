package stringlec;

public class RemoveExtraSpaces {

	public static void main(String[] args) 
	{

		String s1="      Pune      is     best   city           ";
		
		String s=myTrim(s1);
		//System.out.println(s);
		
		String s2="";
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')	
			{}
			else
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		
	}

	private static String myTrim(String s1) {
		int i=0;
		while(true)
		{
			if(s1.charAt(i)==' ')
			i++;
			else
				break;
		}
		
		int j=s1.length()-1;
		while(true)
		{
			if(s1.charAt(i)==' ')
			j--;
			else
				break;
		}
		String s2=""; 
		for (int j2 = i; j2 <= j; j2++) 
		{
			s2=s2+s1.charAt(j2);
			
		}
		
		return s2;
	}

}

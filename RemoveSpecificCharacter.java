package stringlec;

public class RemoveSpecificCharacter {

	public static void main(String[] args)
	{
		String s1="Balaji";
		char ch='i';
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!=ch)
			System.out.print(s1.charAt(i));
		}
	}

}

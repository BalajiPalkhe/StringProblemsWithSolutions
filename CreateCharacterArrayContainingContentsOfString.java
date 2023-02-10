package stringlec;

public class CreateCharacterArrayContainingContentsOfString 
{

	public static void main(String[] args) 
	{

		String s1="Balaji";
		char[] ch=new char[s1.length()];
		for(int i=0; i<s1.length(); i++)
		{
			ch[i]=s1.charAt(i);
			System.out.print(ch[i]+" ");
		}

	}

}

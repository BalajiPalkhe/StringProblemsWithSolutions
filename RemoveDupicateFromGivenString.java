package stringlec;

public class RemoveDupicateFromGivenString 
{

	public static void main(String[] args) 
	{
		String s1 = "abbcfedafbcd";
		
		for(int i=0; i<s1.length(); i++)
		{
			int count=0;
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				count++;
			}
			if(count==0)
			System.out.print(s1.charAt(i));
		}

	}

}

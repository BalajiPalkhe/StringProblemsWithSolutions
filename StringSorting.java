package stringlec;

public class StringSorting 
{
	public static void main(String[] args) 
	{
		String[] s={"Latur","pune"};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (String a : s)
		{
			System.out.println(a);
		}
	}
}

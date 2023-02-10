package stringlec;

public class GetTheCharacterAtGivenIndex {

	public static void main(String[] args) 
	{

		String s1="Balaji";
		int index=1;
		char[] c=s1.toCharArray();
		int d=0;
		for(int i=0; i<c.length; i++)
		{
			if(i==index)
			{
				System.out.print(c[i]);
				d++;
			}
		}
		if(d==0)
		System.out.println("out of range index");

	}

}

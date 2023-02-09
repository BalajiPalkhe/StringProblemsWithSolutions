package stringlec;

public class MaxFrequencyofStringChar 
{

	public static void main(String[] args) 
	{
		String s1 = "abcaabcb";
		
		int max=0;
		int index=0;
		for(int i=0; i<s1.length();i++)
		{
			int count=0;
			for(int j=i; j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				count++;
			}
			if(count>max)
			{
				max=count;
				index=i;
			}
		}
		System.out.println(max+"\n"+s1.charAt(index));

	}

}

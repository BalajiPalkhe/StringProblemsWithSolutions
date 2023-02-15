package stringlec;

import java.util.Iterator;

public class MySplitMethodArray 
{

	public static void main(String[] args) 
	{
		String s1="You are very good student";
		
		String s2="";
		
		int spaceCount=mySpaceCount(s1);
		String[] sa=new String[spaceCount+1];
		
		int index=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==' ')
			{
				sa[index++]=s2;
				s2="";
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}

		sa[index++]=s2;

		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
		
	}

	private static int mySpaceCount(String s1) 
	{
		int spaceCount=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==' ')
				spaceCount++;
			
		}
		return spaceCount;
	}

}

package stringlec;

public class ComapreGivenStringWithSpecifiedCharacterContentOrNot 
{

	public static void main(String[] args) 
	{
		
			String s1="abcd";
			String s2="abcd";
		
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			boolean result=checkEquality(c1,c2);
				System.out.println(result);
			}
			static boolean checkEquality(char[] c1, char[] c2)
			{
				if(c1.length!=c2.length)
				return false;
				for(int i=0; i<c1.length; i++)
				{
					if(c1[i]!=c2[i])
					return false;
				}
				return true;
			}

}



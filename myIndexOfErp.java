package stringlec;

public class myIndexOfErp {

	public static void main(String[] args) {

		String s1 ="abcd";
		String s2="cd";
	
		int num=myIndexOfMethod(s1,s2);
		System.out.println(num);
	}
	private static int myIndexOfMethod(String s1, String s2) 
	{
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s2.length()>0)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					int j=i;
					int k=0;
					int similarCount=0;
					while(k<s2.length() && j<s1.length())
					{
						if(s1.charAt(j)==s2.charAt(k))
						similarCount++;
						else
						break;
						j++;
						k++;
					}
					if(similarCount==s2.length())
					return i;
				}
			}
			else
			return 0;
		}
		return -1;
	}

}

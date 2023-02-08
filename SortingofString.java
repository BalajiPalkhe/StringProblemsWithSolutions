package stringlec;

public class SortingofString {

	public static void main(String[] args) {

		String s1="4321jajkAS";
		
		char[] c=s1.toCharArray();
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
		}
		
		s1=new String(c);
		System.out.println(s1);
	}

}

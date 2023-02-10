package stringlec;

public class ConvertToUppercase 
{
	public static void main(String[] args) 
	{
		String s1="WELCOME To My Home";
				
		char[] a=s1.toCharArray();
		
		for(int i=0; i<a.length; i++)
		{
			if((int)a[i]>96 && (int)a[i]<123)
			System.out.print((char)((int)a[i]-32));
			else
				System.out.print(a[i]);
		}
	}
}

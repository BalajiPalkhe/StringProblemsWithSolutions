package stringlec;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String s="Pune";
		
		char[] c=s.toCharArray();//Converted String into Character Array
		int i=0;
		int j=c.length-1;
		
		while(i<j)
		{
			//Swapping with third variable
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
			
		}
		
		s=new String(c);
		System.out.println(s);

	}

}

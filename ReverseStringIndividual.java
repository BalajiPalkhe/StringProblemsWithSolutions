package stringlec;

public class ReverseStringIndividual {

	public static void main(String[] args) {
		
		String s1="Pune is best City";
		
		String[] sa=s1.split(" ");
		
		for (int i = 0; i < sa.length; i++) 
		{
			String so=sa[i];
			String sr="";
			for (int j = 0; j < so.length(); j++)
			{	
				sr=so.charAt(j)+sr;
				sa[i]=sr;
			}
		}
		
		for (int i = 0; i < sa.length; i++) 
		{

			System.out.print(sa[i]+" ");
		}

	}

}

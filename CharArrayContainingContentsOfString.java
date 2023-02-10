package stringlec;

public class CharArrayContainingContentsOfString {

	public static void main(String[] args) {

		String s1="Welcome";
		char[] ch=new char[s1.length()];
		for(int i=0; i<s1.length(); i++)
		{
			ch[i]=s1.charAt(i);
			System.out.print(ch[i]+" ");
		}
	}

}

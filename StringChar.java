package stringlec;

// Create Char Array without using toCharArray----------------------------
public class StringChar {

	public static void main(String[] args) {
		
		String s="Pune";
		
		char[] ch=new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) 
		{
			ch[i]=s.charAt(i);
			System.out.println(ch[i]);
		}

	}

}

package stringlec;

// Write a program to repeat each of the character twice in a given string.-------------
public class RepeatEachCharTwice {

	public static void main(String[] args) {

		String s="Balaji";
		
		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			s2=s2+ch+ch;
		}
		
		System.out.println(s2);
	}

}

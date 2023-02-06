package stringlec;

//Write a program to create a new String object with the contents of a character array
public class CharIntoString {

	public static void main(String[] args) {

		char[] ch= {'H','E','F','S','H','I','N','E',};
	
		String a="Pune";
		
		//Char Array to string------------------------
		
		String s=new String(ch);
		
		System.out.println(s); //Char Array to string
		
		//String to Char Array-------------------------
		char[] cha=a.toCharArray();
		
		for (int i = 0; i < cha.length; i++) 
		{
			System.out.println(cha[i]);
			
		}
		
	}

}

package stringlec;
//Write a program to get the index of all the characters within the String-----------------------
public class PrintCharAndIndex {

	public static void main(String[] args) {

		String s="ABCD";
		System.out.println("Character with its Index value");
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i)+" "+i);
			
		}
		
	}

}

package stringlec;

// Write a program to test if a given string contains only digits------------------
public class OnlyDigit {

	public static void main(String[] args) {
		String s="1026";
		
		if(onlyDigit(s))
			System.out.println("Only Digit");
		else
			System.out.println("Not only Digit");
	}

	private static boolean onlyDigit(String s) {
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				return false;
		}
		return true;
	}

}

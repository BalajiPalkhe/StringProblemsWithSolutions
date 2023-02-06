package stringlec;

// Write a program to return the sum of the digits present in the given string.If there is no digits the sum return is 0

public class SumofDigitsinString {

	public static void main(String[] args) {
		
		String s="123hshv";
		
		int sum=sumofDigit(s);
		System.out.println(sum);

	}

	private static int sumofDigit(String s) {

		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-48;
			}
			
		}
		return sum;
	}

}

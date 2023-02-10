package stringlec;

public class ReplaceDWithF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcddcba";
		char ch1='d';
		char ch2='f';
		
		char[] ch=s1.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]==ch1)
			ch[i]=ch2;
			System.out.print(ch[i]);
		}

	}

}

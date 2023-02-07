package stringlec;

public class PredefinedMethodsForIndexofString {

	public static void main(String[] args) {

		String s1="Hefshinesh";
		String s2="sh";
		
		int index=s1.indexOf(s2);//To get Starting index of second string in first String
		System.out.println(index);
		
		int index2=s1.lastIndexOf(s2);//To get last index of second string in first String
		System.out.println(index2);
		
//		s1.
		s1=s1.replace('H', 'K');//To Replace any character in String by another Character 
		System.out.println(s1);
		
		String s="pune";
		s=s.toUpperCase();//To convert the String to UpperCase
		System.out.println(s);
		
		s1=s1.toLowerCase();//To convert the String to lowerCsse
		System.out.println(s1);
		s=s.replace('s','d' );
	}

}

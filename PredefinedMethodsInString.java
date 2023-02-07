package stringlec;

public class PredefinedMethodsInString 
{

	public static void main(String[] args) 
	{
		String s1="abcd";
		
		String s2="abdd";

//------------------------------------------------------------------------------------------------------
		/*compareTo(String args) return type is int
		The Java String class compareTo() method compares the given string with the current string 		lexicographically(Alphabetically). It returns a positive number, negative number, or 0.

		It compares strings on the basis of the Unicode value of each character in the strings.

		If the first string is lexicographically greater than the second string, it returns a positive 		number (difference of character value). If the first string is less than the second string 		lexicographically, it returns a negative number, and if the first string is lexicographically equal 		to the second string, it returns 0.*/
		
		int result=s2.compareTo(s1);
		System.out.println(result);
		
//-------------------------------------------------------------------------------------------		
		//compareToIgnoreCase(args) used to compare String irrespective of their Case.

		int r=s1.compareToIgnoreCase(s2); //return type is int
		
		System.out.println(r);
		
//---------------------------------------------------------------------------------------------
		String a="HefshineSoftwaresPvtLtdPune";
		String b="Hef";
		
	
		boolean Startwith=a.startsWith(b);//check whether string starts with another String return type boolean ....It cant Ignore Case....They Are Case Sensitive
		System.out.println(Startwith);
		
		String s3="pune";
		boolean endswith=a.endsWith(s3);//check whether string ends with another String return type boolean
		System.out.println("re : "+endswith);
		
		boolean contains=a.contains(s3);//check whether string contains another String return type boolean
		System.out.println(contains);
		
		
		String s4=a+b+s3;
		
		System.out.println(s4);
		
		String s5="Pune";
		String s6="pune";	
		
		if(s5.equalsIgnoreCase(s6))//check whether both Strings are equal or not...Return type is boolean..It is not Case Sensitive..
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		
		String s7="Rushi hushar ahe";
		
		String[] sa=s7.split(" "); //To Split String into String Array
		
		for (int i = sa.length-1; i >=0; i--) 
		{
			System.out.print(sa[i]+" ");
			
		}
	}

}

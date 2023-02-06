package stringlec;

//Write a program to create strings using new and using literal.
public class CreateStringUsingNewandLiteral {

	public static void main(String[] args) {
		
		String a="Pune";
		String b=new String("PuneMumbai");
		
		System.out.println("String with Literal");
		for (int i = 0; i < a.length(); i++) 
		{
			System.out.println(a.charAt(i));
		}
		
		System.out.println();
		System.out.println("String with object Creation");
		for (int i = 0; i < b.length(); i++) 
		{
			System.out.println(b.charAt(i));
		}

	}

}

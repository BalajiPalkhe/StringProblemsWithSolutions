package stringlec;

public class SecondMostFrequentChar {

	public static void main(String[] args)
	{
		String s1="abbbbanhjki";
		
		char[] ca=uniqueElement(s1); //Create Array of unique element 
		
		int[] ia=new int[ca.length];//Create Integer array for the frequency of all character 
		
		
		//Integer array of frequency of all character
		for (int i = 0; i < ca.length; i++) 
		{
			int count=0;
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s1.charAt(j)==ca[i])//Compared each element of String with unique element.
					count++;
			}
			ia[i]=count; //Added frequency of all unique element into integer Array 
		}
		
		//basic sorting of unique character array and Integer array of having frequency 
		for (int i = 0; i < ia.length; i++) 
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				if(ia[i]>ia[j])
				{
					//Frequency array swapping
					int temp=ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
					
					//character array Swapping
					char temp1=ca[i];
					ca[i]=ca[j];
					ca[j]=temp1;
				}
				
			}
		}
		
		//To find out second max first find maximum frequent character
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ia.length; i++) 
		{
			if(ia[i]>max)
				max=ia[i];
		}
		
		//Now find out second max frequent value and index of that character
		int max2=Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < ia.length; i++) 
		{
			if(ia[i]<max && ia[i]>max2)
			{
				max2=ia[i];
				index=i;//index for getting second most frequent element from character array
			}
		}
		System.out.println(ca[index]+" "+max2);

		
	}

	private static char[] uniqueElement(String s) 
	{
		//Logic for Removing duplicate array

		char [] c=s.toCharArray();//String converted into character array
		
		int uniqueCount=0;
		
		//Calculate unique count for the size of unique character array
		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = 0; j < i; j++) 
			{
				if(c[i]==c[j])
					count++;
			}
			if(count==0)
				uniqueCount++;//size of unique character array
		}
		
		char[] ca=new char[uniqueCount];//size of unique character array with default value 0
		
		int index=0;
		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = 0; j < i; j++) 
			{
				if(c[i]==c[j])
					count++;
			}
			if(count==0)
				ca[index++]=c[i];//Added unique element into Unique element array
		}
		
		return ca;//Returned that unique array

		
	}

}

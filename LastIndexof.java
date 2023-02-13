package stringlec;

public class LastIndexof {

	public static void main(String[] args) {
		
				String s1="Pune";
				String s2="Pune1";
				
				int num=myIndexOfMethod(s1,s2);
				System.out.println(num);
				
			}

			private static int myIndexOfMethod(String s1, String s2) 
			{
				for (int i = s1.length()-1; i >=0; i++) 
				{
					if(s1.charAt(i) ==s2.charAt(0))
					{
						int j=i+1;
						int k=1;
						int similarCount=1;
						while(k<s2.length() && j<s1.length())
						{
							if(s1.charAt(j)==s2.charAt(k))
								similarCount++;
							else
								break;
							j++;
							k++;
						}
						if(similarCount==s2.length())
							return i;
					}
				}
				return -1;
			}
		}


	
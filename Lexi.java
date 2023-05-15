package String;

public class Lexi {
	
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 ="abcd";
			String s2 ="abCd";
			myCode(s1,s2);
		}
		//EndOfMainMethod
		private static void myCode(String s1,String s2) 
		{
			int Ans=myLexi(s1,s2);
			System.out.println(Ans);
		}
		private static int myLexi(String s1, String s2)
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			for(int i=0; i<s1.length() && i<s2.length(); i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					return s1.charAt(i)-s2.charAt(i);
				}
			}
			return s1.length()-s2.length();
		}
	}

	
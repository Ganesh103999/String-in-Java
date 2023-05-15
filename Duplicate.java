public class Duplicate
{
	public static void main(String[] args)
	{
		String s1="abbbaaabsddnnnnnd";
		
		String s2="";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(element(s1,i)==false)
				s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
		private static boolean element(String s1,int i)
		{
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					return true;
				}
				
			}
			return false;
		}
	}

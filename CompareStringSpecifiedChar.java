	public class CompareStringSpecifiedChar
{
	public static void main(String[] args)
	{
		String s1="abcd";
		String s2="cdab";
		
	boolean Ans=myCompare(s1,s2);
	System.out.println(Ans);
	}
	private static boolean myCompare(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					return false;
				}
			}
			
			return true;
		}
		else
		return false;
	}
}

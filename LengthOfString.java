public class LengthOfString
{
	public static void main(String[] args)
	{
		String s1="abcd";
		
		for(int i=0; i<s1.length(); i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println("\n"+s1.length());
	}
}
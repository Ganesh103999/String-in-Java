public class LowerCase
{
	public static void main(String[] args)
	{
		String s1="WELCOME";
		
		String s2="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				s2=s2+(char)(ch+32);
			}
			else
				s2=s2+ch;
		}
		System.out.println(s2);
	}
}
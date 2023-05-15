public class Replace
{
	public static void main(String[] args)
	{
		String s1="dddee";
		char ch1='d';
		char ch2='f';
		
		String s2="";
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==ch1)
			{
				s2=s2+ch2;
			}
			else
				s2=s2+s1.charAt(i);
		}
		System.out.print(s2+" ");
	}
}
	
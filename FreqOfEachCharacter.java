
public class FreqOfEachCharacter 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "aabbcc";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		for(int i=0; i<s1.length(); i++)
		{
			boolean Result=OriginalChar(s1,i);
			if(Result==true)
			{
				int cnt=givenFrq(s1,s1.charAt(i));
				System.out.println(s1.charAt(i)+" "+cnt);
			}
		}
	}
	private static boolean OriginalChar(String s1, int i)
	{
		for(int j=0; j<i; j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
	private static int givenFrq(String s1, char ch)
	{
		int cnt=0;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==ch)
			{
				cnt++;
			}
		}
		return cnt;
	}
}
/*
OutPut
a 2
b 2
c 2

*/

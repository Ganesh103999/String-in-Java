package String;

public class OnlyDigitCnt 
{
	public static void main(String[] args) 
	{
		
		String s1 ="1f23";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		char[] ca = s1.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ca.length; i++)
		{
			if (ca[i] > '0' && ca[i] < '9')
			{
				cnt++;
			}
		}
		if (cnt == s1.length())
		{
			System.out.println("contains only digits");
		}
		else
		System.out.println("not contains only digit");
	}
}

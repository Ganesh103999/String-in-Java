package String;

public class Assi30 {

	public static void main(String[] args) 
	{
		String s = "aaaaabbbbbbsbbsbssss";
		for (int i = 0; i < s.length(); i++) 
		{
			boolean result = isToOriginalChar(s, i);
			if (result == true)
			{
				int count = giveMeFreq(s, s.charAt(i));
				System.out.println(s.charAt(i) + " " + count);
			}

		}
	}

	private static int giveMeFreq(String s, char ch) 
	{
		int cnt=0;
		for (int i = 0; i <s.length(); i++)
		
			if(s.charAt(i)==ch)
				cnt++;
		
		return cnt;
	}

	private static boolean isToOriginalChar(String s, int i) 
	{
		for (int j = 0; j < i; j++)
			if (s.charAt(i) == s.charAt(j))
				return false;
		return true;
	}

}

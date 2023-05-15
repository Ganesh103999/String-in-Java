package String;

public class EqualsMethod {

	public static void main(String[] args) 
	{
		String s1 = "abscd";
		String s2 = "abscd";
		boolean euqals = s1.equals(s2);
		System.out.println(euqals);

		boolean myAns = myEquals(s1, s2);
		System.out.println(myAns);
	}

	private static boolean myEquals(String s1, String s2) 
	{
		if (s1.length() == s2.length())
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				if (s1.charAt(i) != s2.charAt(i))
					return false;
			}

			return true;
		}

		return false;
	}

}

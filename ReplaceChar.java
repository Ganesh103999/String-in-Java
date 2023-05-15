package String;

public class ReplaceChar {

	public static void main(String[] args) {
		String s1 = "HefSshinePune";
		String s2 = replace(s1, 'e', 'd');

		System.out.println(s2);

	}

	private static String replace(String s1, char c, char d)
	{
		String s3 = "";
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == c) 
			{
				s3 = s3 + d;

			} else 
			{
				s3 = s3 + s1.charAt(i);
			}
		}
		return s3;
	}

}

package String;

public class Indexof {

	public static void main(String[] args) 
	{
		String s1 = "abddhsaab";
		String s2 = "aab";

		int Ans = Indexofss(s1, s2);
		System.out.println(Ans);

	}

	private static int Indexofss(String s1, String s2)
	{
		if (s2.length() == 0)
			return 0;
		for (int i = 0; i <= s1.length() - s2.length(); i++) 
		{
			if (s2.charAt(0) == s1.charAt(i)) 
			{
				int s1index = i;
				int s2index = 0;
				int cnt = 0;
				while (s2index < s2.length())
				{
					if (s1.charAt(s1index) == s2.charAt(s2index))
					{
						s1index++;
						s2index++;
						cnt++;

					} 
                                           else

						break;

				}
				if (cnt == s2.length()) 
				{
					return i;
				}

			}

		}
		return -1;

	}
}

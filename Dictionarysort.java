package String;

import java.util.Arrays

public class Dictionarysort {

	public static void main(String[] args)
	{
		String s1 = "Wellcome to hefshine";
		String[] sa = s1.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i + 1; j < sa.length; j++) 
			{
				if (Dictionary(sa[i], sa[j]) > 0) 
				{
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}

			}
		}
		//System.out.println(Arrays.toString(sa));
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i] + " ");
		}
	}

	private static int Dictionary(String s1, String s2) {
		for (int i = 0; i < s1.length() && i < s2.length(); i++)
		{
			if (s1.charAt(i) != s2.charAt(i))
			{
				return s1.charAt(i) - s2.charAt(i);
			}

		}
		return s1.length() - s2.length();
	}

}

package String;

import java.util.Iterator;

public class sortString26 {

	public static void main(String[] args) {
		String s = "54321";

		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = i + 1; j < ca.length; j++)
			{
				if (ca[i] > ca[j]) 
				{
					char ch = ca[i];
					ca[i] = ca[j];
					ca[j] = ch;

				}
			}
		}
		String s1 = new String(ca);
		s = s1;
		System.out.println(s);

	}

}

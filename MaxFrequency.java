package String;

import java.util.Iterator;

public class MaxFrequency {

	public static void main(String[] args) {
		String s = "abcdabbbdbcccaaaa";
		String s1 = giveMeuniqueString(s);
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int cnt = giveMeCount(s, ch);
			System.out.println(ch + " " + cnt);
		}

	}

	private static int giveMeCount(String s, char ch) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				cnt++;

		}
		return cnt;
	}

	private static String giveMeuniqueString(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			boolean result = isCharPresent(s1, ch);
			if (result == false)
				s1 = s1 + ch;

		}
		return s1;
	}

	private static boolean isCharPresent(String s1, char ch) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch)
				return true;

		}
		return false;
	}

}

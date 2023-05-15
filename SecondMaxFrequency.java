package String;

import java.util.Iterator;

public class SecondMaxFrequency {

	public static void main(String[] args) {
		String s = "abcddddddddddddabbbdbcccaaaaeeeeeeeeeeeeeeeeeee";
		String s1 = giveMeuniqueString(s);

		Data[] a = new Data[s1.length()];

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int cnt = giveMeCount(s, ch);
			a[i] = new Data(ch, cnt);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].cnt < a[j].cnt) {
					Data temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println(a[1].ch + " " + a[1].cnt);

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

class Data {
	char ch;
	int cnt;

	Data(char ch, int cnt) {
		this.ch = ch;
		this.cnt = cnt;
	}

}

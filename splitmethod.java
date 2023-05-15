package String;

import java.util.Arrays;

public class splitmethod {

	public static void main(String[] args) {
		String s1 = "you all are good Students";
		char ch = ' ';
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch)
				cnt++;

		}
		String[] sa = new String[cnt + 1];
		String s = "";
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				s = s + s1.charAt(i);

			} else {
				sa[index] = s;
				index++;
				s = "";

			}

		}
		sa[index] = s;
		// for (int i = 0; i < sa.length; i++) {
		// System.out.print(sa[i] + " ");
		System.out.println(Arrays.toString(sa));

	}

}

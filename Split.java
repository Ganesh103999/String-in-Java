package String;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String s1 = "you all are very good students";

		char ch = ' ';
		int size = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch)
				size++;
		}
		String[] sa = new String[size + 1];
		String s2 = "";
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				s2 = s2 + s1.charAt(i);
			}

			else {
				sa[index] = s2;
				index++;
				s2 = "";
			}

		}
		sa[index] = s2;
		// System.out.println(Arrays.toString(sa));
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i] + " ");
		}
	}
}

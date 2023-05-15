package String;

public class SplitMethodd {

	public static void main(String[] args) {
		String s1 = "abc   press    jkl   xyz";
		char ch = ' ';
		String[] sa = myCode(s1, ch);

		for (int i = 0; i < sa.length; i++) {
			if (i < sa.length - 1) {
				System.out.println(sa[i] + " ");
			} else
				System.out.println(sa[i]);
		}
	}
	private static String[] myCode(String s1, char ch) {
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch) {
				cnt++;
			}
		}
		System.out.println(cnt);

		String[] sa = new String[cnt + 1];
		int index = 0;
		String s = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				s = s + s1.charAt(i);
			} else
				sa[index++] = s;
			s = "";
			if (i == sa.length - 1) {
				sa[index++] = s;
			}
		}
		return sa;
	}
}

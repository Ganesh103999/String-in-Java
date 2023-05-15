package String;

public class MinFreq {

	public static void main(String[] args) {
		String s1 = "aaacbbbc";
		int min = Integer.MAX_VALUE;

		char ch = 0;
		for (int i = 0; i < s1.length(); i++) {
			boolean result = isOriginalChar(s1, i);
			if (result == true) {
				int cnt = givefreq(s1, s1.charAt(i));

				if (cnt < min) {
					min = cnt;
					ch = s1.charAt(i);
				}
			}
		}
		System.out.println(min);
		System.out.println(ch);
	}

	private static int givefreq(String s1, char ch) {
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt++;
	}

	private static boolean isOriginalChar(String s1, int i) {
		for (int j = 0; j < i; j++) {

			if (s1.charAt(i) == s1.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}

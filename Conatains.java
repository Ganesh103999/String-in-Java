package String;

public class Conatains {

	public static void main(String[] args) {
		String s1 = "HefshibeHefshibe";
		String s2 = "ibe";

		boolean Ans = myContains(s1, s2);
		System.out.println(Ans);
	}

	private static boolean myContains(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				int cnt = 0;
				int j = i;
				int k = 0;
				while (k < s2.length() && j < s1.length()) {
					if (s1.charAt(j) == s2.charAt(k)) {
						cnt++;
						j++;
						k++;
					}
				}

				if (cnt == s2.length())
					return true;
			}
		}
		return false;
	}

}

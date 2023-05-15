package String;

public class UpperCase {

	public static void main(String[] args) {
		String s1 = "abd";
		String upper = s1.toUpperCase();

		String myAns = myUpperCase(s1);
		System.out.println(myAns	);

	}

	private static String myUpperCase(String s1) {
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char temp = (char) (ch - 32);
				s2 = s2 + temp;
			} else {
				s2 = s2 + ch;
			}

		}
		return s2;
	}

}

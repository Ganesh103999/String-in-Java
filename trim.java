	package String;

public class trim {

	public static void main(String[] args) {
		String s1 = "    abcd     ab    ";
		int start = findStart(s1);
		int end = findEnd(s1);
		for (int i = start; i < end; i++) {
			System.out.print(s1.charAt(i));
		}
	}

	private static int findEnd(String s1) {
		int i = s1.length() - 1;
		while (true) {
			if (s1.charAt(i) != ' ')
				return i;
			else
				i--;
		}
	}

	private static int findStart(String s1) {
		int i = 0;
		while (true) {
			if (s1.charAt(i) != ' ')
				return i;
			else
				i++;

		}
	}

}

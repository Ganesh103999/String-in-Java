package String;

public class WhiteSpacesTrim {

	public static void main(String[] args) {

		String s1 = "  ab     cd   ";

		String Ans = mySplit(s1);
		System.out.println(Ans);

	}

	private static String mySplit(String s1) {
		String[] sa = s1.split(s1);

		int i = 0;
		while (s1.charAt(i) == ' ') {
			i++;
		}
		int j = s1.length() - 1;
		while (s1.charAt(j) == ' ') {
			j--;
		}
		String s2 = "";
		for (int k = i; k <= j; k++) {
			s2 = s2 + s1.charAt(k);
		}
		System.out.println("start : "+i);
		System.out.println("end : "+j);
		return s2;
	}

}

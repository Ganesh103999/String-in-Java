package String;

public class StartWith {

	public static void main(String[] args) {
		String s1 = "HefShine";
		String s2 = "Hef";

		boolean Ans = toStartMyMethod(s1, s2);
		System.out.println(Ans);
	}

	private static boolean toStartMyMethod(String s1, String s2) {
		if (s2.length() > s1.length())
			return false;

		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}

		return true;

	}
	

}

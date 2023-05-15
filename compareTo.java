package String;

public class compareTo {

	public static void main(String[] args) {
		String s1 = "HefShine";
		String s2 = "Hef";

		//int num1 = s1.compareTo(s2);
		//System.out.println(num1);

		int s = myCompareTo(s1, s2);
		System.out.println(s);

	}
	private static int myCompareTo(String s1, String s2) 
	{
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);

			if (ch1 != ch2) {
				return ch1 - ch2;
			}
		}
				return s1.length() - s2.length();

	}

}

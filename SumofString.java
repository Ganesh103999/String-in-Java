package String;

public class SumofString {

	public static void main(String[] args) {
		String s = "12fdfj565";

		int sum = SumOfDigits(s);
		System.out.println(sum);
	}

	private static int SumOfDigits(String s) {

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9')
				sum = sum + ch - 48;
			
			
		}
		return sum;

	}

}

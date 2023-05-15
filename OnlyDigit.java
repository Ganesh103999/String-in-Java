package String;

public class OnlyDigit {

	public static void main(String[] args) {
		String s = "1234";
		boolean result = onlyDigit(s);
		if (result)
			System.out.println("Onlt Digit");
		else
			System.out.println("not onlt digit");

	}

	private static boolean onlyDigit(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch < '0' && ch > '9')
				return false;
		}
		return false;

	}
}

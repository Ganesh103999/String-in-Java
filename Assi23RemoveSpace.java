package String;

public class Assi23RemoveSpace {

	public static void main(String[] args) {

		String s = "             You All Are Very      very Good Students    ";
		System.out.println(s);
		s = removeLeaningandTrailing(s);
		s = removeInBetweenSpaces(s);
		System.out.println(s);

	}

	private static String removeLeaningandTrailing(String s)
	{
		int i = 0;
		while (s.charAt(i) == ' ')
			i++;

		int j = s.length() - 1;
		while (s.charAt(j) == ' ')
			j--;
		String s2 = "";
		for (int k = i; k <= j; k++)

			s2 = s2 + s.charAt(k);

		
		return s2;
	}

	private static String removeInBetweenSpaces(String s) {

		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') 
			{

			} 
			else
				s2 = s2 + s.charAt(i);
		}
		return s2;

	}

}

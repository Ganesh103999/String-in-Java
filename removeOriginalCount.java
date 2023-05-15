package String;

public class removeOriginalCount {

	public static void main(String[] args) {
		String s = "aaaabbbbccccddddd";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++)

			if (isOriginalChar(s, i) == false) {
				cnt++;
				System.out.print(s.charAt(i));
			}
		System.out.println();
		System.out.println(cnt);
	}

	private static boolean isOriginalChar(String s, int i) {
		for (int j = 0; j < i; j++)
 			if (s.charAt(i) == s.charAt(j))
				return false;
		return true;
	}

}

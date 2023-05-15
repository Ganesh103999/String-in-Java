package String;

public class trimAndRemoveExtraSpacesString {

	public static void main(String[] args) {
		String s = "      you are good        students    ";

		int i = 0;
		int j = s.length() - 1;
		while (s.charAt(i) == ' ')
			i++;
		while (s.charAt(j) == ' ')
			j--;
		String s2 = "";
		for (int k = i; k <= j; k++)

			s2 += s.charAt(k);
		System.out.println(s2);
		
		
		
		
		
		
		
		// only trailing and leading space will be remove
		String s3 = "";
		for (i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == ' ' && s2.charAt(i + 1) == ' ') {
			} else {
				s3 += s2.charAt(i);
			}
		}
		System.out.println(s3);
	}

}





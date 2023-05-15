package String;

public class UpperToLower {

	public static void main(String[] args) {
		String s1 = "HEFSHINE";

	//	String lower = s1.toLowerCase();
		//System.out.println(lower);
		
		
		
		
		
		String Ams = myLowerCase(s1);
		System.out.println(Ams);
	}

	private static String myLowerCase(String s1) {
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				char temp = (char) (ch + 32);
				s2 = s2 + temp;
			} else
				s2 = s2 + ch;
		}
		return s2;
	}

}

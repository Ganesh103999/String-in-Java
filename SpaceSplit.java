package String;

public class SpaceSplit {

	public static void main(String[] args) {
		String s = "You Are VEry Good Students";
		String[] sa = spilt(s);
		for (String Str:sa)
			System.out.print(Str);
	}

	private static String[] spilt(String s) 
	{
		int spaceCount = 0;
		for (int i = 0; i < s.length(); i++) 
			if (s.charAt(i) == ' ')
				spaceCount++;

			String[] sa = new String[spaceCount+1];
			int i = 0;
			int j = 0;
			String temp = "";
			for (; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == ' ') {
					sa[j] = temp;
					j++;
				temp ="";
				} else {
					temp += ch;
				}
			}
			sa[sa.length - 1] = temp;
		
		return sa;
	}

}

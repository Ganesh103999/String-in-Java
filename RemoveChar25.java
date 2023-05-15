package String;

public class RemoveChar25 {

	public static void main(String[] args) {
		String s = "abbccjddddaa";
		char ch = 'b';
		String s1 = "";
		for (int i = 0; i < s.length(); i++)
                {
			if (s.charAt(i) != ch) {
				s1 = s1.concat(s.charAt(i) + "");
			}
		}
		System.out.println(s1);
	}

}



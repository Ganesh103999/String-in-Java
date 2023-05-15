package String;

public class ReverseEveryWord {

	public static void main(String[] args) 
	{
		String s1 = "I am good boy";
		myCode(s1);

	}

	private static void myCode(String s1) 
	{
		String[] sa = s1.split(" ");

		for (int i = 0; i < sa.length; i++) 
		{
			String s2 = sa[i];
			String s3 = "";

			for (int j = s2.length()-1; j >= 0; j--) 
			{
				s3 = s3 + s2.charAt(j);
			}
			sa[i] = s3;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i] + " ");

		}
	}
}

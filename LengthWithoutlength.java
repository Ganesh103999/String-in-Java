package String;

public class LengthWithoutlength {

	public static void main(String[] args) {
		String s1 = "Hefshine";

		int length = 0;
		while (true)
		{
			try
			{
				s1.charAt(length++);
			} 
			catch (Exception e)

			{
				break;
			}
		}
		System.out.println(length);
	}

}
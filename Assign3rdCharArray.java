package String;
import java.util.Arrays;
public class Assign3rdCharArray {
	public static void main(String[] args) {
		String s1 = "HefShine";
		char[] ca = s1.toCharArray();
		System.out.println("java method : " + Arrays.toString(ca));
		char[] ca2 = myToCharArray(s1);
		System.out.println("hefshine method : " + Arrays.toString(ca2));
	}
	private static char[] myToCharArray(String s1) {
		char[] ca = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ca[i] = s1.charAt(i);
		}
		return ca;
	}
}
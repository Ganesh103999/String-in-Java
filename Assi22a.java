package String;

import java.util.Arrays;

public class Assi22a {

	public static void main(String[] args) {
		String s1 = "you all are very good students";

		String[] sa = s1.split(" ");

		for (int i = 0; i < sa.length; i++) {
			String temp = sa[i];
			String s2 = "";

			for(int j = temp.length() - 1; j >= 0; j--) {
				s2 = s2 + temp.charAt(j);

			}
			sa[i] = s2;

		}
	//System.out.println(Arrays.toString(sa));
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
	}

}

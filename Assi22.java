package String;

import java.util.Arrays;

public class Assi22 {

	public static void main(String[] args) {
		String s1 = "you are very good students";

		String[] sa = s1.split(" ");
		
		//System.out.println(Arrays.toString(sa));
		int start = 0;
		int end = sa.length - 1;
		while (start < end) 
		{
			String temp = sa[start];
			sa[start] = sa[end];
			sa[end] = temp;
			start++;
			end--;

		}
	
		System.out.println(Arrays.toString(sa));
		String s2 = "";
		for (int i = 0; i < sa.length; i++) {

			if (i < sa.length - 1) {
				s2 = s2 + sa[i] + " ";

			} else
				s2 = s2 + sa[i];
		}
		System.out.println(s2);

	}

}

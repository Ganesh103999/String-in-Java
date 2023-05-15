package String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "You All Are Very very Good Students";
		String[] sa = s.split(" ");

		int i = 0;
		int j = sa.length - 1;

		while (i < j) {
			String temp = sa[i];
			sa[i] = sa[j];
			sa[j] = temp;

			i++;
			j--;

		}

		for (int k = 0; k < sa.length; k++) {

			String p = sa[k];
			char[] ca = p.toCharArray();
			i = 0;
			j = ca.length - 1;

			while (i < j) {
				char temp1 = ca[i];
				ca[i] = ca[j];
				ca[j] = temp1;

				i++;
				j--;

			}
			String q = new String(ca);
			sa[k] = q;

		}
		for (String data : sa)
			System.out.print(data + " ");

	}

}

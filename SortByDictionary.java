package String;

public class SortByDictionary {

	public static void main(String[] args) {
		String s = "You All Are Ver very Good Students";
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].compareToIgnoreCase(sa[j]) > 0) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;

				}

			}
		}

		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i] + " ");
		}
		// for(String temp: sa)
		// System.out.print(temp+" ");

	}
}
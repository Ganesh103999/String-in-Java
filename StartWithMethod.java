package String;

public class StartWithMethod {

	public static void main(String[] args) {
String s1="abcde";
String s2="ab";

//boolean startWith=s1.startsWith(s2);
//System.out.println(startWith);
boolean myAns=MyStartWith(s1,s2);
System.out.println(myAns);
	}

	private static boolean MyStartWith(String s1, String s2) {
		if(s2.length()<=s1.length())
		{
			int cnt=0;
			for (int i = 0; i < s2.length(); i++) 
			{
				if(s2.charAt(i)!=s1.charAt(i))
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
				return true;
			else
				return false;
		}
		else
			return false;
	}

}

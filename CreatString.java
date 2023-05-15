
public class CreatString 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="aabbccd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		char[] ca=new char[s1.length()];
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			ca[i]=s1.charAt(i);
		}
		for(int i=0; i<ca.length; i++)
		System.out.print(ca[i]+" ");
	}
}

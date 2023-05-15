
public class GetTheCharcterGivenIndex
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		int index=3;
		myCode(s1,index);
	}
	//EndOfMainMethod
	private static void myCode(String s1,int index) 
	{
                char[] ch=s1.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(i==index)
			System.out.print(ch[i]);
		}
		if(index>s1.length())
		{
			System.out.println("out of range index");
		}
	}
}


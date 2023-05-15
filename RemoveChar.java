public class RemoveChar
{
public static void main(String[] args)
{
	String s1="Aabcd";
	char ch='a';
	//String s="";
	
	for(int i=0; i<s1.length(); i++)
	{
		if(s1.charAt(i)!=ch)
		{
			//s=s.concat(s1.charAt(i)+"");
			System.out.print(s1.charAt(i)+" ");
		}
	}
	System.out.println(s);
}
}
		
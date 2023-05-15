public class Sum
{
	public static void main(String[] args)
	{
		String s1="ab23cd2";
		int sum=0;
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch>='1' && ch<='9')
			{
				sum=sum+ch-48;
			}
		}
		System.out.println(sum);
	}
}
			
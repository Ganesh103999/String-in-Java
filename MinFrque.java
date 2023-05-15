public class MinFrque
{
	public static void main(String[] args)
	{
		String s1="weLcome";
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<s1.length(); i++)
		{int cnt=0;
			for(int j=0; j<s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt<min)
				min=cnt;
			index=i;
		}
		System.out.println(min);
		System.out.println(s1.charAt(index));
	}
}
				
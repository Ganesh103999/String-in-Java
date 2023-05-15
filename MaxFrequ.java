public class MaxFrque
{
	public static void main(String[] args) {
		String s1="aabaabdcc";
		
		int max=0;
		char ch=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			boolean result=originalchar(s1,i);
			if(result==true)
			{
				int cnt=givenfreq(s1,s1.charAt(i));
				if(cnt>max)
				{
					max=cnt;
				ch=s1.charAt(i);
				System.out.println(max);
				System.out.println(ch);
				}
			}
		}
	}
				private static boolean originalchar(String s1, int i)
				{
					for(int i=0; i<s1.length; i++)
					{
						if(s1.charAt(i)==ch)
						{
							return false;
						}
				         }return true;
				}
				private static boolean givenfreq(String s1, char ch)
				{
					int cnt=0;
					for(int j=0; j<i; j++)
					{
						if(s1.charAt(i)==s1.charAt(j))
						{
							cnt++;
						}
					}
					return cnt++;
				}
}
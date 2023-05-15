public class MaxFreqAll
{
	public static void main(String[] args)
	{
		String s1="aaabbbbbccc";
		
		
		for(int i=0; i<s1.length(); i++)
		{
			boolean Result=originalChar(s1,i);
			if(Result==true)
			{
				int cnt=givenFreq(s1, s1.charAt(i));
			
			
			System.out.println(s1.charAt(i)+" "+cnt);
			}
		}
	}
	
	private static boolean originalChar(String s1, int i)
	{
		for(int j=0; j<i; j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
				return false;
		}
		return true;
	}
		private static int givenFreq(String s1,char ch)
		{
			int cnt=0;
			
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i)==ch)
				{
					cnt++;
				}
			}
			return cnt;
		}
}
				
		
		
			
		
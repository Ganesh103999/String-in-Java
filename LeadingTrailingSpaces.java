public class LeadingTrailingSpaces
{
	public static void main(String[] args) 
	{
		String s1 = "   ab   cd  ";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		int i=0;
		int j=s1.length()-1;
		while(s1.charAt(i)==' ')
		i++;
		System.out.println("start : "+i);
		while(s1.charAt(j)==' ')	
		j--;
		System.out.println("end : "+j);
		String s2="";
		for(int k=i; k<=j; k++)
		{
			s2=s2+s1.charAt(k);
		}
		System.out.println(s2);	
	}
}


public class CreatString 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
	
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	private static void myCode(int irange,int jrange) 
	{
		int i=0;
		loopI(i,irange,jrange);
	}
	private static void loopI(int i, int irange, int jrange)
	{
		if(i<irange)
		{
			int j=0;
			loopJ(i,j,jrange);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
	}
	private static void loopJ(int i, int j, int jrange)
	{
		if(j<jrange)
		{
			if(j+i<=4)
			System.out.print("*");
			else
			System.out.print(" ");
			j++;
			loopJ(i, j, jrange);
		}
	}
}

/*
*****
**** 
***  
**   
*    
*/


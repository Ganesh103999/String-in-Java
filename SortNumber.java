public class SortNumber
{
  public static void main(String [] args)
  {
    String s="12345";
	
	char[] ca=s.toCharArray();
	
	for(int i=0; i<ca.length; i++)
	{
	  for(int j=i+1; j<ca.length; j++)
	    {
		 if((int)ca[i]>='0' && (int)ca[i]<='9')
		 {
		 
		  char temp=ca[i];
		   ca[i]=ca[j];
		   ca[j]=temp;
		 }
		
	    } 
	}
	for(int i=0; i<ca.length; i++)
	System.out.print(ca[i]);
  }
}
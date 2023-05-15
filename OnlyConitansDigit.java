public class OnlyConitansDigit
 {
 public static void main(String args[])
 {
 String s1="3222";


 //we can find these is only digit or not 



 char[] ca=s1.toCharArray(); //first we covert String into char array
 int cnt=0;
 
 for(int i=0; i<s1.length(); i++)
 {
	 if(ca[i]>='0' && ca[i]<='9')
	 {
		 cnt++;
	 }
 }
 if(cnt==s1.length())
	 System.out.println("contains only digits");
 else
	 System.out.println("contains not only digti");
 
	 
 
 }
 }
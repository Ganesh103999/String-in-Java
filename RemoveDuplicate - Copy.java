\package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "aaaabbbcccddddd";

		String s2 = "";

		int count=0;

for(int i=0; i<s1.length(); i++)
{int cnt=0;
for(int j=i+1; j<s1.length(); j++)
{
if(s1.charAt(i)==s1.charAt(j))
{
cnt++;
break;
}
}
if(cnt>0)
{
count++;
s2=s2+s1.charAt(i);
}

System.out.println(count);
System.out.println(s2);
}
}
package quizinstgram;


public class MinimumOccurance {
public static int Countchar(String str,char ch)
{
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		char ch1=str.charAt(i);
		if(ch1==ch)
		{
			count++;
			
		}
	}
	return count;
}
public static char minOccurance(String str)
{
	int count=str.length();
	char ch=str.charAt(0);
	for(int i=0;i<str.length();i++)
	{
		char ch1=str.charAt(i);
		int currentcount=Countchar(str,ch1);
		if(currentcount<count)
		{
			ch=ch1;
			count=currentcount;
		}
	}
 return ch;
}
public static void main(String[] args) {
	System.out.println(minOccurance("aab"));
}
}
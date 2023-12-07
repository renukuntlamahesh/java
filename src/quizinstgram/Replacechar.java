package quizinstgram;

public class Replacechar 
{
public static String replacechar(String str,char ch,char newch)
{
String res="";
for(int i=0;i<str.length();i++)
{
	char ch1=str.charAt(i);
	if(ch==ch1)
	{
		res=res+newch;
	}
	else
	{
		res=res+ch1;
	}
}
return res;
}
public static void main(String[] args)
{
	System.out.println(replacechar("matt",'x','t'));
}
}

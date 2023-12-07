package strings;

public class MaximumOccurance {

	public static int countchar(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			if(ch==ch1)
			{
				count++;
			}
		}
		return count;
	}
	public static char maxoccurance(String str)
	{
		char ch=str.charAt(0);
		int maxcount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			int totalcount=countchar(str, ch1);
			if(totalcount>maxcount)
			{
				maxcount=totalcount;
				ch=ch1;
			}
		}
		return ch;
	}
public static String replacechar(String str,char ch,char newch)
{
	String res="";
	for (int i = 0; i <str.length(); i++) {
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
public static void main(String[] args) {
	String str="taaabcdaadddzb";
	char ch1=maxoccurance(str);
	char newch='z';
	System.err.println(replacechar(str, ch1, newch));
}
	

}
	

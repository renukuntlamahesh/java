package strings;

public class MinimumOccurance {

	public static int countchar(String str,char ch)
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
	public static char minoccurance(String str)
	{
		int count=str.length();
		char ch=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			int currentcoun=countchar(str, ch1);
			if (currentcoun<count)
			{
				ch=ch1;
				count= currentcoun;
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		System.err.println(minoccurance("aabbc"));
	}

}

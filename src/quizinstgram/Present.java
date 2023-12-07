package quizinstgram;

public class Present {
	public static boolean isPresent(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			if(ch==ch1)
			{
			 return true;	
			}
		}
		return false;
	}
	public static void main(String[] args) { 
		System.out.println(isPresent("maahi",'a'));
	}
	}

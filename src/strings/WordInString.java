package strings;

public class WordInString {

	public static void main(String[] args) {
		String str="java is important in life";
		int count=1;
		for(int i=1;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			char ch1=str.charAt(i-1);
			if(ch!=' '&&ch1==' ')
			{
				count++;
			}
		}
		if(str.charAt(0)!=' ')
		{
			System.err.println(count);
		}
		else
		{
			System.out.println(count-1);
		}
		

	}

}

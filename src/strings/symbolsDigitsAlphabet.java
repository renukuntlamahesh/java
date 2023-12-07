package strings;

public class symbolsDigitsAlphabet {

	public static void main(String[] args) 
	{
		int count1=0;
		int count2=0;
		int count3=0;
		String str=("amma@love143");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90||ch>=97&&ch<=122)
		{
		  count1++;
	}
	else if (ch>='0'&&ch<='9')
	{
		count2++;
	}
	else
	{
		count3++;
	}
			
}
System.out.println(count1);
System.out.println(count2);
System.out.println(count3);
}
}
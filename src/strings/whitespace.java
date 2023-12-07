package strings;

public class whitespace 
{
public static void main(String[] args)
{
	int count=0;
	String str="mahi vip 143";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
			count++;
	  }
		
	}
	System.out.println(count);
	
}
}

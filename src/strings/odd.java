package strings;

public class odd {
public static void printodd(String a)
{
	for(int i=0;i<a.length();i++)
	{
		char ch=a.charAt(i);
		if(ch%2!=1)
		{
			System.out.println(ch);
		}
	}
}
public static void main(String[] args) {
	printodd("123");
}
}

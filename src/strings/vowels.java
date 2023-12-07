package strings;

public class vowels {
public static void printvowel(String str)
{
	for(int i=1;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch);
		}
	}
}
public static void main(String[] args) {
	printvowel("mAhIviP");
}
}

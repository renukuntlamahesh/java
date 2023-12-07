package convertinteger;

public final class Helloworld {

	public static  String print(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch>=48&&ch<=57)
			{
				res=res+ch;
			}
		}
		return res;

	}
public static void main(String[] args) {
	System.out.println(print("hello world 123 haii"));
}
}

package strings;

public class uppercase {
public static void Uppercase(String str){
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>=65&&ch<=90)
		{
			System.out.println(ch);
		}
	}
}
public static void main(String[] args) {
	Uppercase("mahEsH");
}
}

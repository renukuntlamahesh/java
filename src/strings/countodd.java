package strings;

public class countodd {

	public static void main(String[] args) {
		int count=0;
		String str="mahi73";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				if(ch%2!=1);
			}
			count++;
		}
  System.out.println(count);
	}
}

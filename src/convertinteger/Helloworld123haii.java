package convertinteger;

public class Helloworld123haii {

	public static String remove(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch>=48&&ch<=57||ch==' ')
			{
				res=res+ch;
			}
		}
		return res;

	}
	
	public static String show(String str)
	{
		String res="";
		for (int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
			{
				res=res+ch;
			}

		}
		return res;
	}
	
	
	
	
	public static String removenumber(String str)
	{
		String res="";
	    for(int i=0;i<str.length();i++)
	    {
	    	char ch=str.charAt(i);
	    	if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
	    	{
	    		res=res+ch;
	    	}
  
	    }
	    return res;
	}
	
	
	
	
	public static void showing(String str)
	{
		String res1="";
		String res2="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				res2=res2+ch;
			}
			else
			{
				res1=res1+ch;
			}
		}
		System.out.println(res1);
		System.out.println(res2);
	}
	
	public static void showed(String str)
	{
		String res1="";
		String res2="";
		String res3="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				res2=res2+ch;
			}
			else if(ch>=48&&ch<=57)
			{
				res3=res3+ch;
			}
			else
			{
				res1=res1+ch;
			}
		}
		System.out.println(res1);
		System.out.println(res2);
	    System.out.println(res3);
	}
	
	
	
	
	
	public static void special(String str)
	{
		String res1="";
		String res2="";
		String res3="";
		String res4="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				res2=res2+ch;
			}
			else if(ch>=97&&ch<=122)
			{
				res3=res3+ch;
			}
			else if(ch>=48&&ch<=57)
			{
				res1=res1+ch;
			}
			else
			{
				res4=res4+ch;
			}
		}
		System.out.println(res2);
		System.out.println(res1);
	    System.out.println(res3);
	    System.err.println(res4);
	}
	

	
public static void main(String[] args) {
	//System.out.println(remove("hello world 123 haii"));
	//System.out.println(show("hello world 123 haii"));
	//System.out.println(removenumber("hello world"));
	//showing("hello world");
	//showed("12hello3 4world4");
	special("(*12hello3$ $4#world4*)");
}
}

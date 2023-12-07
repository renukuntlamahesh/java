package arrays;

import java.util.Arrays;

public class Vowels {
	public static String isvowel(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='i'||ch=='o'||ch=='u'||ch=='a'||ch=='e')
			{
				res+=ch;
			}
		}
		
		return res;
	}
	


	public static void main(String[] args) {
		String []str= {"qspiders","jspiders","python"};
		
		String []str1=new String[str.length];
		
	    for(int i=0;i<str.length;i++) {
	    	String store=str[i];
	    	str1[i]=isvowel(store);
	    	
	    	}
	    
	    System.out.println(Arrays.toString(str1));
	}
	}



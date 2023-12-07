package arrays;

import java.util.Arrays;

public class Strings {
	
	public static String reverse(String s) {
		String res="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			res=ch+res;
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"raja","rani","hero"};
		
		String[] str1=new String[str.length];
		
		for(int i=0;i<str.length;i++) {
			String  store=reverse(str[i]);
		    str1[i]=store;
		    
		}

		System.out.println(Arrays.toString(str1));
	}

}

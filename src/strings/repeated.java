package strings;

public class repeated {

	public static void main(String[] args) {
        int count=0;      
		String str="amma";
    for(int i=0;i<str.length();i++)	   
    {
    	char ch=str.charAt(i);
    	if(ch=='m')
    	{
    		count++;
    	}
    }
    System.out.println(count);
	}

}

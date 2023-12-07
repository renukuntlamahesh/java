package mock;


public class Replace {

	public static void main(String[] args) 
	{
		String str="dxt132";
        String res="";
        char ch='x';
        char newch='$';
        for(int i=0;i<str.length();i++)
        {
        	char ch1=str.charAt(i);
        	if(ch1%2==1)
        	{
        		res=res+newch;
        	}
        	else
        	{
        		res=res+ch1;
        	}
        }
        System.err.println(res);

	}

}

package convertinteger;

public class Chartoint {

	public static void main(String[] args) {
		int sum=0;
		String str="raj@123";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=48&&ch<=57)
			{
				sum=sum+(Integer.parseInt(ch+""));
			}
		}
       System.out.println(sum);
	}

}

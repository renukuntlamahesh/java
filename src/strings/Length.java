package strings;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int count=0;
		
		String str="123";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(0);
			count++;
			
			System.out.println(count);
			//System.out.println(sum);
		}
		
	}
}


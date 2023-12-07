package strings;

public class primeindex {
public static boolean isPrime(int num)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		  count++;
		}
	}
		if(count==2)
		{
			return true;
		}
		return false;
	}
	public static void printindex(String s)
	{
		int leng=s.length();
		for (int i=0;i<leng;i++)
		{
			char ch=s.charAt(i);
			if(isPrime(ch))
			{
				System.out.println(ch);
			}
}
}
public static void main(String[] args) {
	String s="5543";
	printindex(s);
}
}
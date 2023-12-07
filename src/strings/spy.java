package strings;

public class spy
{
	public static void main(String[] args)
	{
		int n=123;
		int sum=0;
		int prod=1;
		 
		int n1=n;
		while (n!=0)
		{
			int last=n%10;
			sum=sum+last;
			prod=prod*last;
			n=n/10;
		}
		if (sum==prod)
		{
		System.out.println("the given number is " +n1+ " is a spynumber");
		}
		else
		{
		System.out.println("the given number is " +n1+ " is not a spynumber");

	}
	}}

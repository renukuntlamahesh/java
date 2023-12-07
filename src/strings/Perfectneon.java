package strings;

public class Perfectneon {
	public static boolean isperfect(int num)
	{
		int sum=1;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
	return (sum==num);
	}
	public static boolean isneon(int num)
	{
		int square=num*num;
		int sum=0;
		while(square!=0)
		{
			square=square%10;
			sum=sum+square;
			square=square/10;
		}
		return sum==num;
	}
public static void main(String[] args) {
	String str="zerocode@123";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(isperfect(i)&&isneon(i))
		{
			System.out.println(ch);
		}
	}
}
}

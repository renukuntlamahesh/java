package arrays;

public class Prime {
	public static boolean isprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return (count==2);
	}
	public static void main(String[] args) {
		int []a={1,8,5,2};
		for (int i=0;i<a.length;i++)
		{
			int ele=a[i];
			if(isprime(ele))
			{
				System.err.println(ele);
			}
		}
	}

}

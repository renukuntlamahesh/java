package mock;

public class PrimeNumbersINArray {
	public static boolean prime(int num)
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
	public static void main(String[] args) {
		int[] a= {2,3,6,8,5};
		for(int i=0;i<a.length;i++)
		{
			int ele=a[i];
			if(prime(ele))
			{
				System.err.println(ele);
			}
		}
	}
}

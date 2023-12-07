package arrays;

public class SumOffOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int[]a= {8,4,8,5};
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0&&a[i]%2!=0)
			{
			//int ele=a[i];
			sum=sum+a[i];
		}
		}
		System.err.println(sum);
	}
}
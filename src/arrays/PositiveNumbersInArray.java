package arrays;


public class PositiveNumbersInArray {
	public static void main(String[] args) {
		int count=0;
		int[]a= {1,-2,-8,5,-10};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			if(n>0)
			{
				count++;
			}
		}
		System.err.println(count);
	}

}

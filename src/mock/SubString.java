package mock;

public class SubString {
	public static void main(String[] args) {
		int[] a= {1,5,6,7,9,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.err.println(a[j]);
			}
		}
		System.err.println("-----");
	}

}

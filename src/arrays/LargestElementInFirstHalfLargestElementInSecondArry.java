package arrays;


public class LargestElementInFirstHalfLargestElementInSecondArry {

	public static void main(String[] args) {
		int[]a= {10,4,8,25,5};
		int mid=a.length/2;
		int maxleft=a[0];
		int maxRight=a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			int ele=a[i];
			if(i>=mid)
			{
				if(ele>maxRight)
				{
					maxRight=ele;
				}
			}
			else
			{
				if(ele<maxleft)
				{
					maxleft=ele;
					
				}
			}
		}
		System.err.println(maxleft);
		System.err.println(maxRight);

	}

}

package arrays;

import java.util.Arrays;

public class ReplaceMAXelementWithMINelement {

	public static void main(String[] args) {
		int[]a= {1,8,4,3,0,55,123,66,98,63,-32};
		int maxElement=a[0];
		int minElement=a[0];
		int maxindex=0;
		int minindex=0;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			int ele=a[i];
			if(ele>maxElement)
			{
				maxindex=i;
				maxElement=ele;
			}
			if (ele<minElement) 
			{
				minElement=ele;
				minindex=i;
			}
		}
		a[maxindex]=minElement;
		a[minindex]=maxElement;
		System.err.println(Arrays.toString(a));

	}

}

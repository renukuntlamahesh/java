package arrays;

import java.util.Arrays;

public class SumOfPrimeValues {
	
	public static boolean isPrime(int n) {
		int c=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				c++;
			}	
        }
		if(c==2) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{1,8,9,2,5},{4,3,12,3},{4,8,2,99,21},{45,32,41}};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("When i is " +i);
			int[] b=a[i];
			System.out.println(Arrays.toString(b));
			for(int j=0;j<b.length;j++) {
				System.out.println("When j is " +j);
				int ele=b[j];
				System.out.println(ele);
				if(isPrime(ele)) {
					sum=sum+ele;
				}
				System.out.println("sum is "+sum);
			}
		}
		System.out.println(sum);

	}

}

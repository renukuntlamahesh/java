package mock;

public class PerfectElementInArray {
	public static boolean isperfect(int num)
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
	public static void main(String[] args) 
	{
		
		int [] arr= {1,8,10,5,7,2};
		for(int i=0;i<arr.length;i++) {
			int ele=arr[i];
			if(isperfect(ele)==true) 
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}

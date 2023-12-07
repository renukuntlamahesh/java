package strings;

public class TimePass {
	public static void main(String[] args) {
		
		int num=9;
		int squar=num*num;
		int sum=0;
		while(squar!=0)
		{
			int last=squar%10;
			sum=sum+last;
			squar=squar/10;
		}
		if(sum==num)
		{
			System.out.println("neon");
			
			
		}
		else
		System.out.println("not neon");
	}

}

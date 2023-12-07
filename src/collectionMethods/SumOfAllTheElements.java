package collectionMethods;

import java.util.ArrayList;

public class SumOfAllTheElements 
{

	public static void main(String[] args)
	{
		int sum=0;

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(400);
		for(int i=0;i<al.size();i++)
		{
			int v=al.get(i);
			sum=sum+v;
			
		}
		System.out.println(sum);

	}

}

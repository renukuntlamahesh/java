package collectionMethods;

import java.util.ArrayList;

public class PrintingAllTheElements {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		for(int i=0;i<al.size();i++)
		{
			int v=al.get(i);
			System.err.println(v);
			
			//System.out.println(al.get(i));
		}
	}

}

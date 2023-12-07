package methodInArraylist;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(200);
		a1.add(400);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(200);
		a2.add(400);
		System.err.println("Before Removing");
		System.err.println(a1);
		//a1.removeAll(a2);
		System.err.println("After Removing");
		a1.removeAll(a2);
		
		System.out.println(a1);

	}

}

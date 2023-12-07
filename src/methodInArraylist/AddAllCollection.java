package methodInArraylist;

import java.util.ArrayList;

//addAll(Collection)
//It is a method used to add element of one collection to another collection
public class AddAllCollection {
	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList <Integer>();
		//ArrayList <Integer> al=new ArrayList <Integer>();
		
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(200);
		al.add(2,123);
		ArrayList<Integer> l=new ArrayList<>();
		l.add(1000);
		l.addAll(al);
		System.err.println(l);

	}

}

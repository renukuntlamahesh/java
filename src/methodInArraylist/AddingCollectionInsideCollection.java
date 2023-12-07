package methodInArraylist;

import java.util.ArrayList;

public class AddingCollectionInsideCollection {
		public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		al.add(new ArrayList<>());
		al.add(new ArrayList<>());
		System.err.println(al);
	}
}

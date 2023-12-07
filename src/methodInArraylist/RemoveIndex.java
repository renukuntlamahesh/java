package methodInArraylist;

import java.util.ArrayList;

public class RemoveIndex {
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("mahi vip");
		names.add("Aye jude");
		names.add("mike");
		names.remove(1);
		System.err.println(names);
	}

}

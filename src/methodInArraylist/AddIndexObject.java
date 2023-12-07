package methodInArraylist;
  //add(index,Object)
//It is used to add an element based on index position

import java.util.ArrayList;

public class AddIndexObject 
{

	public static void main(String[] args)
	{
		ArrayList <Integer> al=new ArrayList <Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(200);
		al.add(500);
	//	al.add(2, 123);
		System.out.println(al);
		al.add(2, 123);
		System.err.println(al);
		
	
	
	
	
		
		
		

	}

}

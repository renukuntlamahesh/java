package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputCollection {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		List<Integer> al=new ArrayList<Integer>();
		System.err.println("Enter the size:");
		int size=scan.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element:");
			int ele=scan.nextInt();
			al.add(ele);
		}
		for(int i:al)
		{
			System.err.println(i);
		}
	}

}

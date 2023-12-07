package kashi;

public class MainClass {

	public static void main(String[] args) {
		Student s2 = Student.createObject("mahi");
		System.out.println(s2.getName());
		Student s3 = Student.createObject("vip");
		System.out.println(s3.getName());
	}

}

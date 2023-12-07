package kashi;

public class Student {
	private static Student s1 = null;
	private String name;

	private Student(String name) {
		this.name = name;
	}

	public static Student createObject(String name) {
		if (s1 == null) {
			s1 = new Student(name);
		}
		return s1;

	}

	public String getName() {
		return name;
	}
}


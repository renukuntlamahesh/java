package hashcode;

public class employe {
private int age;
private double sal;
public employe(String name, int age, double sal) {
	this.age = age;
	this.sal = sal;
}
public int hashcode()
{
	return age+(int)sal;
}
}
class mainClass3
{
	public static void main(String[] args) {
		employe e1=new employe("mahi",23,30000);
		System.out.println(e1.hashcode());
	}
}

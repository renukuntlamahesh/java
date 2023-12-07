package hasrelation1;

public class studentr {
private String studentname;
private int id;
private String address;
private relation a;
public studentr(String studentname, int id, String address) {

	this.studentname = studentname;
	this.id = id;
	this.address = address;
}
public String getStudentname() {
	return studentname;
}
public int getId() {
	return id;
}
public String getAddress() {
	return address;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public void setId(int id) {
	this.id = id;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "studentr [studentname=" + studentname + ", id=" + id + ", address=" + address + "]";
}
public void setrelation(String name,double fees,String address) 
{
 this.a=new relation(name,fees,address);
}
}
package hasrelation1;

public class relation {
private String collegename;
private double fees;
private String address;
public relation(String collegename, double fees, String address) {
	super();
	this.collegename = collegename;
	this.fees = fees;
	this.address = address;
}
public String getCollegename() {
	return collegename;
}
public double getFees() {
	return fees;
}
public String getAddress() {
	return address;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public void setFees(double fees) {
	this.fees = fees;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString()
{
	return "relation [collegename=" + collegename + ", fees=" + fees + ", address=" + address + "]";
}

}

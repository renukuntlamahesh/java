package HasArelation;

public class wheel {
private String companyname;
private double price;
private double size;
public wheel(String companyname, double price, double size) {
	super();
	this.companyname = companyname;
	this.price = price;
	this.size = size;
}
public String getCompanyname() {
	return companyname;
}
public double getPrice() {
	return price;
}
public double getSize() {
	return size;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public void setPrice(double price) {
	this.price = price;
}
public void setSize(double size) {
	this.size = size;
}
@Override
public String toString() {
	return "wheel [companyname=" + companyname + ", price=" + price + ", size=" + size + "]";
}
}

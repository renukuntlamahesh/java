package HasArelation;

public class car {
private String carname;
private double price;
private wheel w;
public car(String carname, double price) {
	super();
	this.carname = carname;
	this.price = price;
}
public String getCarname() {
	return carname;
}
public double getPrice() {
	return price;

}
public void setCarname(String carname) {
	this.carname = carname;
}
public void setPrice(double price) {
	this.price = price;
}
public void setwheel(String companyname,double price,double size) {
	this.w=new wheel(companyname,price,size);
}

@Override
public String toString() {
	return "car [carname=" + carname + ", price=" + price + ",w=" +w+"]";
}
}


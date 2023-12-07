package objectclass;

public class laptop
{
private String brand;
private String model;
private double price;
private int ram;
private int rom;
private String graphics;
public laptop(String brand, String model, double price, int ram, int rom, String graphics) {
	super();
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.ram = ram;
	this.rom = rom;
	this.graphics = graphics;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getRom() {
	return rom;
}
public void setRom(int rom) {
	this.rom = rom;
}
public String getGraphics() {
	return graphics;
}
public void setGraphics(String graphics) {
	this.graphics = graphics;
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.brand+""+this.model+"..."+this.graphics+".."+this.price;
		
	}
}
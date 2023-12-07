package hashcode;
public class book {
private String name;
private double price;
private String author;
public book(String name, double price, String author) {
	this.name = name;
	this.price = price;
	this.author = author;
}
@Override
public String toString() {
	return "book [name=" + name + ", price=" + price + ", author=" + author + "]";
}
@Override
public int hashCode() {
	return name.hashCode()+(int)price+author.hashCode();
}
public boolean equals(Object obj)
{
	return this.price ==((book)obj).price;
}
}

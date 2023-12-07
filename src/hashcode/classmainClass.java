package hashcode;

public class classmainClass {
	public static void main(String[] args) {
	
	book b1=new book("automation",500,"srivalli");
			System.out.println(b1.hashCode());
			System.out.println(b1.toString());
			System.out.println(b1.equals(b1));
		}
	}

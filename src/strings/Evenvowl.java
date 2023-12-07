package strings;

public class Evenvowl {

	public static void main(String[] args) {
		int count=0;
       String str="mahesh";
     for(int i=0;i<str.length();i++)
     {
    	 char ch=str.charAt(i);
    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    	 {
    		 if(ch%2==0)
    		 {
    			 count++;
    		 }
    	 }
     }
     System.out.println(count);
	}

}

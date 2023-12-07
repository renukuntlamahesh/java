package Domanios;

import java.util.Scanner;

public class project {



		public static void main(String[] args) {

			

			Scanner scan=new Scanner(System.in);

			int n=1;

			while (n==1) {

			display();

			System.out.println("Enter any choice :");

			int choice=scan.nextInt();

			

			switch (choice) {

			

			case 1: 

				veg();

				int v=scan.nextInt();

				

				switch (v) {

				case 1:

					 tCD();

					 break;

				case 2:

					cCPP();

					break;	

				case 3:

					vE();

					break;

				case 4:

					m();;

					break;

				case 5:

					mGW();

					break;

				case 6:

					dCM();

					break;

				case 7:

					cTPP();

					break;

				

				}

				break;

				

			case 2:

				nonVeg();

				int nv=scan.nextInt();

				

				switch (nv) {

				       case 1:

					        cKPP();

				            break;

				       case 2:

					        cD();

				           break;

				       case 3:

				   	          iFCP();

				              break;

				       case 4:

				    	   cP();

				           break;

				       case 5:

				    	   mSPP();

				           break;

				       case 6:

				    	   pBC();

				       break;

				       case 7:

				    	   cGD();

				    	   break;

				       case 8:

				    	   pBO();					

				}

			}

			System.out.println("                                ");

			System.out.println("IF YOU WANT TO CONTINUE PRESS  1");

			System.out.println("DON'T WANT TO CONTINUE PRESS 0");

			n=scan.nextInt();

			

			}

		}

		

		//VEG

		public static void veg() {

			System.out.println("======= VEG PIZZAS =======");

			System.out.println("                    ");

			

		    System.out.println("Press 1 for--> The Cheese Dominator");

	        System.out.println("Press 2 for--> Corn n Cheese Paratha Pizza");

			System.out.println("Press 3 for--> Veg Extravaganza");

			System.out.println("Press 4 for--> Margherita");

			System.out.println("Press 5 for--> Mexican Green Wave");

			System.out.println("Press 6 for--> Double Cheese Margherita");

			System.out.println("Press 7 for--> Creamy Tomato Pasta Pizza-Veg");

			

			System.out.println("~~~~~ Please choose the item : ~~~~~");

		}

	     

		//VEG BILLS

		public static void tCD() {

			System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name-  The Cheese Dominator");

			System.out.println("subtotal- Rs  639.00");

			System.out.println("--visit again--");

		}

		public static void cCPP() {

			System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name-  Corn n Cheese Paratha Pizza");

			System.out.println("subtotal- Rs  179.00");

			System.out.println("--visit again--");

		}

	    public static void vE() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name-  Veg Extravaganza");

			System.out.println("subtotal- Rs  549.00");

			System.out.println("--visit again--");

		}

	    public static void m() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name- Margherita ");

			System.out.println("subtotal- Rs  239.00");

			System.out.println("--visit again--");

		

	    }

	    public static void mGW() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name-  Mexican Green Wave");

			System.out.println("subtotal- Rs 459.00");

			System.out.println("--visit again--");

	    }

	    public static void dCM() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name-  Double Cheese Margherita");

			System.out.println("subtotal- Rs  379.00");

			System.out.println("--visit again--");

	    }

	    public static void cTPP() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name- Creamy Tomato Pasta Pizza-Veg ");

			System.out.println("subtotal- Rs  459.00");

			System.out.println("--visit again--");

	    }

	    

	   //NON VEG

		public static void nonVeg() {

			System.out.println("======= NON-VEG PIZZAS =======");

			System.out.println("                         ");

			

			System.out.println("press 1 for--> Chicken Keema Paratha Pizza");

			System.out.println("press 2 for--> Chicken Dominator");

			System.out.println("press 3 for--> Indo Fusion Chicken Pizza");

			System.out.println("press 4 for--> Chicken Pepperoni");

			System.out.println("press 5 for--> Moroccan Spice Pasta Pizza - Non Veg");

			System.out.println("press 6 for--> Pepper Barbecue Chicken");

			System.out.println("press 7 for--> Chicken Golden Delight");

			System.out.println("press 8 for--> Pepper Barbecue & Onion");

			

			System.out.println("~~~~~ Please choose the item :~~~~~");

		}

		

		//NON-VEG BILLS

		public static void cKPP() {

			 System.out.println("Than you for ordering please wait");

	         System.out.println('.');

	         System.out.println('.');

	         System.out.println('.');

	         System.out.println('.');

	         System.out.println('.');

	        

	         System.out.println("item name- Chicken Keema Paratha Pizza ");

				System.out.println("subtotal- Rs  249.00");

				System.out.println("--visit again--");

			

		}

		public static void cD(){

			System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name- Chicken Dominator");

			System.out.println("subtotal- Rs  599.00");

			System.out.println("--visit again--");

		}

	    public static void iFCP(){

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name- Indo Fusion Chicken Pizza ");

			System.out.println("subtotal- Rs  699.00");

			System.out.println("--visit again--");

		}

	    public static void cP(){

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name- Chicken Pepperoni ");

			System.out.println("subtotal- Rs  599.00");

			System.out.println("--visit again--");

	    }

	    public static void mSPP(){

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name- Moroccan Spice Pasta Pizza");

			System.out.println("subtotal- Rs  499.00");

			System.out.println("--visit again--");

		}

	    public static void pBC(){

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        

	        System.out.println("item name- Pepper Barbecue Chicken ");

			System.out.println("subtotal- Rs  449.00");

			System.out.println("--visit again--");

	    }

	    public static void cGD(){

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name- Chicken Golden Delight ");

			System.out.println("subtotal- Rs  579.00");

			System.out.println("--visit again--");

		

	    }

	    public static void pBO() {

	    	System.out.println("Than you for ordering please wait");

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	        System.out.println('.');

	       

	        System.out.println("item name- Pepper Barbecue & Onion ");

			System.out.println("subtotal- Rs  499.00");

		

			System.out.println("--visit again--");



	    }

	  

		public static void display() {

			System.out.println("-----WELLCOME TO DOMINOS-----");

			System.out.println("                             ");

			

			System.out.println("FOR VEG       PRESS---> 1");

			System.out.println("FOR NON-VEG   PRESS---> 2");

		}



	}






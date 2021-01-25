import java.util.*;

public class Word {

	public static void main(String[] args) {
		
		String[] hi = {"Welcome", "To", "Group", "Five!"};
		display(hi);

	}
	public static void display(String[] input) { 
		Scanner in = new Scanner (System.in);
		for(int counter = 0; counter < input.length; counter++) {
			System.out.format("%s ",input[counter]);
		}	
			
		String name, gender, ages;
		
	    System.out.format("\n\n");
		System.out.print("What Is Your Name : ");
		name = in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.print("How old are you : ");
		ages = in.nextLine();
		System.out.println("You are " + ages +" years old!");
		System.out.print("Whats Is Your gender (Female/Male) : ");		
		gender = in.nextLine();
		System.out.println();

		System.out.println("===============================");
		System.out.println("YOUR DETAIL:");
		String[] data1 = {"Name", "Age", "Gender"};
		String[] data2 = {name, ages, gender};
			
		for(int i=0;i<data1.length;i++){
			System.out.println(data1[i] + "\t: " + data2[i]);
		}
		System.out.println("===============================");
		System.out.println();
		printProduct();
		in.close();
	}
		
	public static void printProduct() {	
		char neworder;
		double totalPrice = 0;
		do {
			Scanner in = new Scanner (System.in);
			Scanner input = new Scanner (System.in);
			int selection;
			System.out.println("We are offering five different kinds of foodstuff!");
			System.out.println("\n\tWhat would you like to buy?");
			System.out.println("\t================================");
			System.out.println("\t1. Bread!");
			System.out.println("\t2. Cake!");
			System.out.println("\t3. Rice!");
			System.out.println("\t4. Desserts!");
			System.out.println("\t5. Fruits!");
			System.out.println("\t0. Log out!");
			System.out.println("\t================================");
			System.out.println();
			System.out.print("Please Enter your selection:");
			selection = in.nextInt();
				
			if(selection == 0) {
				System.out.println();
				System.out.println("\tThank You! Please Come Again!");
				System.exit(0);
			}
				
			while(selection < 0 || selection > 5) {
				System.out.println("\n\tWhat would you like to buy?");
				System.out.println("\t================================");
				System.out.println("\t1. Bread!");
				System.out.println("\t2. Cake!");
				System.out.println("\t3. Rice!");
				System.out.println("\t4. Desserts!");
				System.out.println("\t5. Fruits!");
				System.out.println("\t0. Log out!");
				System.out.println("\t================================");
				System.out.println();
				System.out.print("Please Enter your selection:");
				selection = in.nextInt();
			}
	//1			
			if(selection == 1) {
				System.out.println("*****************************");
				System.out.println("Welcome to The Bread House!");
				System.out.println("*****************************");
				
				kindofbreads();//Using methods
					
				System.out.println();
				
				int  num1, num2, num3, num4, num5, num6, ans;
				double sum1 = 0;
				System.out.println("Quantity of Item wanted: ");
				System.out.print("White Bread		=");
				num1 = in.nextInt();
				System.out.print("Wheat Bread 		=");
				num2 = in.nextInt();
				System.out.print("Whole Grain Bread  	=");
				num3 = in.nextInt();
				System.out.print("Rye Bread		=");
				num4 = in.nextInt();
				System.out.print("French Bread		=");
				num5 = in.nextInt();
				System.out.print("Hot-Dog Bread		=");
				num6 = in.nextInt();
				System.out.println();

				System.out.println();
				
				sum1 = ((num1*5) + (num2*7) + (num3*9) + (num4*3) + (num5*10) + (num6*13));
				totalPrice += sum1;
				 
				System.out.format("Total Price: RM %.2f\n",sum1);
	//2					
			}else if(selection == 2) {
				System.out.println("Welcome to The Cake House!");
				Scanner in1 = new Scanner(System.in);
				String[] cake = {"blackforest","carrot","redvelvet"};
				int[] price = {120,90,130};
					
				cake();
						
				System.out.print("Quantity of "+cake[0]+ " cake:");
				int qcake1 = in.nextInt();
				System.out.print("Quantity of "+cake[1]+ " cake:");
				int qcake2 = in.nextInt();
				System.out.print("Quantity of "+cake[2]+ " cake:");
				int qcake3 = in.nextInt();
				System.out.println();
						
				double sum2 = 0;
				sum2 = (price[0]*qcake1)+(price[1]*qcake2)+(price[2]*qcake3);
				totalPrice += sum2;
				System.out.format("Total Price: RM %.2f\n",sum2);
	//3
			}else if(selection == 3) {
					
				Scanner input3 = new Scanner (System.in);

				System.out.println("Welcome to The Rice House!");
								
				Scanner input2 = new Scanner (System.in);
				System.out.println();
				System.out.println("Product we offer with the price!");
				String[] product = {"Chicken Rice", "Curry Rice", "Fried Rice"};
				double[] price1 = {4.00,3.50,3.00};
							
				printRice(product,price1);
	 {
				System.out.println();
							
							
				System.out.print("Is there anything you want to buy? ");
				double chickenRice = 4.00;
				double curryRice = 3.50;
				double friedRice = 3.00;
							
				int q_item1, q_item2, q_item3;
				double p_item1 = 0, p_item2 = 0, p_item3 = 0;
				System.out.println("Enter 'y' for yes and enter 'n' for no" );
				System.out.print("Your answer is: ");
				char answer1 = input2.next().charAt(0);
					if (answer1 == 'y') {
						System.out.println("How many chicken rice do you want to order?");
						q_item1 = input2.nextInt();
						p_item1 = chickenRice * q_item1;
						System.out.println("How many curry rice do you want to order?");
						q_item2 = input2.nextInt();
						p_item2 = curryRice * q_item2;
						System.out.println("How many fried rice do you want to order?");
						q_item3 = input2.nextInt();
						p_item3 = friedRice * q_item3;
									 
					}else if (answer1 == 'n') {
						System.out.println("Thank You, please come again!");
					}
								
					int l=1, j=0;
					while (l <50) {
					l = j++;
						System.out.print("*");
					}
					System.out.println();
							
				double sum3 = 0;
				sum3 = p_item1 + p_item2 + p_item3;
				totalPrice += sum3;
				System.out.format("Total Price: RM %.2f\n",sum3);
				}
	//4
		}else if(selection == 4) {
			System.out.println("Welcome to The Desserts House!");
			Scanner in2 = new Scanner (System.in);
			System.out.println();
	    
			for(int f=1; f <50; f++) {
				System.out.print("_");}
			System.out.println();
			System.out.println("Here is the list of menu and the price of our desserts:");
			String[] desserts = {"Cookies","Cakes","Puddings","Pastries"};
			System.out.println();
			dessert(desserts);
			System.out.println();
			System.out.println("-------------------");
			System.out.println();
			printdesserts();
	        
			for(int f=1; f <50; f++) {
				System.out.print("_");}
	            
			System.out.println();
			System.out.println();
			System.out.println("Which desserts that you want?");
	        
			System.out.print("Quantity of "+ desserts[0] + " desserts:");
			int quantity1 = in2.nextInt();
			System.out.print("Quantity of "+ desserts[1]+ " desserts:");
			int quantity2 = in2.nextInt();
			System.out.print("Quantity of "+ desserts[2]+ " desserts:");
			int quantity3 = in2.nextInt();
			System.out.print("Quantity of "+ desserts[3]+ " desserts:");
			int quantity4 = in2.nextInt();
			
			int[] pricedesserts = {5,3,10,8};
			int pdesserts1,pdesserts2,pdesserts3,pdesserts4;
			pdesserts1 = pricedesserts[0] * quantity1;
			pdesserts2 = pricedesserts[1] * quantity2;
			pdesserts3 = pricedesserts[2] * quantity3;
			pdesserts4 = pricedesserts[3] * quantity4;

			System.out.println();
			double sum4 = 0;
			sum4 = (pdesserts1 + pdesserts2 + pdesserts3 + pdesserts4);
			
			totalPrice += sum4;
			
			System.out.format("Total Price: RM %.2f\n", sum4);
	//5
			}else if(selection == 5) {
				System.out.println("Welcome to The Fruits House!");
				Scanner in3 = new Scanner (System.in);
					
				String [] fruit = {"Apple","Orange","Pineapple"};
					
				   String [][] product = {{"Price of Apple","Price of Orange","Price of Pineapple"},{"RM1.20","RM1.30","RM1.50"}};
				printList(product);
		        
				System.out.println();
				
				printPattern();
				
				System.out.println();
				
				System.out.println("Do you need some apples? (true or false)");
					boolean apple = in3.nextBoolean();
					System.out.println("Do you need some oranges? (true or false)");
					boolean orange = in3.nextBoolean();
					System.out.println("Do you need some pineapples? (true or false)");
					boolean pineapple = in3.nextBoolean();
					double sum5 = 0;;
				    
					if(apple && !(orange || pineapple)) {
						Scanner in4 = new Scanner (System.in);
						System.out.println("Enter the quantity of apples you want to purchase:");
						int quantity3 = in4.nextInt();
						double price4 = 1.20;
						double total = quantity3*price4 ;
						System.out.println("Total price: RM" + total );
						sum5 = total;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[0] + " purchased: " + quantity3);
						}
					else if(orange && !(apple || pineapple)) {
						Scanner in5 = new Scanner (System.in);
						System.out.println("Enter the quantity of oranges purchase:");
						int quantity3 = in5.nextInt();
						double price5 = 1.30;
						double total = quantity3*price5;
						System.out.println("Total price: RM" + total + "0");
						sum5 = total;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[1] + " purchased: " + quantity3);
						}
					else if(pineapple && !(apple || orange)) {
						Scanner in6 = new Scanner (System.in);
						System.out.println("Enter the quantity of pineapple purchase:");
						int quantity3 = in6.nextInt();
						double price6 = 1.50;
						double total = quantity3*price6;
						System.out.println("Total price: RM" + total + "0");
						sum5 = total;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[2] + " purchased: " + quantity3);
						}
					else if(orange && pineapple && !(apple)) {
						Scanner in7 = new Scanner (System.in);
						System.out.println("Enter the quantity of orange you want to puchase:");
						int quantity3 = in7.nextInt();
						System.out.println("Enter the quantity of pineapple you want to purchase:");
						int quantity4 = in7.nextInt();
						double price5 = 1.30;
						double price6 = 1.50;
						double total [] = {(quantity3*price5), (quantity4*price6)};
						double total1 =  0;
						for(int i=0; i<total.length;i++) {
							total1 = total1 + total[i];
							}
						sum5 = total1;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[1] + " purchased: " + quantity3);
						System.out.println("Quantity of " + fruit[2] + " purchased: " + quantity4);
						}
					else if(apple && pineapple && !(orange)) {
						Scanner in8 = new Scanner (System.in);
						System.out.println("Enter the quantity of apples you want to purchase:");
						int quantity3 = in8.nextInt();
						System.out.println("Enter the quantity of pineapple you want to purchase:");
						int quantity4 = in8.nextInt();
						double price4 = 1.20;
						double price6 = 1.50;
						double total [] = {(quantity3*price4), (quantity4*price6)};
						double total1 =  0;
						for(int i=0; i<total.length;i++) {
							total1 = total1 + total[i];}
						sum5 = total1;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[0] + " purchased: " + quantity3);
						System.out.println("Quantity of " + fruit[2] + " purchased: " + quantity4);
						}
					else if(apple && orange && !(pineapple)) {
						Scanner in9 = new Scanner (System.in);
						System.out.println("Enter the quantity of apples you want to purchase:");
						int quantity3 = in9.nextInt();
						System.out.println("Enter the quantity of oranges you want to purchase:");
						int quantity4 = in9.nextInt();
						double price4 = 1.20;
						double price5 = 1.30;
						double total [] = {(quantity3*price4), (quantity4*price5)};
						double total1 =  0;
						for(int i=0; i<total.length;i++) {
							total1 = total1 + total[i];}
						sum5 = total1;
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[0] + " purchased: " + quantity3);
						System.out.println("Quantity of " + fruit[1] + " purchased: "+ quantity4);
						}
					else if(apple && orange && pineapple) {
						Scanner inn = new Scanner (System.in);
						System.out.println("Enter the quantity of apples you want to purchase:");
						int quantity3 = inn.nextInt();
						System.out.println("Enter the quantity of oranges you want to purchase:");
						int quantity4 = inn.nextInt();
						System.out.println("Enter the quantity of pineapples you want to purchase:");
						int quantity5 = inn.nextInt();
						double price4 = 1.20;
						double price5 = 1.30;
						double price6 = 1.50;
						double total [] = {(quantity3*price4), (quantity4*price5), (quantity5*price6)};
						for(int i=0; i<total.length;i++) {
							sum5 = sum5 + total[i];}
							
						System.out.println("This is what you bought");
						System.out.println("Quantity of " + fruit[0] + " purchased: " + quantity3);
						System.out.println("Quantity of " + fruit[1] + " purchased: " + quantity4);
						System.out.println("Quantity of " + fruit[2] + " purchased: " + quantity5);
						}
						
						
					totalPrice += sum5;
					System.out.format("Total Price: RM %.2f\n",sum5);
					}
				
	//Do-While Loop for new order
			printPattern();
			
			
		System.out.println("Do you want to add new order ? (Y = Yes | N = No) :");
		neworder = input.next().charAt(0);
		
		}while(neworder == 'Y' || neworder == 'y');
		System.out.println();
			
	//payment
		System.out.format("The total price is	: 	RM%.2f\n",totalPrice);
		//Discount
		double discount = 0;
		double total = 0;
		double discountRate = 0;
		double customerPaid = 0;
		double totalExchange = 0;
		Scanner input4 = new Scanner (System.in);
			
			if (totalPrice > 100) {
				discountRate = 0.2;
			}
				else {
				discountRate = 0.1;
			}
				
			discount = totalPrice * discountRate;
			total = (totalPrice - discount);
			System.out.format("Discount received	: 	RM%.2f\n",discount);
			System.out.format("Price need to be paid	: 	RM%.2f\n",total);
			System.out.print("Customer Paid		: 	RM");
			customerPaid = input4.nextDouble();
			while(customerPaid < total) {
				System.out.println();
				System.out.println("The Money Is Not Enough To Pay The Payment, Please Re-Enter Again!");
				System.out.print("Customer Paid		: 	RM");
				customerPaid = input4.nextDouble();
			}
			totalExchange = customerPaid - total;
			System.out.format("Total Money Exchange 	:	RM%.2f",totalExchange);
			System.out.println();
			System.out.println("Thank you very much!");
			
}
	
	public static void printList(String[][]x) {
		System.out.println(x[0][0] + " " + x[1][0]);
		System.out.println(x[0][1] + " " + x[1][1]);
		System.out.println(x[0][2] + " " + x[1][2]);
}
		
	public static void cake() {
			
		System.out.println("Here is the lists of cake: " );
		String[] cake = {"blackforest","carrot","redvelvet"};
		int[] price = {120,90,130};
			
			name (cake);
			System.out.println();
			
			money (price);
			System.out.println();
			
}
	
	public static void name (String[] a) {
			
			for (int i = 0; i<a.length;i++) {
				System.out.println(a[i]);
			}
}
		
	public static void money (int[] b) {
		System.out.println("The price of blackforest cake, carrot cake and redvelvet cake is " );
			for (int j =0; j<b.length;j++) {
				System.out.println("RM"+ b[j]+" ");
			}
}
		
	private static void printRice(String[]product,double[] price) {
			
			for (int i = 0 ; i< product.length;i++) {
				System.out.println(product[i] + "\t: RM " + price[i] +" /pack.");
					}		
}	
		
	public static void printdesserts() {
		
	int[] pricedesserts = {5,3,10,8};
	System.out.println("Cookies: RM"+ pricedesserts[0]+ " per box");
	System.out.println("Cakes : RM"+ pricedesserts[1]+ " per slice");
	System.out.println("Puddings : RM"+ pricedesserts[2]+ " per box ");
	System.out.println("Pastries : RM"+ pricedesserts[3]+ " per set");
	 
}

	public static void dessert(String[] d) {
		for (int i = 0; i<d.length;i++) {
			System.out.println(d[i]);
		}
}
	public static void kindofbreads() {
		System.out.println("Product we provide with the price!");
		//Array
		String[] breads = new String[6];
		breads[0] = "White bread		= RM5.00";
		breads[1] = "Wheat bread 		= RM7.00";
		breads[2] = "Whole Grain bread  	= RM9.00";
		breads[3] = "Rye Bread		= RM3.00";
		breads[4] = "French Bread		= RM10.00";
		breads[5] = "Hot-Dog Bread		= RM13.00";
		//Repetition Structure
		for(int j=0; j<breads.length; j++){
		System.out.println(breads[j]);
		}
}
	
	public static void printPattern() {
		int i=1, j=0;
		while (i <50) {
			i = j++;
			System.out.print("*");
		}
		System.out.println();				
	}
}

package RMMS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;

import java.util.Calendar; 

public class RestaurantDriver {
	
public static void straightLine() 
	{
		System.out.println();
		int i;
		for (i = 0; i < 50; i++){
			System.out.print("*");}
		System.out.println();
		} 

public static void date() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.print(dtf.format(now) + "\n");  
	}

	static Date date = Calendar.getInstance().getTime();  
	static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
	static String strDate = dateFormat.format(date);  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner group= new Scanner(System.in);
		int CusChoice= -1;
		boolean Signal= false;
		int ID;
		double Total= 0, Discount, DisAmount, TotalAmount;
		String Name, Status;
		
		String POrder; 		
		ArrayList <MenuItem> Restro= new ArrayList<>(); //Creating Restro ArrayList

		//	Creating objects for Standard Menu	
		MenuItem S1= new StandardMenu(101, "Apéritif","A little protein scramble to start the day", "Eggs and sausage", 11.90);
		MenuItem S2= new StandardMenu(102, "Amuse-Bouche", "\"Loin\" served with a Cumberland sauce of red fruits", "Fruity Lunch", 16.90);
		MenuItem S3= new StandardMenu(103, "Œuf", "\"Boudin Noir\" from Ali Bab's Gastronomie Practique", "Healthy and Satisfying", 11.90);
		MenuItem S4= new StandardMenu(104, "Coquilles", "\"Foie gras au torchon\" with a late harvest of vidal sauce with dried and fresh figs", "Chef's Special", 25.90);
		MenuItem S5= new StandardMenu(105, "Entrée", "\"Langue d'agneau en papillottes\" served with a sauce of duxelles and oyster mushrooms", "Seafood", 19.90);
		MenuItem S6= new StandardMenu(106, "Trou Normand", "The vegetarian salad served to Freddie Lounds", "Nutritious", 21.90);
		MenuItem S7= new StandardMenu(107, "Buffet Froid", "\"The Jamon Ibérico\" Iberian ham", "Bon Appétit", 20.90);
		MenuItem S8= new StandardMenu(108, "Rôti", "\"Kudal\" A South Indian curry", "Spicy and Vegetarian", 19.90);
		MenuItem S9= new StandardMenu(109, "Relevés", "\"Silkie chicken in a broth\" Wolfberries, ginseng, ginger, red dates, and star anise. Chicken Soup", "Porridge", 22.90);
		MenuItem S10= new StandardMenu(110, "Savoureux", "\"Tête de veau en sauce verte\" The veal is smoked on a pyre of dry hay", "Traditional", 15.90);
		
		
		
		// Creating objects for Premium Menu		
		MenuItem P1= new PremiumMenu(201, "Kaiseki", "\"Mukozuke\" seasonal sashimi, sea urchin, water clam, and squid", "Seafood", 16.90, 0.50);
		MenuItem P2= new PremiumMenu(202, "Hassun", "\"Salt-baked Celeriac\" Salted and ash-baked celeriac with foraged sel fou", "Nutritious", 17.90, 2.30);
		MenuItem P3= new PremiumMenu(203, "Sakizuki", "\"Osso Buco\" with saffron-scented risotto and zucchini eyeballs", "Aromatic", 12.90, 1.50);
		MenuItem P4= new PremiumMenu(204, "Mukozuke", "\"Hangtown Fry\" Crayfish and smoked Maldons salt", "Bon Appétit", 27.60, 2.50);
		MenuItem P5= new PremiumMenu(205, "Takiawase", "\"Kidney Pie\" Baked pastry and meat, with red and yellow beets and layered chevre", "Lunch and Crunch", 24.40, 1.60);
		MenuItem P6= new PremiumMenu(206, "Futamono", "\"Braised Roast\" Meat baked in clay with marrow, and Lady Apples on the side", "Anti-Doctor", 28.70, 2.10);
		MenuItem P7= new PremiumMenu(207, "Su-zakana", "\"Truite saumonée au bleu\" with vegetables and broth, served with a hollandaise sauce on the side", "Modern and Mystical", 18.90, 1.40);
		MenuItem P8= new PremiumMenu(208, "Shiizakana", "\"Sacromonte omelet\" with liver and sweetbreads", "Mind-blowing", 20.90, 1.50);
		MenuItem P9= new PremiumMenu(209, "Naka-Choko", "Brined and roasted whole suckling pig", "Chef's Special", 23.90, 0.80);
		MenuItem P10= new PremiumMenu(210, "Lomo Saltado", "with spicy curly fries, the writer's quills and carrot slaw", "Traditional", 20.90, 2.00);
		
		
		// Creating objects for Discount Menu
		MenuItem Di1= new DiscountMenu(301, "Roasted Ortolans", " Preparation calls for the songbird to be drowned alive in Armagnac. It is then roasted and consumed whole in a single mouthful", "Crunchy Roasts", 14.40, 2.00);
		MenuItem Di2= new DiscountMenu(302, "Kholodets"," A traditional Russian dish of jellied meat", "Chewy and Satisfying", 17.90, 1.00);
		MenuItem Di3= new DiscountMenu(303, "Antipasto", "Whole roasted leg, smoked, glazed and served on a sugar cane quill", "Sweet and Juicy", 21.90, 1.50);
		MenuItem Di4= new DiscountMenu(304, "Yakimono", "Oysters, acorns, and masala", "Perfect Tongue Tweezer", 22.90, 2.00);
		MenuItem Di5= new DiscountMenu(305, "Secondo", "Cut and cured ham with asparagus", "Love and Healing", 17.90, 1.20);
		MenuItem Di6= new DiscountMenu(306, "Sibilo caratteristico", "When the lungs whistle, the dish is done", "Whistleblower", 22.00, 0.90);
		MenuItem Di7= new DiscountMenu(307, "Coratella con carciofi", "Purple artichokes served with spring lamb's liver, lungs and heart", "The Royal Dish", 16.80, 1.50);
		MenuItem Di8= new DiscountMenu(308, "Pappardelle alla Lepre", "Tuscan dish of hare, braised in red wine with aromatics", "Nostalgic Aroma", 17.60, 1.00);
		MenuItem Di9= new DiscountMenu(309, "Venison Entrecote", "seared foie gras", "Vegetarian Dietary", 16.70, 2.50);
		MenuItem Di10= new DiscountMenu(310, "Dolce", "Pig tails cut into sections in a ginger-black vinegar sauce, and marrow in a fermented bean sauce.", "Weird and Wonderful", 18.90, 3.10);
		


		
		//Creating objects for Drinks Menu
		MenuItem D1= new DrinksMenu(401, "Americano", "Old-fashioned ice-filled glass, topped with soda water and garnished with a slice of orange", "Hard", 9.50);
		MenuItem D2= new DrinksMenu(402, "Negroni", "Served on the rocks, the ingredients stirred directly in the glass and garnished with a half slice of orange and lemon peel.", "Soft", 8.25);
		MenuItem D3= new DrinksMenu(403, "Cardinale", "Cardinale fancies the Old fashioned ice-filled glass, chilled & Stirred ", "Soft", 8.50);
		MenuItem D4= new DrinksMenu(404, "Bellini", "Built directly in a Champagne flute, pouring peach juice first and then Spumante Brut", "Hard", 7.00);
		MenuItem D5= new DrinksMenu(405, "Rossini", "Try as well Mimosa (orange + brut), il Tiziano (“strawberry grapes” + Brut) ed il Puccini (mandarin + Brut)", "Juice", 7.50);
		MenuItem D6= new DrinksMenu(406, "Gin and It", "Served in a cocktail cup with a red cherry.", "Soft", 7.50);
		MenuItem D7= new DrinksMenu(407, "Aperol Spritz", "A tumbler or a red wine glass with ice, pour Aperol, Prosecco and top it with Soda water. Garnished with a slice of orange.", "Hard", 20.90);
		MenuItem D8= new DrinksMenu(408, "Martini Cocktail", "An ice-filled mixing glass gin and vermouth dry, stir well and serve in a chilled cocktail glass", "Hard", 18.60);
		MenuItem D9= new DrinksMenu(409, "God Father", "Amaretto di Saronno & Scotch Whisky in an ice-filled old-fashioned glass.", "Hard", 17.50);
		MenuItem D10= new DrinksMenu(410, "Sorbet", "The dinner party that emerges once inspiration strikes", "Soft Drink", 4.50);
		
		
		MenuItem A1 = new PremiumMenu(701,"Wallaby Special", "Stunned but still alive Wallaby", "Chef's Special", 45.00, 0.50);
		MenuItem A2 = new PremiumMenu(702,"Salad", "Baby Ice-berg Wedge Salad", "Diet", 10.00, 2.00);
		MenuItem A3 = new PremiumMenu(703,"Hot and Flamy", "Bone-in Spanish Daughter in a Manchester Curry", "Wink Wink", 18.00, 0.50);
		MenuItem A4 = new PremiumMenu(704,"Wellington Royale", "Extremely ill-Conceived Beef Wellington", "On-Popular Demand", 21.00, 1.50);
		MenuItem A5 = new PremiumMenu(705,"Blessings", "Bitter Sweet Chicken Lungs with Michael's Blessings", "Michael blesses all the Chicken ", 20.00, 0.80);
		MenuItem A6 = new PremiumMenu(706,"Ancient", "Ancient Dry-aged Ribeye", "Cooked by the power of GraySkull", 15.00, 1.00);
		MenuItem A7 = new PremiumMenu(707,"Raging Waves", "Uncut Pride of the Bull", "Be the Last man Standing", 18.00, 1.20);
		MenuItem A8 = new PremiumMenu(708,"Fire and Fury", "Lamb Cooked in Fear", "Cooked slowly and inevitably", 19.00, 0.11);
		
		
		
		Menu Breakfast = new Menu("Breakfast", strDate ,"Castle Lecter" );
		Breakfast.List.add(S1);
		Breakfast.List.add(S4);
		Breakfast.List.add(S5);
		Breakfast.List.add(S9);
		Breakfast.List.add(P2);
		Breakfast.List.add(P7);
		Breakfast.List.add(Di4);
		Breakfast.List.add(Di5);
		Breakfast.List.add(Di7);
		Breakfast.List.add(Di9);
		Breakfast.List.add(D1);
		Breakfast.List.add(D2);
		Breakfast.List.add(D3);
		Breakfast.List.add(D4);
		Breakfast.List.add(D5);
		Breakfast.List.add(D6);
		Breakfast.List.add(D7);
		Breakfast.List.add(D8);
		Breakfast.List.add(D9);
		Breakfast.List.add(D10);
		Breakfast.List.add(A1);
		Breakfast.List.add(A2);
		Breakfast.List.add(A3);
		Breakfast.List.add(A4);
		Breakfast.List.add(A5);
		Breakfast.List.add(A6);
		Breakfast.List.add(A7);
		Breakfast.List.add(A8);
		
		Menu Lunch= new Menu("Lunch", strDate, "Castle Lecter"); 
		Lunch.List.add(S2);
		Lunch.List.add(S7);
		Lunch.List.add(S8);
		Lunch.List.add(P1);
		Lunch.List.add(P5);
		Lunch.List.add(P9);
		Lunch.List.add(Di1);
		Lunch.List.add(Di2);
		Lunch.List.add(Di8);
		Lunch.List.add(Di10);
		Lunch.List.add(D1);
		Lunch.List.add(D2);
		Lunch.List.add(D3);
		Lunch.List.add(D4);
		Lunch.List.add(D5);
		Lunch.List.add(D6);
		Lunch.List.add(D7);
		Lunch.List.add(D8);
		Lunch.List.add(D9);
		Lunch.List.add(D10);
		Lunch.List.add(A1);
		Lunch.List.add(A2);
		Lunch.List.add(A3);
		Lunch.List.add(A4);
		Lunch.List.add(A5);
		Lunch.List.add(A6);
		Lunch.List.add(A7);
		Lunch.List.add(A8);
		
		Menu Dinner = new Menu("Dinner", strDate, "Castle Lecter");
		Dinner.List.add(S3);
		Dinner.List.add(S6);
		Dinner.List.add(S10);
		Dinner.List.add(P3);
		Dinner.List.add(P4);
		Dinner.List.add(P6);
		Dinner.List.add(P8);
		Dinner.List.add(P10);
		Dinner.List.add(Di6);
		Dinner.List.add(Di3);
		Dinner.List.add(D1);
		Dinner.List.add(D2);
		Dinner.List.add(D3);
		Dinner.List.add(D4);
		Dinner.List.add(D5);
		Dinner.List.add(D6);
		Dinner.List.add(D7);
		Dinner.List.add(D8);
		Dinner.List.add(D9);
		Dinner.List.add(D10);
		Dinner.List.add(A1);
		Dinner.List.add(A2);
		Dinner.List.add(A3);
		Dinner.List.add(A4);
		Dinner.List.add(A5);
		Dinner.List.add(A6);
		Dinner.List.add(A7);
		Dinner.List.add(A8);
		
		System.out.println("Do you want to place an order?(Yes/No)");
		POrder= group.nextLine();
		if(POrder.equalsIgnoreCase("Yes"))
		{
			//Adding Customer
		Customer Cus= new Customer();
		System.out.println("Enter the customer name: ");
		Name= group.nextLine();
		
		System.out.println("Enter the customer ID: ");
		ID= group.nextInt();
		group.nextLine();
		
		System.out.println("Enter the status: \n-Active\n-VIP\n-New\n ");
		Status= group.nextLine();
		
		System.out.println("\nWELCOME TO Hannibal RESTAURANT");
		System.out.println("Developed by: \tSachet Thapa\tBasant KC ");
		
		//Creating Customer
		Cus.setCustomerID(ID);
		Cus.setCustomerName(Name);
		Cus.setCusStatus(Status);
			
		straightLine(); // calls straightLine method
		//Printing Menu List
		System.out.printf("%25s","MENU LIST");
		straightLine();
		
		try{if(dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse("18:00:00")))
		{
			System.out.println(Dinner);
			Iterator<MenuItem> MI= Dinner.List.iterator();
			
			while(MI.hasNext())
			{
				System.out.println(MI.next());
			}
			
			//Item Selection
			while(CusChoice != 0)
			{
				System.out.print("\nChoose and enter the item number from the menu(Enter 0 for exit): ");
				CusChoice = group.nextInt();
				
				if(CusChoice == 0)
					System.out.println("\nYour order has been completed");
				else
				{
					Signal= false;
					for(int i= 0; i <Dinner.List.size(); i++)
					{
						if (CusChoice == Dinner.List.get(i).getitemNum())
						{
							Total += Dinner.List.get(i).getitemPrice();
							
							Restro.add(Dinner.List.get(i));
							
							
							System.out.println(Dinner.List.get(i).getitemName() +" ---Added.");
							Signal = true;
							
						}
					}
					if (!Signal)
						System.out.println("\nItem does not exist.. \nPlease choose the correct item number from the menu.");
				}
			}
			
			//Printing the selection
			
			straightLine(); //calling straightLine Method
			System.out.printf("%25s","INVOICE");
			straightLine(); //calling straightLine Method
			
			Iterator<MenuItem> R= Restro.iterator();
			while(R.hasNext())
			{
				System.out.println(R.next());
			}
			
			System.out.println(Cus);
			Discount= Cus.getDiscount();
			DisAmount = Total * Discount;
			TotalAmount = Total - DisAmount;
			
			straightLine(); //calling straightLine Method
			System.out.printf("%s: %15.2f","Total",Total); 
			System.out.printf("\n%s: %12.2f","Discount",DisAmount);
			System.out.printf("\n%s: %13.2f","Payable",TotalAmount);
			straightLine();
			date();
			System.out.println("Thanks for your order");
			
			}
			else if(dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse("12:00:00")))
		{
			System.out.println(Lunch);
			Iterator<MenuItem> MI= Lunch.List.iterator();
			
			
			while(MI.hasNext())
			{
				System.out.println(MI.next());
				
			}
			
			//Item Selection
			while(CusChoice != 0)
			{
				System.out.print("\nChoose and enter the item number from the menu(Enter 0 for exit): ");
				CusChoice = group.nextInt();
				
				if(CusChoice == 0)
					System.out.println("\nYour order has been completed");
				else
				{
					Signal= false;
					for(int i= 0; i <Lunch.List.size(); i++)
					{
						if (CusChoice == Lunch.List.get(i).getitemNum())
						{
							Total += Lunch.List.get(i).getitemPrice();
							
							Restro.add(Lunch.List.get(i));
							
							
							System.out.println(Lunch.List.get(i).getitemName() +" ---Added.");
							Signal = true;
							
						}
					}
					if (!Signal)
						System.out.println("\nItem does not exist.. \nPlease choose the correct item number from the menu.");
				}
			}
			
			//Printing the selection
			
			straightLine(); //calling straightLine Method
			System.out.printf("%25s","INVOICE");
			straightLine(); //calling straightLine Method
			
			Iterator<MenuItem> R= Restro.iterator();
			while(R.hasNext())
			{
				System.out.println(R.next());
			}
			
			System.out.println(Cus);
			Discount= Cus.getDiscount();
			DisAmount = Total * Discount;
			TotalAmount = Total - DisAmount;
			
			straightLine(); //calling straightLine Method
			System.out.printf("%s: %15.2f","Total",Total); 
			System.out.printf("\n%s: %12.2f","Discount",DisAmount);
			System.out.printf("\n%s: %13.2f","Payable",TotalAmount);
			straightLine();
			date();
			System.out.println("Thanks for your order");
			
			}
			else if(dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse("06:00:00")))
		{
			System.out.println(Breakfast);
			Iterator<MenuItem> MI= Breakfast.List.iterator();
			
			while(MI.hasNext())
			{
				System.out.println(MI.next());
			}
			
			//Item Selection
			while(CusChoice != 0)
			{
				System.out.print("\nChoose and enter the item number from the menu(Enter 0 for exit): ");
				CusChoice = group.nextInt();
				
				if(CusChoice == 0)
					System.out.println("\nYour order has been completed");
				else
				{
					Signal= false;
					for(int i= 0; i <Breakfast.List.size(); i++)
					{
						if (CusChoice == Breakfast.List.get(i).getitemNum())
						{
							Total += Breakfast.List.get(i).getitemPrice();
							
							Restro.add(Breakfast.List.get(i));
							
							
							System.out.println(Breakfast.List.get(i).getitemName() +" ---Added.");
							Signal = true;
							
						}
					}
					if (!Signal)
						System.out.println("\nItem does not exist.. \nPlease choose the correct item number from the menu.");
				}
			}
			
			//Printing the selection
			
			straightLine(); //calling straightLine Method
			System.out.printf("%25s","INVOICE");
			straightLine(); //calling straightLine Method
			
			Iterator<MenuItem> R= Restro.iterator();
			while(R.hasNext())
			{
				System.out.println(R.next());
			}
			
			System.out.println(Cus);
			Discount= Cus.getDiscount();
			DisAmount = Total * Discount;
			TotalAmount = Total - DisAmount;
			
			straightLine(); //calling straightLine Method
			System.out.printf("%s: %15.2f","Total",Total); 
			System.out.printf("\n%s: %12.2f","Discount",DisAmount);
			System.out.printf("\n%s: %13.2f","Payable",TotalAmount);
			straightLine();
			date();
			System.out.println("Thanks for your order");
			
			}
			else {
			System.out.println("Thank you for visiting. Have a great day");
				System.exit(0); //Exits the system
			}
			group.close();
				
			
		}
		catch (ParseException e) {
		    e.printStackTrace();
		}
		
	   }
	}
}
 
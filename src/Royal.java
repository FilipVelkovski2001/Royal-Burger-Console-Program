import java.util.Scanner;

public class Royal {

	public static void main(String[] args) {
		

	    String orderBurger;
        String orderDrinks;
        String orderFries;
        String burger;
	    String drink;
        String fries;
        String drinks;
	 	
		Menu menu1 = new Menu();
		menu1.setBurgers("Hamburger", "Cheeseburger", "Royal burger", "Crispy Chicken", "Cheesy Chicken");
		menu1.setBurgersPrice(120, 135, 170, 120, 135);

		menu1.setDrinks("Pepsi", "7up", "Mirinda", "Ice Tea", "Beer" );
		menu1.setDrinksPrice(45, 45, 45, 60, 65);
	
		menu1.setFries("Small Fries", "Medium Fries", "Large Fries", "Medium Canoe Fries", "Large Canoe Fries");
		menu1.friesPrice(45, 55, 65, 55, 70);
		Worker worker1 = new Worker();
		Customer customer1 = new Customer();
		worker1.greet();
		customer1.greet();
		worker1.order();
		menu1.showBurgerMenu();
	    menu1.friesMenu();	
	    menu1.showDrinksMenu();
		customer1.order();
		Scanner scan = new Scanner(System.in);
		orderBurger = scan.nextLine();
		
		while(!orderBurger.equalsIgnoreCase(menu1.hamburger) && !orderBurger.equalsIgnoreCase(menu1.cheeseburger) && !orderBurger.equalsIgnoreCase(menu1.royalburger) 
			 && !orderBurger.equalsIgnoreCase(menu1.crispychicken)&& !orderBurger.equalsIgnoreCase(menu1.cheesechicken)) {
			System.err.println("You have to choose the correct burger!");
			orderBurger = scan.nextLine();
			
		}
		
		if(orderBurger.equalsIgnoreCase(menu1.hamburger)) {
			
			burger = menu1.hamburger;
			
			System.out.println("I would like to order the "+ burger + "!" );
			
			orderFries = scan.nextLine();
			
			while(!orderFries.equalsIgnoreCase(menu1.fries[0]) && !orderFries.equalsIgnoreCase(menu1.fries[1]) && !orderFries.equalsIgnoreCase(menu1.fries[2]) 
					 && !orderFries.equalsIgnoreCase(menu1.fries[3])&& !orderFries.equalsIgnoreCase(menu1.fries[4])) {
					System.err.println("You have to choose the correct fries!");
					orderFries = scan.nextLine();
					
				}
			
			if(orderFries.equalsIgnoreCase(menu1.fries[0])) {
				
				fries = menu1.fries[0];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
				
			}
			else if(orderFries.equalsIgnoreCase(menu1.fries[1])) {
				
				fries = menu1.fries[1];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
           else if(orderFries.equalsIgnoreCase(menu1.fries[2])) {
				
				fries = menu1.fries[2];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
          else if(orderFries.equalsIgnoreCase(menu1.fries[3])) {
	
	           fries = menu1.fries[3];
	
              	System.out.println("I would like to order the "+ fries + "!" );
              	
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
          else if(orderFries.equalsIgnoreCase(menu1.fries[4])) {
	
	          fries = menu1.fries[4];
	
	          System.out.println("I would like to order the "+ fries + "!" );
	          
	          orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[3]) + " denars!");
					
				}
             else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.hamburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
			
			
			
		}
		else if(orderBurger.equalsIgnoreCase(menu1.cheeseburger)) {
			
			burger = menu1.cheeseburger;
			System.out.println("I would like to order the "+ burger + "!" );
			
            orderFries = scan.nextLine();
			
			while(!orderFries.equalsIgnoreCase(menu1.fries[0]) && !orderFries.equalsIgnoreCase(menu1.fries[1]) && !orderFries.equalsIgnoreCase(menu1.fries[2]) 
					 && !orderFries.equalsIgnoreCase(menu1.fries[3])&& !orderFries.equalsIgnoreCase(menu1.fries[4])) {
					System.err.println("You have to choose the correct fries!");
					orderFries = scan.nextLine();
					
				}
			
			if(orderFries.equalsIgnoreCase(menu1.fries[0])) {
				
				fries = menu1.fries[0];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
				
			}
			else if(orderFries.equalsIgnoreCase(menu1.fries[1])) {
				
				fries = menu1.fries[1];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[4]) + " denars!");
					 
				}
				
				
			}
           else if(orderFries.equalsIgnoreCase(menu1.fries[2])) {
				
				fries = menu1.fries[2];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
          else if(orderFries.equalsIgnoreCase(menu1.fries[3])) {
	
	           fries = menu1.fries[3];
	
              	System.out.println("I would like to order the "+ fries + "!" );
              	
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
          else if(orderFries.equalsIgnoreCase(menu1.fries[4])) {
	
	          fries = menu1.fries[4];
	
	          System.out.println("I would like to order the "+ fries + "!" );
	          
	          orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[3]) + " denars!");
					
				}
             else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheeseburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
			
		}
        else if(orderBurger.equalsIgnoreCase(menu1.royalburger)) {
			
			burger = menu1.royalburger;
			System.out.println("I would like to order the "+ burger + "!" );
            orderFries = scan.nextLine();
			
			while(!orderFries.equalsIgnoreCase(menu1.fries[0]) && !orderFries.equalsIgnoreCase(menu1.fries[1]) && !orderFries.equalsIgnoreCase(menu1.fries[2]) 
					 && !orderFries.equalsIgnoreCase(menu1.fries[3])&& !orderFries.equalsIgnoreCase(menu1.fries[4])) {
					System.err.println("You have to choose the correct fries!");
					orderFries = scan.nextLine();
					
				}
			
			if(orderFries.equalsIgnoreCase(menu1.fries[0])) {
				
				fries = menu1.fries[0];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[0] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
				
			}
			else if(orderFries.equalsIgnoreCase(menu1.fries[1])) {
				
				fries = menu1.fries[1];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
           else if(orderFries.equalsIgnoreCase(menu1.fries[2])) {
				
				fries = menu1.fries[2];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[2] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
          else if(orderFries.equalsIgnoreCase(menu1.fries[3])) {
	
	           fries = menu1.fries[3];
	
              	System.out.println("I would like to order the "+ fries + "!" );
              	
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[3] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
          else if(orderFries.equalsIgnoreCase(menu1.fries[4])) {
	
	          fries = menu1.fries[4];
	
	          System.out.println("I would like to order the "+ fries + "!" );
	          
	          orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[3]) + " denars!");
					
				}
             else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[4] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
			
		}
        else if(orderBurger.equalsIgnoreCase(menu1.crispychicken)) {
			
			burger = menu1.crispychicken;
			System.out.println("I would like to order the "+ burger + "!" );
			
orderFries = scan.nextLine();
			
			while(!orderFries.equalsIgnoreCase(menu1.fries[0]) && !orderFries.equalsIgnoreCase(menu1.fries[1]) && !orderFries.equalsIgnoreCase(menu1.fries[2]) 
					 && !orderFries.equalsIgnoreCase(menu1.fries[3])&& !orderFries.equalsIgnoreCase(menu1.fries[4])) {
					System.err.println("You have to choose the correct fries!");
					orderFries = scan.nextLine();
					
				}
			
			if(orderFries.equalsIgnoreCase(menu1.fries[0])) {
				
				fries = menu1.fries[0];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
				
			}
			else if(orderFries.equalsIgnoreCase(menu1.fries[1])) {
				
				fries = menu1.fries[1];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.royalburgerPrice + menu1.friesPrice[1] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
           else if(orderFries.equalsIgnoreCase(menu1.fries[2])) {
				
				fries = menu1.fries[2];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[2]) + " enars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
          else if(orderFries.equalsIgnoreCase(menu1.fries[3])) {
	
	           fries = menu1.fries[3];
	
              	System.out.println("I would like to order the "+ fries + "!" );
              	
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
          else if(orderFries.equalsIgnoreCase(menu1.fries[4])) {
	
	          fries = menu1.fries[4];
	
	          System.out.println("I would like to order the "+ fries + "!" );
	          
	          orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[3]) + " denars!");
					
				}
             else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}

			
		}
        else if(orderBurger.equalsIgnoreCase(menu1.cheesechicken)) {
        	
        	burger = menu1.cheesechicken;
        	System.out.println("I would like to order the "+ burger + "!" );
        	
orderFries = scan.nextLine();
			
			while(!orderFries.equalsIgnoreCase(menu1.fries[0]) && !orderFries.equalsIgnoreCase(menu1.fries[1]) && !orderFries.equalsIgnoreCase(menu1.fries[2]) 
					 && !orderFries.equalsIgnoreCase(menu1.fries[3])&& !orderFries.equalsIgnoreCase(menu1.fries[4])) {
					System.err.println("You have to choose the correct fries!");
					orderFries = scan.nextLine();
					
				}
			
			if(orderFries.equalsIgnoreCase(menu1.fries[0])) {
				
				fries = menu1.fries[0];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[0] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
				
			}
			else if(orderFries.equalsIgnoreCase(menu1.fries[1])) {
				
				fries = menu1.fries[1];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
				
				orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[1] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
           else if(orderFries.equalsIgnoreCase(menu1.fries[2])) {
				
				fries = menu1.fries[2];
				
				System.out.println("I would like to order the "+ fries + "!" );
				
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[2] + menu1.drinksPrice[4]) + " denars!");
					
				}
				
				
			}
          else if(orderFries.equalsIgnoreCase(menu1.fries[3])) {
	
	           fries = menu1.fries[3];
	
              	System.out.println("I would like to order the "+ fries + "!" );
              	
                orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[3]) + " denars!");
					
				}
               else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[3] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}
          else if(orderFries.equalsIgnoreCase(menu1.fries[4])) {
	
	          fries = menu1.fries[4];
	
	          System.out.println("I would like to order the "+ fries + "!" );
	          
	          orderDrinks = scan.nextLine();
				
				while(!orderDrinks.equalsIgnoreCase(menu1.drinks[0]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[1]) && !orderDrinks.equalsIgnoreCase(menu1.drinks[2]) 
						 && !orderDrinks.equalsIgnoreCase(menu1.drinks[3])&& !orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
						System.err.println("You have to choose the correct drink!");
						orderDrinks = scan.nextLine();
						
					}
				
				if(orderDrinks.equalsIgnoreCase(menu1.drinks[0])) {
					
					drinks = menu1.drinks[0];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[0]) + " denars!");
					
				}
				
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[1])) {
					
					drinks = menu1.drinks[1];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[1]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[2])) {
					
					drinks = menu1.drinks[2];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[2]) + " denars!");
					
				}
				else if(orderDrinks.equalsIgnoreCase(menu1.drinks[3])) {
					
					drinks = menu1.drinks[3];
					
					System.out.println("The price is: " + (menu1.crispychickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[3]) + " denars!");
					
				}
             else if(orderDrinks.equalsIgnoreCase(menu1.drinks[4])) {
					
					drinks = menu1.drinks[4];
					
					System.out.println("The price is: " + (menu1.cheesechickenPrice + menu1.friesPrice[4] + menu1.drinksPrice[4]) + " denars!");
					
				}
	
	
}

        	
        }
		
		else {
			
			System.err.println("You have to choose the correct burger!");
			
		}
		
		
		

	}
		customer1.bye();
		worker1.bye();

}
}

import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    	System.out.print("Waiter: Hello, welcome to Little Spain. Please take a seat and calmly choose what you would like to order");
    	System.out.print("\n\nMe: First, I should check the appetizers to see what they sell");

    	System.out.print("\n ________________________________________________________________");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Manchego cheese tapas with Serrano ham ................... 20$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Mini cheese and ham bocatas of your choice, with olive oil and |");
    	System.out.print("\n| tomato ................................................... 25$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Natural pork cracklings .................................. 15$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Bread sticks ............................................. 5$  |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Large tapa with 3 types of olives, acorn-fed Iberian ham,      |");
    	System.out.print("\n| Manchego and goat cheeses, marinated anchovies and grapes  45$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n ________________________________________________________________");

    	  try {
              Thread.sleep(5000); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
    	
    	System.out.print("\n\nSelect your option with numbers example 1 ");
        int Menu = Integer.parseInt(in.nextLine());
        double Total = 0;
        if (Menu == 1) {
        	
        	Total +=  20;
        	
        } else if (Menu == 2) {
        	
        	Total += 25;
        	
        }  if (Menu == 3) {
        	
            Total += 15;
        	
        } else if (Menu == 4) {
        	
        	Total += 5;
        	
        } else if (Menu == 5) {
        	
        Total += 45;
        
        }
        
        System.out.print("\nWaiter: Perfect, sir, would you like another appetizer or would you prefer to order the main course?");
    	System.out.print("\n\nSelect your option 1 is other 2 is next");
        int Next = Integer.parseInt(in.nextLine());
        
        if (Next == 1) {
        	
        	System.out.print("\n\nSelect your option with numbers example 1 ");
            int Menu2 = Integer.parseInt(in.nextLine());
        	
            if (Menu == 1) {
            	
            Total += 20;
            	
            } else if (Menu == 2) {
            	
            Total += 25;
            	
            } else if (Menu == 3) {
            	
            Total += 15;
            	
            } else if (Menu == 4) {
            	
            Total += 5;
            
            } else if (Menu == 5) {
            	
            Total += 45;
            
            }
        }
        
        System.out.print("\nWaiter: Here is the main menu menu, sir");
        System.out.print("\n\nMe: My maximun is 220$ I need be carefull");
        
        double Budget = 220;

    	System.out.print("\n ________________________________________________________________");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Classic paella (2 or 3 Adults) ........................... 50$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Whole suckling pig grilled over coals (6 adults) ........ 200$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Galician-style octopus ................................... 25$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Potato omelet with onion, tomato and cheese .............. 20$ |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n| Andalusian gazpacho with bread ........................... 10$ |");
     	System.out.print("\n|                                                                |");
    	System.out.print("\n| Asturian Cachopo ......................................... 30$ |");
     	System.out.print("\n| (2 veal cutlets stuffed with cheese and fried Serrano ham)     |");
     	System.out.print("\n|                                                                |");
     	System.out.print("\n| Calamari Bocatas ......................................... 15$ |");
    	System.out.print("\n ________________________________________________________________");

    	  try {
              Thread.sleep(5000); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
    	
    	System.out.print("\n\nSelect your option with numbers example 1 ");
        int Menu2 = Integer.parseInt(in.nextLine());

        if (Menu2 == 1) {
        	
        	Total +=  50;
        	
        } else if (Menu2 == 2) {
        	
        	Total += 200;
        	
        } else if (Menu2 == 3) {
        	
            Total += 25;
        	
        } else if (Menu2 == 4) {
        	
        	Total += 20;
        	
        } else if (Menu2 == 5) {
        	
        	Total += 10;
        	
        } else if (Menu2 == 6) {
        	
        	Total += 30;
        	
        } else if (Menu2 == 7) {
        	
        	Total += 15;
        }
        
        System.out.print("\nWaiter: Would you like a drink to go with it?");
        System.out.print("\n\nMe: Maybe");
        
    	System.out.print("\n\nSelect your option 1 yes or  2 is next");
        int Next2 = Integer.parseInt(in.nextLine());
        
        if (Next2 == 1) {
        	
        	System.out.print("\n ________________________________________________________________");
        	System.out.print("\n|                                                                |");
        	System.out.print("\n| Caña  ..................................................... 5$ |");
        	System.out.print("\n|                                                                |");
        	System.out.print("\n| Rioja o Ribera (Complete Bottle).......................... 18$ |");
        	System.out.print("\n|                                                                |");
        	System.out.print("\n| Vermut .................................................... 5$ |");
        	System.out.print("\n|                                                                |");
        	System.out.print("\n| Sangría (Complete Bottle) ................................ 18$ |");
        	System.out.print("\n|                                                                |");
        	System.out.print("\n| Sodas (Coca Cola/Pepsi ect) ............................... 3$ |");
         	System.out.print("\n|                                                                |");
        	System.out.print("\n| Coffe with extras ......................................... 3$ |");
         	System.out.print("\n|                                                                |");
         	System.out.print("\n| Mineral Water ............................................. 2$ |");
        	System.out.print("\n ________________________________________________________________");

        	System.out.print("\n\nSelect your option with numbers example 1 ");
            int Menu3 = Integer.parseInt(in.nextLine());

            if (Menu3 == 1) {
            	
            	Total +=  5;
            	
            } else if (Menu2 == 2) {
            	
            	Total += 18;
            	
            } else if (Menu2 == 3) {
            	
                Total += 5;
            	
            } else if (Menu2 == 4) {
            	
            	Total += 18;
            	
            } else if (Menu2 == 5) {
            	
            	Total +=3;
            	
            } else if (Menu2 == 6) {
            	
            	Total += 3;
            	
            } else if (Menu2 == 7) {
            	
            	Total += 2;
            }
            
        }
        
        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.print("\n\nMe: After eating, I waited a bit and asked for the bill; I'll check it.");
        
        double Discount10 = (Total/100)*10;
        double Discount20 = (Total/100)*20;		
        
        if ((Total >= 30) & (Total < 50)) {
        	
        	double TotalF = Total - Discount10;
        	  double Taxes = (TotalF/100)*13;
              double Tip = (TotalF/100)*18;
              double Payment = Taxes+Tip+TotalF;
            		  
            		  System.out.print("\n ______________________________________________________");
          	System.out.print("\n|                                                                |");
          	System.out.print("\n|                         LITTLE SPAIN                           |");
          	System.out.print("\n|                                                                |");
          	System.out.print("\n|      Total: "+TotalF+"                  Tip:"+Tip+"                    |");
          	System.out.print("\n|      Taxes: "+Taxes+"                                             |");
          	System.out.print("\n|                                                                |");
          	System.out.print("\n|      Estimated Payment: "+Payment+"                                  |");
          	System.out.print("\n ________________________________________________________________");
          	
          	if (Budget < Payment){
          		
                  System.out.print("\n\nMe: I stopped, saying I was going to the bathroom, to escape through the window since I was a tourist and it was my last day. I took advantage of the situation to escape through the airport. Next time I'll check the prices better, although now my visa has been suspended.");

          	} else {
          		
          		double BudgetFinal = Budget - Payment;
                  System.out.print("\n\nMe: I left and was able to enjoy the restaurant; in total I had "+BudgetFinal+" dollars left.");

          	}
          	
        	
        } else if (Total >= 50) {
        	
        	double TotalF = Total - Discount20;
        	  double Taxes = (TotalF/100)*13;
              double Tip = (TotalF/100)*18;
              double Payment = Taxes+Tip+TotalF;
        

        System.out.print("\n ________________________________________________________________");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n|                         LITTLE SPAIN                           |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n|      Total: "+TotalF+"                  Tip:"+Tip+"                    |");
    	System.out.print("\n|      Taxes: "+Taxes+"                                             |");
    	System.out.print("\n|                                                                |");
    	System.out.print("\n|      Estimated Payment: "+Payment+"                                  |");
    	System.out.print("\n ________________________________________________________________");
    	
    	if (Budget < Payment){
    		
            System.out.print("\n\nMe: I stopped, saying I was going to the bathroom, to escape through the window since I was a tourist and it was my last day. I took advantage of the situation to escape through the airport. Next time I'll check the prices better, although now my visa has been suspended.");

    	} else {
    		
    		double BudgetFinal = Budget - Payment;
            System.out.print("\n\nMe: I left and was able to enjoy the restaurant; in total I had "+BudgetFinal+" dollars left.");

    	}
    	
        }
    	
	}

}

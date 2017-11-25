/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1nick;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nickson
 */
public class CustomerOrder {

    public void CustomerOrdering() {

        //initialize
        String[] foodName = {"Cheese Burger - 10.50", "Chicken Rice - 6.50", "Agio Olio - 12.50", "Kebab - 5.50", "Fried Rice - 6.50"};

        int selection;
        int validate = 1;
        int foodSelect;
        double totalPrice=0;
        ArrayList<CustomerOrderDomain> foodOrder  = new ArrayList<CustomerOrderDomain>();
      

        do {
            System.out.println("Customer Page");
            System.out.println("========================================================");
            System.out.println("1. Make Order");
            System.out.println("2. View Order Details");
            System.out.println("3. Make payment");
            System.out.println("4. Exit");
            System.out.println("========================================================");

            Scanner s = new Scanner(System.in);
            System.out.printf("Your Selection: ");
            selection = s.nextInt();
            CustomerOrderDomain COD = new CustomerOrderDomain();

            if (selection == 1) {
                   
                    System.out.flush();
                    for (int i = 0; i < foodName.length; i++) {
                        System.out.printf("%d ." + foodName[i] + " \n", i );
                    }
                    System.out.printf("Select number: ");
                    foodSelect = s.nextInt();
                   
                    COD.CustomerOrderDomain(foodName[foodSelect]);
                    foodOrder.add(COD);
                 
                            
                        
         
                
                
            } else if (selection == 2) {
                System.out.flush();
                for(int i = 0; i<foodOrder.size();i++){
                    System.out.printf("%s RM %.2f \n" , foodOrder.get(i).getFoodName(), foodOrder.get(i).getPrice());
                    totalPrice+=foodOrder.get(i).getPrice();
                
                }
                System.out.printf("Total Price : RM %.2f \n",totalPrice);
                s = new Scanner(System.in);
                System.out.printf("Press enter to go back ");
                String pressEnter = s.nextLine();

            } else if (selection == 3) {
                System.out.println("3. Make payment");
            } else if (selection == 4) {
                System.out.println("Thank you for using the system.");
            } else {
                System.out.println("Error selection.");
            }

        } while (selection != 4);

    }

}

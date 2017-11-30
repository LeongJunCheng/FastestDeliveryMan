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
        int foodSelect = 0;
        double totalPrice = 0;

        String[] fooodOrder = null;
        ArrayList<CustomerOrderDomain> foodOrder = new ArrayList<CustomerOrderDomain>();
        ArrayList list = new ArrayList();
//        ArrayList<CustomerOrderDomain> foodDetails = new ArrayList<CustomerOrderDomain>();
        CustomerOrderDomain COD = new CustomerOrderDomain();

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

            if (selection == 1) {
                System.out.println("========================================================");
                System.out.println("No\tFood Name \t\t\t Price");
                System.out.println("========================================================");
                for (int u = 0; u < foodName.length; u++) {
                    String[] FD = foodName[u].split(" - ");
                    double price = Double.parseDouble(FD[1]);
//                        COD.CustomerOrderDomain(foodName[u]);
//                        foodDetails.add(COD);

                    System.out.printf("%d.\t%-10s\t\t\t RM %.2f \n", u + 1, FD[0], price);
                }
                System.out.printf("Select number: ");
                foodSelect = s.nextInt();
                //fooodOrder.add(foodName[foodSelect - 1]);

                //COD.CustomerOrderDomain(foodName[foodSelect - 1]);
                //foodOrder.add(COD);
                list.add(foodName[foodSelect - 1]);

            } else if (selection == 2) {
                System.out.flush();
                System.out.println("========================================================");
                System.out.println("Food Name \t\t\t Price");
                System.out.println("========================================================");
                for (int i = 0; i < list.size(); i++) {
                    String tmp = (String) list.get(i);
                    String[] tmp2 = tmp.split(" - ");
                    String name = tmp2[0];
                    double price = Double.parseDouble(tmp2[1]);
                    int d = 0;

                    //System.out.printf("%s\t\tRM %.2f \n", foodOrder.get(i).getFoodName(), foodOrder.get(i).getPrice());
                    System.out.printf("%-10s\t\t\tRM %04.2f \n", name, price);
                    //System.out.println(list.get(i));e();
                    totalPrice += price;
                    //totalPrice += foodOrder.get(i).getPric

                }
                System.out.println("========================================================");
                System.out.printf("Total Price : RM %.2f \n", totalPrice);
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

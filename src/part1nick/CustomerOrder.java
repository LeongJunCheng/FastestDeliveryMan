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
            System.out.println("4. ");
            System.out.println("5. Exit");
            System.out.println("========================================================");

            Scanner s = new Scanner(System.in);
            System.out.printf("Your Selection: ");
            selection = s.nextInt();

            if (selection == 1) {
                boolean exit = false;
                do {
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
                    System.out.printf("Select number(0 to exit): ");
                    foodSelect = s.nextInt();
                    if (foodSelect == 0) {
                        exit = true;
                    } else //fooodOrder.add(foodName[foodSelect - 1]);
                    //COD.CustomerOrderDomain(foodName[foodSelect - 1]);
                    //foodOrder.add(COD);
                    {
                        list.add(foodName[foodSelect - 1]);

                    }
                } while (exit == false);

            } else if (selection == 2) {
                double totaltemp = 0;
                System.out.println("========================================================");
                System.out.println("Food Name \t\t\t Price");
                System.out.println("========================================================");
                for (int i = 0; i < list.size(); i++) {

                    String tmp = (String) list.get(i);
                    String[] tmp2 = tmp.split(" - ");
                    String name = tmp2[0];
                    double price = Double.parseDouble(tmp2[1]);

                    //System.out.printf("%s\t\tRM %.2f \n", foodOrder.get(i).getFoodName(), foodOrder.get(i).getPrice());
                    System.out.printf("%-10s\t\t\tRM %04.2f \n", name, price);
                    //System.out.println(list.get(i));e();
                    totaltemp += price;
                    totalPrice = totaltemp;
                    int d = 0;
                    //totalPrice += foodOrder.get(i).getPric

                }

                System.out.println("========================================================");
                System.out.printf("Total Price : RM %.2f \n", totalPrice);
                s = new Scanner(System.in);
                System.out.printf("Press enter to go back ");
                String pressEnter = s.nextLine();

            } else if (selection == 3) {
                int scPaymentType = 0;
                System.out.println("Select Your Payment Method (0 to exit)");
                System.out.println("========================================================");
                System.out.println("1. Credit Card Payement");
                System.out.println("2. Cash on delivery");
                System.out.print("Selection : ");
                scPaymentType = s.nextInt();

                if (scPaymentType == 1) {

                    boolean exit = false;

                    do {
                        String visaCardNum = "388576018410707";

                        String enterVisaCardNum;
                        System.out.println("Please enter card number: (16 digit)");
                        enterVisaCardNum = s.next();

                        if (enterVisaCardNum.length() == visaCardNum.length()) {
                            
                            if (enterVisaCardNum.equals(visaCardNum)) {
                                
                                String expiredDate = "20/20";
                                String enterexpiredDate;
                                System.out.println("Please enter expire Date and Year (Date/Year)");
                                enterexpiredDate = s.next();
                                
                                if (enterexpiredDate.equals(expiredDate)) {
                                    
                                    String securityCode = "724";
                                    String enterSecurityCode;
                                    System.out.println("Please enter security code CVT");
                                    enterSecurityCode = s.next();
                                    
                                    if (enterSecurityCode.equals(securityCode)) {
                                        
                                        char yesno;
                                        System.out.printf("Your total price is RM %.2f \n", totalPrice);
                                        System.out.println("Confirm Payment?(Y/N) ");
                                        yesno = s.next().charAt(0);
                                        
                                        if (yesno == 'Y' || yesno == 'y') {
                                            
                                            System.out.println("Payment Sucessful.Your foods will be deliver soon!  ");
                                            list.clear();
                                            totalPrice = 0;
                                            exit = true;

                                        }
                                    } else 
                                        System.out.println("Wrong security code!");
                                    
                                } else 
                                    System.out.println("Invalid expire date!");
                                
                            } else 
                                System.out.println("Wrong card Number!");
                            
                        } else 
                            System.out.println("Visa card number must be exact 16 digits!!");
                        
                    } while (exit == false);

                } else if (scPaymentType == 2) {
                    char yesno;
                    System.out.print("Confirm Using cash payment?(extra 5% total fees will be charge)");
                    System.out.printf("Your total price is RM %.2f after 5% charge RM%.2f\n", totalPrice, (totalPrice*1.5));
                    
                    yesno = s.next().charAt(0);
                    if (yesno == 'Y' || yesno == 'y') {
                        System.out.println("Payment Sucessful.Your foods will be deliver soon!  ");
                        list.clear();
                        totalPrice = 0;

                    }
                }

            } else if (selection == 5) {
                System.out.println("Thank you for using the system.");
            } else {
                System.out.println("Error selection.");
            }

        } while (selection != 5);

    }

}

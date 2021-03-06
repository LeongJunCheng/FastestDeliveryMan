/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author leong
 */
public class CheckSuccessDelivery {
    public void checkDelivery(ArrayList<DeliveryDomain> delivery){
        Scanner s = new Scanner(System.in);
        DeliveryDomain dd = new DeliveryDomain();
        
        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>(delivery);
        int selection = 0;
        do{
            int count = 0;
            dd.clear();
            System.out.println("Delivery Report Selection");
            System.out.println("=========================================");
            System.out.println("1. Annual Report");
            System.out.println("2. Monthly Report");
            System.out.println("3. Daily Report");
            System.out.println("0. Exit to main menu");
            System.out.printf("Choose report type to generate: ");
            selection = s.nextInt();

            if(selection == 1){
                System.out.println("Current Year Delivery Report");
                System.out.println("=============================================================================");
                System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "StaffID", "Date", "Order ID");
                System.out.println("=============================================================================");
                int validate = 0;
                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getStatus().equals("Delivered")){
                        if(deliveryList.get(a).getYear() == year){
                            System.out.println(deliveryList.get(a).toString2());
                            validate = 0;
                            count++;
                        }else{
                            validate = 1;
                        }
                    }
                }
                if(validate == 1){
                    System.out.println("No Successful Delivery for the current Year");
                }else{
                    System.out.printf("Total Deliveries this year = %d\n", count);
                }
                
            }else if(selection == 2){
                System.out.println("Current Month Delivery Report");
                System.out.println("=============================================================================");
                System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "StaffID", "Date", "Order ID");
                System.out.println("=============================================================================");
                int validate = 0;
                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getStatus().equals("Delivered")){
                        if(deliveryList.get(a).getMonth() == month){
                            dd = new DeliveryDomain("a", "a", "a", "a", "a");
                            System.out.println(deliveryList.get(a).toString2());
                            validate = 0;
                            count++;
                        }else{
                            if(dd.getDate() == "a"){
                                
                            }else{
                                validate = 1;
                            }
                        }
                    }
                }
                if(validate == 1){
                    System.out.println("No Successful Delivery for the current Month");
                }else{
                    System.out.printf("Total Deliveries this month = %d\n", count);
                }
                
            }else if(selection == 3){
                System.out.println("Current Day Delivery Report");
                System.out.println("=============================================================================");
                System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "StaffID", "Date", "Order ID");
                System.out.println("=============================================================================");
                int validate = 0;
                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getStatus().equals("Delivered")){
                        if(deliveryList.get(a).getDay() == day){
                            dd = new DeliveryDomain("a", "a", "a", "a", "a");
                            System.out.println(deliveryList.get(a).toString2());
                            validate = 0;
                            count++;
                        }else{
                            if(dd.getDate() == "a"){
                                
                            }else{
                                validate = 1;
                            }
                        }
                    }
                }
                
                if(validate == 1){
                    System.out.println("No Successful Delivery for the current Day");
                }else{
                    System.out.printf("Total Deliveries for today = %d\n", count);
                }
                
            }else if(selection == 0){
                
            }else{
                System.out.println("Wrong selection.");
            }
        }while(selection != 0);
        
        
    }
}

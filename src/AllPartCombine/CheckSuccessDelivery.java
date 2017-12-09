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
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>(delivery);
        int selection = 0;
        do{
            System.out.println("Delivery Report Selection");
            System.out.println("=========================================");
            System.out.println("1. Annual Report");
            System.out.println("2. Monthly Report");
            System.out.println("3. Daily Report");
            System.out.println("0. Exit to main menu");
            System.out.println("Choose report type to generate: ");
            selection = s.nextInt();

            if(selection == 1){
                System.out.println("Current Year Delivery Report");
                System.out.println("=======================================");
                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getStatus().equals("Delivered")){
                        System.out.println(deliveryList.get(a));
                    }
                }
                
                
            }else if(selection == 2){
                System.out.println("Current Month Delivery Report");
                System.out.println("=======================================");
                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getStatus().equals("Delivered")){
                        if(deliveryList.get(a).getDate().equals(""))
                        System.out.println(deliveryList.get(a));
                    }
                }
            }else if(selection == 3){

            }else if(selection == 0){

            }else{

            }
        }while(selection != 0);
        
        
    }
}

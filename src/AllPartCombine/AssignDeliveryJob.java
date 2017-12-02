/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leong
 */
public class AssignDeliveryJob {
    
    public ArrayList<DeliveryDomain> AssignJob(ArrayList<DeliveryDomain> delivery){
        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>(delivery);
        Scanner s = new Scanner(System.in);
        DeliveryDomain dd = new DeliveryDomain();
        int loopInit = 0;

        
        String deliveryID = "1";
        do{
            loopInit = 1;
            System.out.println("Pending Deliveries List");
            System.out.println("=======================================");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "ID", "StaffID", "Date", "Order ID", "Status");
            for(int a = 0; a < deliveryList.size(); a++){
                if(deliveryList.get(a).getStatus().equals("Pending")){
                    System.out.println(deliveryList.get(a));
                }
            }
            System.out.println("=======================================");
            System.out.printf("Enter the Delivery ID to assign job to (enter 0 to exit): ");
            deliveryID = s.nextLine();
            if(deliveryID.equals("0")){
                
            }else{
                s = new Scanner(System.in);
                System.out.printf("Enter the Staff ID that you want to assign: ");
                String staffID = s.nextLine();
                s = new Scanner(System.in);

                for(int a = 0; a < deliveryList.size(); a++){
                    if(deliveryList.get(a).getDeliveryID().equals(deliveryID)){
                        deliveryList.get(a).setStaffID(staffID);
                        deliveryList.get(a).setStatus("Delivering");
                        System.out.println("");
                    }
                }
            }
        }while(!deliveryID.equals("0"));
        
        return deliveryList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;

/**
 *
 * @author leong
 */
public class CheckPendingDelivery {
    
    public ArrayList<DeliveryDomain> checkDelivery(ArrayList<DeliveryDomain> delivery){
        DeliveryDomain dd = new DeliveryDomain();
        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>(delivery);
        
        System.out.println("Pending Deliveries List");
        System.out.println("=======================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "ID", "StaffID", "Date", "Order ID", "Status");
        for(int a = 0; a < deliveryList.size(); a++){
            if(deliveryList.get(a).getStatus().equals("Pending")){
                System.out.println(deliveryList.get(a));
            }
        }
        System.out.println("=======================================");
        
        return deliveryList;
    }
}

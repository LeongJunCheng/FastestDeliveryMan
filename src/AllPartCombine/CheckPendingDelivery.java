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
    
    public void checkDelivery(){
        DeliveryDomain dd = new DeliveryDomain();
        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>();
        
        deliveryList.add(new DeliveryDomain("D001", null, "15112017", "OR001", "Pending"));
        deliveryList.add(new DeliveryDomain("D002", null, "15112017", "OR002", "Pending"));
        deliveryList.add(new DeliveryDomain("D003", null, "15112017", "OR003", "Pending"));
        deliveryList.add(new DeliveryDomain("D004", "S004", "15112017", "OR004", "Delivering"));
        
        System.out.println("Pending Deliveries List");
        System.out.println("=======================================");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "ID", "Date", "Order ID", "Status");
        for(int a = 0; a < deliveryList.size(); a++){
            if(deliveryList.get(a).getStatus().equals("Pending")){
                System.out.println(deliveryList.get(a));
            }
        }
        System.out.println("=======================================");
    }
}

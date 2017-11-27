/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brandon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leong
 */
public class EditDeliveryStatus {
    public static void main(String args[]){
        StaffDomain2 d = new StaffDomain2();
        ArrayList<partbjc.StaffDomain2> staffList = new ArrayList<partbjc.StaffDomain2>();
        Scanner s = new Scanner(System.in);
        
        int validate = 0;
                do{
                    System.out.printf("Enter the delivery man Name(type 0 to exit): ");
                    String name = s.next();
                    
                    if(name.equals("0")){
                        validate = 1;
                    }else{
                        for(int a = 0; a < staffList.size(); a++){
                            if(name.equals(staffList.get(a).getName())){
                                System.out.printf("Delivery man Name: %30s\n", staffList.get(a).getName());
                                System.out.printf("Enter the new Status: ");
                                String status = s.next();
                                staffList.get(a).setStatus(status);
                                validate = 1;
                                System.out.println("The Delivery Man Status has been changed.");
                            }
                        }
                        if(validate == 0){
                            System.out.println("The Delivery Man is not exist. Please try again.");
                        }
                    }

                    
                    
                }while(validate != 1);
    }
}

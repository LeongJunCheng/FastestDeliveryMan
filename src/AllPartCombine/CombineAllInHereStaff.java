/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leong
 */
public class CombineAllInHereStaff {
    static int count2 = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection = 0;
        
        ArrayList<DeliveryDomain> deliveryList = new ArrayList<DeliveryDomain>();
        ArrayList<ScheduledOrder> orderList = new ArrayList<>();
        
        deliveryList.add(new DeliveryDomain("D001", null, "15112017", "OR001", "Pending"));
        deliveryList.add(new DeliveryDomain("D002", null, "15112017", "OR002", "Pending"));
        deliveryList.add(new DeliveryDomain("D003", "S004", "15112017", "OR003", "Delivered"));
        deliveryList.add(new DeliveryDomain("D004", "S004", "15112017", "OR004", "Delivering"));
        deliveryList.add(new DeliveryDomain("D005", "S004", "12122017", "OR003", "Delivered"));
        deliveryList.add(new DeliveryDomain("D006", "S004", "16122017", "OR003", "Delivered"));
        deliveryList.add(new DeliveryDomain("D007", "S004", "16122017", "OR003", "Delivered"));
        deliveryList.add(new DeliveryDomain("D008", "S004", "16122017", "OR003", "Delivered"));
        deliveryList.add(new DeliveryDomain("D009", "S004", "15112017", "OR003", "Delivered"));
        
        StaffDomain d = new StaffDomain();
        ArrayList<StaffDomain> staffList = new ArrayList<StaffDomain>();
        CheckPendingDelivery ck = new CheckPendingDelivery();
        int count = 0;
        
        do{
            System.out.println("Staff Menu");
            System.out.println("=============================");
            System.out.println("1. Display All Delivery Man Details");
            System.out.println("2. Add Delivery Man");
            System.out.println("3. Display And Edit Delivery Man Status");
            System.out.println("4. Schedule Order");
            System.out.println("5. Menu");
            System.out.println("6. Check for order delivery status");
            System.out.println("7. Assign Delivery man to Delivery");
            System.out.println("8. View Scheduled Orders");
            System.out.println("9. CEO Check for delivery report");
            System.out.println("10. Register As Affiliates");
            System.out.println("11. Staff Attendance");
            System.out.println("0. Exit");
            System.out.println("=============================");

            Scanner s = new Scanner(System.in);
            System.out.printf("Please Choose your action: ");
            selection = s.nextInt();

            if(selection == 1){
                System.out.printf("%-30s %-3s %3s %-30s\n", "Name", "Age", "Gender", "Status");
                System.out.println("===========================================================");
                for(int i = 0; i < staffList.size(); i++){
                    System.out.printf("%-30s %-3d  %c     %-30s\n", staffList.get(i).getName(), staffList.get(i).getAge(), staffList.get(i).getGender(), staffList.get(i).getStatus());
                }
                System.out.println("===========================================================");
            }
            else if(selection == 2){
                System.out.printf("Enter Name: ");
                String name = s.next();
                System.out.printf("Enter Age: ");
                int age = s.nextInt();
                System.out.printf("Enter Gender(M/F): ");
                char gender = s.next().charAt(0);
                System.out.printf("Enter Status(Free/Delivering): ");
                String status = s.next();
                
                d = new StaffDomain(name, age, gender, status);
                
                staffList.add(d);
            }
            else if(selection == 3){
                System.out.printf("%-30s %-3s %3s %-30s\n", "Name", "Age", "Gender", "Status");
                System.out.println("===========================================================");
                for(int i = 0; i < staffList.size(); i++){
                    System.out.printf("%-30s %-3d  %c     %-30s\n", staffList.get(i).getName(), staffList.get(i).getAge(), staffList.get(i).getGender(), staffList.get(i).getStatus());
                }
                System.out.println("===========================================================");
                
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
            else if(selection == 4){
                ModuleE modd = new ModuleE();
                orderList = modd.ScheduledOrdering(orderList);
            }
            else if(selection == 5){
                Menu m = new Menu();
                m.CallMenu();
            }
            else if(selection == 6){
                ck.checkDelivery(deliveryList);
            }
            else if(selection == 7){
                AssignDeliveryJob adj = new AssignDeliveryJob();
                deliveryList = adj.AssignJob(deliveryList);
            }
            else if(selection == 8){
                ModuleE modd = new ModuleE();
                modd.viewScheduleRecord(orderList);
            }
            else if(selection == 9){
                CheckSuccessDelivery csd = new CheckSuccessDelivery();
                csd.checkDelivery(deliveryList);
            }
            else if(selection == 10){
                RegisterAffiliates ra = new RegisterAffiliates();
                ra.Register();
                
            }
            else if(selection == 11){
                ClockInClockOut cock = new ClockInClockOut();
                cock.Attendance();
            }
            else if(selection == 0){
                System.out.println("Thank you for using the system.");
            }
            else{
                System.out.println("Selection error!");
            }

        }while(selection != 0);
        
    }
    
}


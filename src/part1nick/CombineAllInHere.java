/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partbq1jc;

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
public class CombineAllInHere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection = 0;
        
        StaffDomain d = new StaffDomain();
        ArrayList<StaffDomain> staffList = new ArrayList<StaffDomain>();
        int count = 0;
        
        do{
            System.out.println("Staff Menu");
            System.out.println("=============================");
            System.out.println("1. Display All Delivery Man Details");
            System.out.println("2. Add Delivery Man");
            System.out.println("3. Display And Edit Delivery Man Status");
            System.out.println("4. Exit");
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
                System.out.println("Thank you for using the system.");
            }
            else{
                System.out.println("Selection error!");
            }

        }while(selection != 4);
        
    }
    
}
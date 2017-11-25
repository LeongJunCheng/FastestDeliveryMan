/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partbjc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leong
 */
public class Staff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection = 0;
        
        StaffDomain2 d = new StaffDomain2();
        ArrayList<StaffDomain2> staffList = new ArrayList<StaffDomain2>();
        int count = 0;
        
        do{
            System.out.println("Staff Menu");
            System.out.println("=============================");
            System.out.println("1. Display All Delivery Man Details");
            System.out.println("2. Add Delivery Man");
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
                
                d = new StaffDomain2(name, age, gender, status);
                
                staffList.add(d);
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

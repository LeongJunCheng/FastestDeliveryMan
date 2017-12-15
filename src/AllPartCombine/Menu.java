/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Menu {
    
    public void CallMenu(){
    MenuDomain m = new MenuDomain();
    ArrayList<MenuDomain> mList = new ArrayList<MenuDomain>();
    int selection = 0;
    int FOODid = 0;
    int FID;
    int se = 0;
    Scanner s = new Scanner(System.in);
    
    do{
        System.out.printf("\n");
        System.out.println("Food Menu");
        System.out.println("========================");
        System.out.println("1. Display Menu");
        System.out.println("2. Add Menu");
        System.out.println("3. Edit Menu");

        System.out.printf("Choose your selection: ");
        selection = s.nextInt();

        if (selection == 1) {
            
            if (mList.isEmpty()) {
                System.out.println( "There is no any food in the menu!!");
            } else {
                System.out.printf("%-28s  %-25s %-30s %-3s \n", "Food ID", "Food Name", "Description", "Price");
                for (int n = 0; n < mList.size(); n++) {

                    System.out.printf("%-30d %-25s %-30s %.2f \n", mList.get(n).getFID(), mList.get(n).getFname(), mList.get(n).getDescription(), mList.get(n).getPrice());

                }
            }

        } else if (selection == 2) {
            s = new Scanner(System.in);
            System.out.printf("Enter Food Name: ");
            String fname = s.nextLine();
            s = new Scanner(System.in);
            System.out.printf("Enter Food description: ");
            String fDescription = s.nextLine();
            s = new Scanner(System.in);
            System.out.printf("Enter Food Price : ");
            double fprice = s.nextDouble();
            FOODid++;
            

            m = new MenuDomain(FOODid, fname, fDescription, fprice);

            mList.add(m);

        }  else if(selection == 3){
            
          
          System.out.printf("%-28s  %-25s %-30s %-3s \n", "Food ID", "Food Name", "Description", "Price");
          for (int n = 0; n < mList.size(); n++) {

          System.out.printf("%-30d %-25s %-30s %.2f \n", mList.get(n).getFID(), mList.get(n).getFname(), mList.get(n).getDescription(), mList.get(n).getPrice());
          }
            
                  
            System.out.printf("Select food id to edit (Enter 0 to exit): ");
            FID = s.nextInt();
            
            do{
            
             for (int a = 0; a < mList.size(); a++) {     
                if(FID == mList.get(a).getFID()){
                 System.out.printf("\n");
                 System.out.println("Selected Food Details");
                 System.out.println("=====================");
                 System.out.printf("Food Name: %s \n",mList.get(a).getFname());
                 System.out.printf("Food Description: %s \n",mList.get(a).getDescription());
                 System.out.printf("Food Price: %.2f \n",mList.get(a).getPrice());
                 System.out.println("=====================");
                  
                    System.out.println("1. Edit Food Name");
                    System.out.println("2. Edit Food Description");
                    System.out.println("3. Edit Food Price");
                    
                    System.out.printf("Enter your selection (Enter 0 to exit) : ");
                    se = s.nextInt();
                   
                   
                    if(se == 1){
                        System.out.printf("Food Name : %s \n" ,mList.get(a).getFname());
                        System.out.printf("Enter New Food Name: ");
                        String fname = s.next();
                        
                        mList.get(a).SetFname(fname);
                        
                        System.out.println("Food Name have been changes!!");
                    }
                    
                    else if(se == 2){
                        System.out.printf("Food Desscription : %s \n" ,mList.get(a).getDescription());
                        System.out.printf("Enter New Food Description: ");
                        String fDescription = s.next();
                        
                        mList.get(a).SetFdescription(fDescription);
                        
                        System.out.println("Food Description have been changes!!");
                    }
                    
                    else if(se == 3){
                        System.out.printf("Food price : %s \n" ,mList.get(a).getPrice());
                        System.out.printf("Enter New Food Price: ");
                        double fPrice = s.nextDouble();
                        
                        mList.get(a).SetPrice(fPrice);
                        
                        System.out.println("Food Price have been changes!!");
                    }
                 
                }
             }
                
              
                
            }while(FID != 0 && se != 0);
        }
    }while(selection != 0);
    }
}
    

    

    

    
        
        
        


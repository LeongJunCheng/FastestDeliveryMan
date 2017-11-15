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
    Scanner s = new Scanner(System.in);
    
    do{
        System.out.printf("\n");
        System.out.println("Food Menu");
        System.out.println("========================");
        System.out.println("1. Display Menu");
        System.out.println("2. Add Menu");

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

        } 
    }while(selection != 0);
    }
}
    

    

    

    
        
        
        


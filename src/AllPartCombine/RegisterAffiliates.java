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

public class RegisterAffiliates {
    
    public void Register(){
        
        Scanner scan = new Scanner(System.in);
        AffiliatesDomain aDomain = new AffiliatesDomain();
        ArrayList<AffiliatesDomain> aList = new ArrayList<AffiliatesDomain>();
        int selec;
        int rID = 1;
        char yesno = 'n' ;
        
         do{
                    System.out.println("1. Register as Affiliates");
                    System.out.println("2. Display Affiliates details");

                    System.out.printf("Enter Selection(Enter 0 to exit): ");
                    selec = scan.nextInt();


                    if(selec == 1){
                    do{
                         System.out.println();
                    System.out.println("Register to become affiliates !!");
                    System.out.println("================================");

                    System.out.println("Please Enter Your personal details and Restarant details!!");
                    System.out.printf("Contact Name: ");
                    String oname = scan.next();

                    System.out.printf("Email Address: ");
                    String oEmail = scan.next();

                    System.out.printf("Password: ");
                    String oPass = scan.next();

                    System.out.printf("Confirm Password: ");
                    String oConPass = scan.next();

                    System.out.println("Restaurant Details");
                    System.out.println("==================");

                    System.out.printf("Restaurant Name: ");
                    String rname = scan.next();

                    System.out.printf("Restaurant Contact Number: ");
                    int rCnumber = scan.nextInt();

                    System.out.printf("Restaurant Address:");
                    String rAddress = scan.next();

                    System.out.printf("City: ");
                    String rCity = scan.next();

                    System.out.printf("Zip Code: ");
                    int rZipCode = scan.nextInt();


                    if(oConPass.equals(oPass)){
                        System.out.println();
                        System.out.println("Register Succefully !!!!!");
                        aDomain = new AffiliatesDomain(rID,oname,oEmail,oPass,rname,rCnumber,rAddress,rCity,rZipCode);
                        aList.add(aDomain);

                        rID++;

                        System.out.printf("Continue Register?(Y/N): ");
                        yesno = scan.next().charAt(0);


                    }else{
                        System.out.println();
                        System.out.println("Confirm Password is diffrent with the password!! ");
                    }
                }while(yesno != 'n' && yesno != 'N');
               
            }

            if(selec == 2){
                System.out.println();
                 if (aList.isEmpty()) {
                    System.out.println( "There is no any Affiliates details in the list!!");
                } else {
                    System.out.printf("%-10s %-30s %-25s %-30s %-45s %-30s %-20s %-25s\n", "ID","Affiliates Name", "E-Mail", "Restaurant Name", "Restaurant Contact number" , "Address" , "City" , "Zip Code");
                    for (int n = 0; n < aList.size(); n++) {

                        System.out.printf("%-15d %-25s %-30s %-40s %-30d %-25s %-25s %-25d \n",aList.get(n).getaID(),aList.get(n).getoName(),aList.get(n).getoEmail(),aList.get(n).getrName(),aList.get(n).getrContactNum(),aList.get(n).getrAddress(),aList.get(n).getrCity(),aList.get(n).getrZipCode() );

                    }
                System.out.printf("\n");
                }
            }
        
        }while(selec != 0 );
        
            
        
        
                
        
    }
    
    public static void main(String[] args){
        RegisterAffiliates r = new RegisterAffiliates();
        r.Register();
    }
}

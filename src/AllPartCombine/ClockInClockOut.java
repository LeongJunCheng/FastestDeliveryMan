/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class ClockInClockOut {
    public void Attendance() {
        WorkingHr a  = new WorkingHr();
        int exit = 0, selection = 0;
        do{
            System.out.println("==========================");
            System.out.println("1. Clock In");
            System.out.println("2. Clock Out");
            System.out.println("3. Display Record");
            System.out.println("0. Back to the Main Menu");
            System.out.println("==========================");
            System.out.printf("Enter the selection: ");
            Scanner scan = new Scanner(System.in);
            selection = scan.nextInt();
            if (selection == 1) {
                a.ClockIn();
                
            } else if (selection == 2) {
                a.ClockOut();
                
            } else if (selection == 3) {
                a.getRecord();
                
            }else if(selection == 0){
                break;
            }
        }while(selection != 0);       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jeffrey
 */
public class WorkingHr {
    private ClockDomain cd;
    private ArrayList<ClockDomain> list = new ArrayList<>();
    private String[] id = {"S001","S002"};   
    Scanner scan = new Scanner(System.in);

    public WorkingHr() {
    }

    public WorkingHr(ClockDomain cd) {
        cd = new ClockDomain();
    }
    
    public void ClockIn() {
        int counter = 0;
        ClockDomain cd = new ClockDomain();
        System.out.print("Enter an ID for Clock In : ");
        String input = scan.nextLine();
        
        for (int i = 0; i < id.length; i++) {
            if (id[i].equals(input)) {
                cd.setStaffID(input);
                cd.setClockIn(System.currentTimeMillis());
                cd.setClockOut(0);
                list.add(cd);
                System.out.println("\nClock In Successfully\n");
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("\nID Not Found\n");
            counter = 0;
            ClockIn();
        }     
    }
    
    public void ClockOut() {
        int counter = 0;
        System.out.print("Enter an ID for Clock Out: ");
        String input = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStaffID().equals(input)) {
                list.get(i).setClockOut(System.currentTimeMillis());
                System.out.println("Clock Out Successfully");
                counter++;
                break;
            }
        }
        
        if (counter == 0) {
            System.out.println("ID Not Found");
            counter = 0;
            ClockOut();
        }
    }
    
    public void getRecord() {
        int counter = 0;
        System.out.print("\nEnter an ID for display records: ");
        String input = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStaffID().equals(input)) {
                int hrs = (int) TimeUnit.MILLISECONDS.toHours(list.get(i).getClockIn()) % 24 - 4;
                int min = (int) TimeUnit.MILLISECONDS.toMinutes(list.get(i).getClockIn()) % 60;
                int sec = (int) TimeUnit.MILLISECONDS.toSeconds(list.get(i).getClockIn()) % 60;
                String clockIn = String.format("%02d:%02d:%02d", hrs, min, sec);
                System.out.println("==========================");
                System.out.println("Clock in time : " + clockIn);

                if (list.get(i).getClockOut() != 0) {
                    int hrs1 = (int) TimeUnit.MILLISECONDS.toHours(list.get(i).getClockOut()) % 24 - 4;
                    int min1 = (int) TimeUnit.MILLISECONDS.toMinutes(list.get(i).getClockOut()) % 60;
                    int sec1 = (int) TimeUnit.MILLISECONDS.toSeconds(list.get(i).getClockOut()) % 60;
                    String clockOut = String.format("%02d:%02d:%02d", hrs1, min1, sec1);
                    System.out.println("Clock out time :" + clockOut);
                    System.out.println("Staff ID :" + list.get(i).getStaffID());
                    System.out.println("==========================");
                } else {
                    System.out.println("No clock out time is set");
                }
                counter++;
                break;                
            }
        }
        if (counter == 0) {
            System.out.println("Record not found");
            counter = 0;
            getRecord();

        }
    }
}
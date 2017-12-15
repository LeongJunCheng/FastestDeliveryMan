/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LER
 */
public class ModuleE {

    private List<ScheduledOrder> orderList = new ArrayList<>();
    

    public String inputOrderNo(){
        String orderNo ="";
        do{        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your order no: ");
        orderNo = scanner.next();  
        }while(!orderNo.equals("S001")&&!orderNo.equals("S002")&&!orderNo.equals("S003"));
        return orderNo; 
            
    }
    
    public String inputPhoneNo(){
        String phoneNo = "";
        boolean valid = true;
        do{
            String phoneFormat = "\\d{3}-\\d{7}";                   
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your phone no (xxx-xxxxxxx): ");
            phoneNo = scanner.next();
            if(phoneNo.matches(phoneFormat)){
                valid = true;
            }else
                valid = false;
        }while(valid != true);
        return phoneNo;
    }
    
    
    public String inputDeliveryDate(){
        boolean valid = true;
        String date = "";
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter delivery date (dd-mm-yyyy): ");
            date = scanner.next();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date currentDate = new Date();
            String currentDateFormat = dateFormat.format(currentDate);
            
            try{
                Date date1 = dateFormat.parse(date);
                Date date2 = dateFormat.parse(currentDateFormat);                
                if(date1.after(date2))
                    valid = true;
                else
                    valid = false;
                    
            }catch(ParseException e){
                valid = false;
            }  
            
        }while(valid != true);
        return date;
    }
    
    public String inputDeliveryTime(){
        boolean valid = true;
        String time = "";
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter delivery time (HH:mm): ");
            time = scanner.next();
            DateFormat timeFormat = new SimpleDateFormat("HH:mm");
            
            try{
                Date deliveryTime = timeFormat.parse(time);
                Date startTime = timeFormat.parse("10:00");
                Date endTime = timeFormat.parse("20:00");
                if(deliveryTime.before(endTime) && deliveryTime.after(startTime))
                    valid = true;
                else
                    valid = false;
                
            }catch(ParseException e){
                valid = false;
            }           
        }while(valid != true);
        return time;
    }

    
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        ModuleE modulee = new ModuleE();
        String option = "";
        do{
        String orderNo = modulee.inputOrderNo().toString();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String custName = scanner.nextLine(); 
        System.out.print("Please enter your address: ");
        String custAddress = scanner.nextLine(); 
        String custPhone = modulee.inputPhoneNo().toString();
        String deliveryDate = modulee.inputDeliveryDate().toString();
        String deliveryTime = modulee.inputDeliveryTime().toString();
        ScheduledOrder so = new ScheduledOrder(orderNo, custName, custAddress, custPhone, cal.getTime().toString(),deliveryDate, deliveryTime,"Pending");
        modulee.orderList.add(so);
        System.out.print("\nDo you wish to continue ? (Y/N): " );
        option = scanner.nextLine();       
        }while(option.equals("Y")||option.equals("y"));
        
        System.out.println(String.format("%-15s %-20s %-20s %-12s %-28s %-12s %-12s %-10s\n","Order No","Name","Address","Phone No","Order Date","Delivery Date","DeliveryTime","Status"));
        for(int i = 0; i<modulee.orderList.size();i++){
            System.out.println(modulee.orderList.get(i).toString());
        }
                  
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

/**
 *
 * @author leong
 */
public class DeliveryDomain {
    public String deliveryID;
    public String staffID;
    public String date;
    public String orderID;
    public String status;
    
    public DeliveryDomain(){}
    
    public DeliveryDomain(String deliveryID, String staffID, String date, String orderID, String status){
        this.deliveryID = deliveryID;
        this.staffID = staffID;
        this.date = date;
        this.orderID = orderID;
        this.status = status;
    }
    
    public void setStaffID(String staffID){
        this.staffID = staffID;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getDeliveryID(){
        return deliveryID;
    }
    
    public String getDate(){
        return date;
    }
    
    public void clear(){
        this.deliveryID = "";
        this.staffID = "";
        this.date = "";
        this.orderID = "";
        this.status = "";
    }
    
    public int getYear(){
        //ddmmyyyy
        String year = date.substring(4, 8);

        int yearInt = Integer.parseInt(year);

        return yearInt;
    }
    
    public int getMonth(){
        //ddmmyyyy
        String month = date.substring(2, 4);
        int monthInt = Integer.parseInt(month);

        return monthInt;
    }
    
    public int getDay(){
        //ddmmyyyy
        String day = date.substring(0, 2);
        int dayInt = Integer.parseInt(day);

        return dayInt;
    }
    
    public String toString2(){
        return String.format("%-15s %-15s %-15s %-15s", deliveryID, staffID, date, orderID);
    }
    
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s %-15s", deliveryID, staffID, date, orderID, status);
    }
}

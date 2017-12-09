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
    protected String deliveryID;
    protected String staffID;
    protected String date;
    protected String orderID;
    protected String status;
    
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
    
    public String getMonth(){
        //ddmmyyyy
        String year = date.substring(4, 4);
        String month = date.substring(2, 2);
        String day = date.substring(0, 2);

        return month;
    }
    
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s %-15s", deliveryID, staffID, date, orderID, status);
    }
}

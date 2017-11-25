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
    protected String date;
    protected String orderID;
    protected String status;
    
    public DeliveryDomain(){}
    
    public DeliveryDomain(String deliveryID, String date, String orderID, String status){
        this.deliveryID = deliveryID;
        this.date = date;
        this.orderID = orderID;
        this.status = status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s", deliveryID, date, orderID, status);
    }
}

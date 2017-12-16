/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulee;
import java.io.Serializable;
import java.util.*;

public class ScheduledOrder implements Serializable {
    private String orderNo;
    private String custName;
    private String custAddress;
    private String custPhone;
    private String orderDate;
    private String scheduledDate; 
    private String scheduledTime;
    private String status;
    
    public ScheduledOrder(){}
    
    public ScheduledOrder(String orderNo, String custName, String custAddress, String custPhone, String orderDate, String scheduledDate, String scheduledTime, String status){
        this.orderNo = orderNo;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
        this.orderDate = orderDate;
        this.scheduledDate = scheduledDate;
        this.scheduledTime = scheduledTime;             
        this.status = status;
    }
    
    public String getOrderNo(){return orderNo;}
    public String getCustName(){return custName;}
    public String getCustAddress(){return custAddress; }
    public String getCustPhone(){return custPhone;}
    public String getOrderDate(){return orderDate;}
    public String getScheduledDate(){return scheduledDate;}
    public String getScheduledTime(){return scheduledTime;}
    public String getStatus(){return status;}
    
    public void setOrderNo(String orderNo){this.orderNo = orderNo;}
    public void setCustName(String custName){this.custName = custName;};
    public void setCustAddress(String custAddress){this.custAddress = custAddress;}
    public void setCustPhone(String custPhone){this.custPhone = custPhone;}
    public void setOrderDate(String orderDate){this.orderDate = orderDate;}
    public void setScheduledDate(String scheduledDate){this.scheduledDate = scheduledDate;}  
    public void setScheduledTime(String scheduledTime){this.scheduledTime = scheduledTime;}
    public void setStatus(String status){this.status = status;}
    
    public String toString(){
        return String.format("%-15s %-20s %-20s %-12s %-20s %-13s %-13s %-10s\n",orderNo, custName, custAddress, custPhone, orderDate, scheduledDate, scheduledTime, status);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

/**
 *
 * @author Nickson
 */
public class CustomerOrderDomain {
    protected String foodDetails ; 
    protected String [] parts ;
    protected double price;
    protected String foodName;

    public void CustomerOrderDomain(String foodDetails) {
       this.parts = foodDetails.split(" - ");
       this.foodName= parts[0];
        this.price=Double.parseDouble(parts[1]);
        
    }

    public void CustomerOrderDomain() {
    }
    
    
    public String getFoodName(){
        return foodName;
    }
    
    public double getPrice(){
        
        return price;
    }
    
}

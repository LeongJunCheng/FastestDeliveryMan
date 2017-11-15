/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partaq1zf;

/**
 *
 * @author bryan
 */
public class MenuDomain {
    protected String fname;
    protected int fID;
    protected String description;
    protected double price;
    
    public MenuDomain(){
        
    }
    
    public MenuDomain(int fID ,String fname , String description, double price){
        this.fID = fID;
        this.fname = fname;
        this.description = description;
        this.price = price;
    }
    
    public String getFname(){
        return fname;
    }
    
    public int getFID(){
        return fID;
    }
    
     
    public String getDescription(){
        return description;
    }
      
    public double getPrice(){
        return price;
    }
    

    
}

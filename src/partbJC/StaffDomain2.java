/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partbjc;

/**
 *
 * @author leong
 */
public class StaffDomain2 {
    protected String name;
    protected int age;
    protected char gender;
    protected String status;
    
    public StaffDomain2(){}
    
    public StaffDomain2(String name, int age, char gender, String status){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
}

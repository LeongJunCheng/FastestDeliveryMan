/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPartCombine;

/**
 *
 * @author Jeffrey
 */
public class ClockDomain {
    private String staffID;
    private long clockIn, clockOut;
    
    public ClockDomain(){
        
    }

    public ClockDomain(String staffID, long clockIn) {
        this.staffID = staffID;
        this.clockIn = clockIn;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public long getClockIn() {
        return clockIn;
    }

    public void setClockIn(long clockIn) {
        this.clockIn = clockIn;
    }

    public long getClockOut() {
        return clockOut;
    }

    public void setClockOut(long clockOut) {
        this.clockOut = clockOut;
    }
    
    
}

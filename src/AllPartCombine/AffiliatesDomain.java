package AllPartCombine;


public class AffiliatesDomain {
    public int aID;
    public String oName;
    public String oEmail;
    public String oPass;
    public String rName;
    public int rContactNum;
    public String rAddress;
    public String rCity;
    public int rZipCode;
    
    public AffiliatesDomain(){
        
    }
    
    public  AffiliatesDomain(int aID, String oName, String oEmail, String oPass, String rName, int rContactNum, String rAddress, String rCity, int rZipCode){
        this.aID = aID;
        this.oName = oName;
        this.oEmail = oEmail;
        this.oPass = oPass;
        this.rName = rName;
        this.rContactNum = rContactNum;
        this.rAddress = rAddress;
        this.rCity = rCity;
        this.rZipCode = rZipCode;
        
    }

    public int getaID() {
        return aID;
    }

    public String getoName() {
        return oName;
    }

    public String getoEmail() {
        return oEmail;
    }

    public String getoPass() {
        return oPass;
    }

    public String getrName() {
        return rName;
    }

    public int getrContactNum() {
        return rContactNum;
    }

    public String getrAddress() {
        return rAddress;
    }

    public String getrCity() {
        return rCity;
    }

    public int getrZipCode() {
        return rZipCode;
    }
    
    
    
}

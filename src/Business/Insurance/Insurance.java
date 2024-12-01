/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Insurance;

/**
 *
 * @author user
 */
public class Insurance {
    private String ptName;
    private String insName;
    private String insType;
    private String insHospital;
    private String insCharge;

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsType() {
        return insType;
    }

    public void setInsType(String insType) {
        this.insType = insType;
    }

    public String getInsHospital() {
        return insHospital;
    }

    public void setInsHospital(String insHospital) {
        this.insHospital = insHospital;
    }

    public String getInsCharge() {
        return insCharge;
    }

    public void setInsCharge(String insCharge) {
        this.insCharge = insCharge;
    }
    
    public void setInsurance(String ptName, String insName, String insType, String insHospital, String insCharge){
        this.ptName = ptName;
        this.insName = insName;
        this.insType = insType;
        this.insHospital = insHospital;
        this.insCharge = insCharge;
    }  
    
    @Override
    public String toString(){
        return ptName;
    }
}

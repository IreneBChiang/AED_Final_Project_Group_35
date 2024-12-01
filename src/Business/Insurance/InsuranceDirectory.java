/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Insurance;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class InsuranceDirectory {
    private ArrayList<Insurance> InsuranceList;
    
    public InsuranceDirectory() {
        this.InsuranceList = new ArrayList<>();
    }

    public ArrayList<Insurance> getInsuranceList() {
        return InsuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> InsuranceList) {
        this.InsuranceList = InsuranceList;
    }
    
    
    
    public void addInsurance(String ptName, String insName, String insType, String insHospital, String insCharge) {
        Insurance ins = new Insurance();
        ins.setInsurance(ptName, insName, insType, insHospital, insCharge);
        InsuranceList.add(ins);
    }

    
    public void removeInsurance(Insurance ins){
        InsuranceList.remove(ins);
    }
    
//    public Patient searchPatient(String patientName) {
//        for (Patient pt : patientList) {
//            if (pt.getPatientName().equals(patientName)) {
//                return pt;
//            }
//        }
//        return null;
//    }
    
    public ArrayList<Insurance> searchInsuranceList(String key)
    {
        ArrayList<Insurance> searchInsuranceDirectory = new ArrayList();
        for(Insurance insurance: InsuranceList)
        {
            if(insurance.getPtName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchInsuranceDirectory.add(insurance);
            }
        }
        return searchInsuranceDirectory;
    }
    
}

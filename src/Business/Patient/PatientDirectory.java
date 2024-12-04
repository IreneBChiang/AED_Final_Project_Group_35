/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Insurance.Insurance;
import java.util.ArrayList;

/**
 *
 * @author dongyueli
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    private static int count = 1000;
    private Insurance insurance;
    
    public PatientDirectory() {
        this.patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient createPatient(String name) {
        for (Patient p : patientList) {
        if (p.getPatientName().equals(name)) {
            return p; // 返回现有患者
        }
    }
        Patient pt = new Patient();
        pt.setPatientName(name);
        pt.setPatientID(generateUniqueID());
        pt.setInsurance(insurance);
        patientList.add(pt);
        return pt;
    }
    
    public int generateUniqueID() {
        return count++;
    }

    
    public void removePatient(Patient pt){
        patientList.remove(pt);
    }
    
//    public Patient searchPatient(String patientName) {
//        for (Patient pt : patientList) {
//            if (pt.getPatientName().equals(patientName)) {
//                return pt;
//            }
//        }
//        return null;
//    }
    
    public ArrayList<Patient> searchPatient(String key)
    {
        ArrayList<Patient> searchPatientDirectory = new ArrayList();
        for(Patient patient: patientList)
        {
            if(patient.getPatientName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(patient);
            }
        }
        return searchPatientDirectory;
    }
}
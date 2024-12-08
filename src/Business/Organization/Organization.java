/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Insurance.Insurance;
import Business.Insurance.InsuranceDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Irene, Yushan
 */
public abstract class Organization {
    
    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory; 
    private int organizationID;
    private static int counter;
    private InsuranceDirectory insuranceDirectory; 

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceDirectory.getInsuranceList();
    }

    public void setInsuranceList() {
        if(insuranceDirectory == null){
            insuranceDirectory = new InsuranceDirectory();
        }        
        Random random = new Random();
        List<String> insuranceNames = Arrays.asList(
            "Blue Shield", "United Health", "Aetna", "Cigna", "Kaiser Permanente",
            "Humana", "WellCare", "Molina Healthcare", "Anthem", "Centene"
        );
        List<String> insuranceTypes = Arrays.asList(
            "Health Maintenance Organization (HMO)",
            "Preferred Provider Organization (PPO)",
            "Exclusive Provider Organization (EPO)",
            "Point of Service Plan (POS)",
            "High Deductible Health Plan (HDHP)"
        );
        List<String> hospitalNames = Arrays.asList(
            "Massachusetts General Hospital", "Mayo Clinic", "Cleveland Clinic",
            "Johns Hopkins Hospital", "UCLA Medical Center", "Cedars-Sinai",
            "NYU Langone Health", "Houston Methodist", "Northwestern Memorial Hospital",
            "Stanford Health Care"
        );
        for (int i = 1; i <= 14; i++) {
            String personName = "pt" + i; // patient name

            // 為每個人隨機生成 2 到 4 條保險數據
            int numberOfPolicies = 2 + random.nextInt(3); // 每人 2 到 4 條

            for (int j = 1; j <= numberOfPolicies; j++) {
                String insuranceName = insuranceNames.get(random.nextInt(insuranceNames.size())); // 隨機保險名稱
                String insuranceType = insuranceTypes.get(random.nextInt(insuranceTypes.size())); // 隨機保險類型
                String hospitalName = hospitalNames.get(random.nextInt(hospitalNames.size())); // 隨機醫院名稱
                String coverage = String.valueOf(10000 + random.nextInt(5000)); // 隨機覆蓋金額（10000 到 15000）

                // 添加數據到保險目錄
                insuranceDirectory.addInsurance(personName, insuranceName, insuranceType, hospitalName, coverage);
            }
        }
        insuranceDirectory.addInsurance("Amy", "A", "B", "Boston", "10000");
        insuranceDirectory.addInsurance("pt1", "C", "D", "Boston", "10000");
    }
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), CitizenManager("CitizenManager Organization")
        ,Patient("Patient Organization"),Insurance("Insurance Organization"),RegionalGovernment("RegionalGovernment Organization")
        ,Pharmacy("Pharmacy Organization"),HII("HealthCareInsurance Organization"), InsuranceAgent("Insurance Agent Organization")
        , Hospital("Hospital");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        organizationID = counter;
        ++counter;
        insuranceDirectory = new InsuranceDirectory(); 
        setInsuranceList();
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

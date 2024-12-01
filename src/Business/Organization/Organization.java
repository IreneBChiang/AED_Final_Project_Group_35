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

/**
 *
 * @author dongyueli
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
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
        insuranceDirectory.addInsurance("Amy", "A", "B", "Boston", "10000");
    }
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), CitizenManager("CitizenManager Organization")
        ,Patient("Patient Organization"),Insurance("Insurance Organization"),RegionalGovernment("RegionalGovernment Organization")
        ,Pharmacy("Pharmacy Organization"),HII("HealthCareInsurance Organization"), InsuranceAgent("Insurance Agent Organization");
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
        workQueue = new WorkQueue();
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
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}

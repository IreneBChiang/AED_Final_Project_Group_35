/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.AdminRole;
import Business.Role.CitizenManagerRole;
import Business.Role.DoctorRole;
import Business.Role.HealthIntegrationAdmin;
import Business.Role.InsuranceAgent;
import Business.Role.InsuranceCompanyAdmin;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dongyueli
 */
public class ConfigureASystem {
    
    public static EcoSystem configureABusiness() {
         
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
           
        //set system admin
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("ad");
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        Network n1 = ecoSystem.createAndAddNetwork();
        n1.setName("MA-Massachusetts");
        Enterprise e1 = n1.getEnterpriseDirectory().createAndAddEnterprise("Massachusetts Hospital", Enterprise.EnterpriseType.Hospital);
        Employee employee1 = e1.getEmployeeDirectory().createEmployee("Emily");
        UserAccount ua1 = e1.getUserAccountDirectory().createUserAccount();
        ua1.setUsername("admin1");
        ua1.setPassword("admin1");
        ua1.setName("Emily");
        ua1.setRole(new AdminRole());
        
        Organization  org1 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        org1.setName("Doctor Department");
        Employee employee11 = org1.getEmployeeDirectory().createEmployee("Doc1");
        UserAccount ua2 = org1.getUserAccountDirectory().createUserAccount();
        ua2.setPassword("doc1");
        ua2.setUsername("doc1");
        ua2.setName("doc1");
        ua2.setEmployee(employee11);
        ua2.setRole(new DoctorRole());
        
        Organization  org2 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        org2.setName("Patient Department");
        Patient patient1 = org2.getPatientDirectory().createPatient("Pt1");
        UserAccount ua3 = org2.getUserAccountDirectory().createUserAccount();
        ua3.setPassword("pt1");
        ua3.setUsername("pt1");
        ua3.setName("pt1");
        ua3.setPatient(patient1);
        ua3.setRole(new PatientRole());
        
        Patient patient2 = org2.getPatientDirectory().createPatient("Pt2");
        UserAccount ua7 = org2.getUserAccountDirectory().createUserAccount();
        ua7.setPassword("pt2");
        ua7.setUsername("pt2");
        ua7.setName("pt2");
        ua7.setPatient(patient2);
        ua7.setRole(new PatientRole());
        
        Organization  org3 = e1.getOrganizationDirectory().createOrganization(Organization.Type.HII);
        org3.setName("HII");
        Employee employee12 = org3.getEmployeeDirectory().createEmployee("HII1");
        UserAccount ua4 = org3.getUserAccountDirectory().createUserAccount();
        ua4.setPassword("hii1");
        ua4.setUsername("hii1");
        ua4.setName("hii1");
        ua4.setEmployee(employee12);
        ua4.setRole(new HealthIntegrationAdmin());
        
        Organization  org4 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Insurance);
        org4.setName("Insurance");
        Employee employee13 = org4.getEmployeeDirectory().createEmployee("Ins1");
        UserAccount ua5 = org4.getUserAccountDirectory().createUserAccount();
        ua5.setPassword("Ins1");
        ua5.setUsername("Ins1");
        ua5.setName("Ins1");
        ua5.setEmployee(employee13);
        ua5.setRole(new InsuranceCompanyAdmin());
        
        Organization  org5 = e1.getOrganizationDirectory().createOrganization(Organization.Type.InsuranceAgent);
        org5.setName("InsuranceAgent");
        Employee employee14 = org5.getEmployeeDirectory().createEmployee("InsA1");
        UserAccount ua6 = org5.getUserAccountDirectory().createUserAccount();
        ua6.setPassword("InsA1");
        ua6.setUsername("InsA1");
        ua6.setName("InsA1");
        ua6.setEmployee(employee14);
        ua6.setRole(new InsuranceAgent());
        
        Enterprise e4 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass Government", Enterprise.EnterpriseType.Government);
        Employee employee4 = e4.getEmployeeDirectory().createEmployee("Emily11");
        UserAccount ua9 = e4.getUserAccountDirectory().createUserAccount();
        ua9.setUsername("admin4");
        ua9.setPassword("admin4");
        ua9.setName("Emily11");
        ua9.setRole(new AdminRole());
        
        
        
        return ecoSystem;
    }       
}

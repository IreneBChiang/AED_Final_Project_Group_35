/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.RecordHistory;
import Business.Role.AdminRole;
import Business.Role.CitizenManagerRole;
import Business.Role.DoctorRole;
import Business.Role.HealthIntegrationAdmin;
import Business.Role.HospitalAdminRole;
import Business.Role.HospitalManager;
import Business.Role.InsuranceAgent;
import Business.Role.InsuranceCompanyAdmin;
import Business.Role.PatientRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Patient.Record;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author dongyueli
 */
public class ConfigureASystem {
    
    public static EcoSystem configureABusiness() {
        //get the ecoSystem
        EcoSystem ecoSystem = EcoSystem.getInstance();
           
        //set system admin - Healthcare System Manager Role
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("ad");
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        //Create a network
        Network n1 = ecoSystem.createAndAddNetwork();
        n1.setName("MA-Massachusetts");
        //create five enterprises
        //create a default Hospital admin
        Enterprise e1 = n1.getEnterpriseDirectory().createAndAddEnterprise("Massachusetts Hospital", Enterprise.EnterpriseType.Hospital);
        Employee employee1 = e1.getEmployeeDirectory().createEmployee("Emily");
        UserAccount ua1 = e1.getUserAccountDirectory().createUserAccount();
        ua1.setUsername("adminHos");
        ua1.setPassword("adminHos");
        ua1.setName("Emily");
        ua1.setEmployee(employee1);
        ua1.setRole(new AdminRole());
                
        //create a default Insurance admin
        Enterprise e2 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass Insurance company", Enterprise.EnterpriseType.Insurance);
        Employee employee2 = e2.getEmployeeDirectory().createEmployee("Mark");
        UserAccount ua2 = e2.getUserAccountDirectory().createUserAccount();
        ua2.setUsername("adminIns");
        ua2.setPassword("adminIns");
        ua2.setName("Mark");
        ua2.setEmployee(employee2);
        ua2.setRole(new AdminRole());

        //create a default Government admin
        Enterprise e3 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass Government", Enterprise.EnterpriseType.Government);
        Employee employee3 = e3.getEmployeeDirectory().createEmployee("Johnny");
        UserAccount ua3 = e3.getUserAccountDirectory().createUserAccount();
        ua3.setUsername("adminGov");
        ua3.setPassword("adminGov");
        ua3.setName("Johnny");
        ua3.setEmployee(employee3);
        ua3.setRole(new AdminRole());
        
        //create a default HealthIntegration(HII) admin
        Enterprise e4 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass HealthInsurance", Enterprise.EnterpriseType.HII);
        Employee employee4 = e4.getEmployeeDirectory().createEmployee("Lisa");
        UserAccount ua4 = e4.getUserAccountDirectory().createUserAccount();
        ua4.setUsername("adminHII");
        ua4.setPassword("adminHII");
        ua4.setName("Lisa");
        ua4.setEmployee(employee4);
        ua4.setRole(new AdminRole());
        
        //create a default pharmacy admin
        Enterprise e5 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass pharmacy", Enterprise.EnterpriseType.Pharmacy);
        Employee employee5 = e5.getEmployeeDirectory().createEmployee("Rose");
        UserAccount ua5 = e5.getUserAccountDirectory().createUserAccount();
        ua5.setUsername("adminPha");
        ua5.setPassword("adminPha");
        ua5.setName("Rose");
        ua5.setEmployee(employee5);
        ua5.setRole(new AdminRole());
        
        // initialize eight organizations
        // under Hospital enterprise
        // Doctor organization - Doctor role
        Organization  org1 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        org1.setName("Doctor Department");
        if (org1 instanceof DoctorOrganization) {
            DoctorOrganization doctorOrg = (DoctorOrganization) org1;
            Employee employee11 = doctorOrg.getEmployeeDirectory().createEmployee("Annie Lanson");
            UserAccount ub1 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1.setPassword("doc1");
            ub1.setUsername("doc1");
            ub1.setName("Annie Lanson");
            ub1.setEmployee(employee11);
            ub1.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1);

            Employee employee22 = doctorOrg.getEmployeeDirectory().createEmployee("John Smith");
            UserAccount ub22 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub22.setPassword("doc2");
            ub22.setUsername("doc2");
            ub22.setName("John Smith");
            ub22.setEmployee(employee22);
            ub22.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub22);

            Employee employee33 = doctorOrg.getEmployeeDirectory().createEmployee("Emily Johnson");
            UserAccount ub33 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub33.setPassword("doc3");
            ub33.setUsername("doc3");
            ub33.setName("Emily Johnson");
            ub33.setEmployee(employee33);
            ub33.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub33);

            Employee employee44 = doctorOrg.getEmployeeDirectory().createEmployee("Michael Williams");
            UserAccount ub44 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub44.setPassword("doc4");
            ub44.setUsername("doc4");
            ub44.setName("Michael Williams");
            ub44.setEmployee(employee44);
            ub44.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub44);

            Employee employee55 = doctorOrg.getEmployeeDirectory().createEmployee("Sarah Brown");
            UserAccount ub55 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub55.setPassword("doc5");
            ub55.setUsername("doc5");
            ub55.setName("Sarah Brown");
            ub55.setEmployee(employee55);
            ub55.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub55);

            Employee employee66 = doctorOrg.getEmployeeDirectory().createEmployee("David Jones");
            UserAccount ub66 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub66.setPassword("doc6");
            ub66.setUsername("doc6");
            ub66.setName("David Jones");
            ub66.setEmployee(employee66);
            ub66.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub66);

            Employee employee77 = doctorOrg.getEmployeeDirectory().createEmployee("Olivia Miller");
            UserAccount ub77 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub77.setPassword("doc7");
            ub77.setUsername("doc7");
            ub77.setName("Olivia Miller");
            ub77.setEmployee(employee77);
            ub77.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub77);

            Employee employee88 = doctorOrg.getEmployeeDirectory().createEmployee("Daniel Davis");
            UserAccount ub88 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub88.setPassword("doc8");
            ub88.setUsername("doc8");
            ub88.setName("Daniel Davis");
            ub88.setEmployee(employee88);
            ub88.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub88);

            Employee employee99 = doctorOrg.getEmployeeDirectory().createEmployee("Sophia Garcia");
            UserAccount ub99 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub99.setPassword("doc9");
            ub99.setUsername("doc9");
            ub99.setName("Sophia Garcia");
            ub99.setEmployee(employee99);
            ub99.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub99);

            Employee employee1010 = doctorOrg.getEmployeeDirectory().createEmployee("James Martinez");
            UserAccount ub1010 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1010.setPassword("doc10");
            ub1010.setUsername("doc10");
            ub1010.setName("James Martinez");
            ub1010.setEmployee(employee1010);
            ub1010.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1010);

            Employee employee1111 = doctorOrg.getEmployeeDirectory().createEmployee("Isabella Hernandez");
            UserAccount ub1111 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1111.setPassword("doc11");
            ub1111.setUsername("doc11");
            ub1111.setName("Isabella Hernandez");
            ub1111.setEmployee(employee1111);
            ub1111.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1111);

            Employee employee1212 = doctorOrg.getEmployeeDirectory().createEmployee("Matthew Lopez");
            UserAccount ub1212 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1212.setPassword("doc12");
            ub1212.setUsername("doc12");
            ub1212.setName("Matthew Lopez");
            ub1212.setEmployee(employee1212);
            ub1212.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1212);

            Employee employee1313 = doctorOrg.getEmployeeDirectory().createEmployee("Amelia Gonzalez");
            UserAccount ub1313 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1313.setPassword("doc13");
            ub1313.setUsername("doc13");
            ub1313.setName("Amelia Gonzalez");
            ub1313.setEmployee(employee1313);
            ub1313.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1313);

            Employee employee1414 = doctorOrg.getEmployeeDirectory().createEmployee("Benjamin Wilson");
            UserAccount ub1414 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1414.setPassword("doc14");
            ub1414.setUsername("doc14");
            ub1414.setName("Benjamin Wilson");
            ub1414.setEmployee(employee1414);
            ub1414.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1414);

            Employee employee1515 = doctorOrg.getEmployeeDirectory().createEmployee("Mia Moore");
            UserAccount ub1515 = doctorOrg.getUserAccountDirectory().createUserAccount();
            ub1515.setPassword("doc15");
            ub1515.setUsername("doc15");
            ub1515.setName("Mia Moore");
            ub1515.setEmployee(employee1515);
            ub1515.setRole(new DoctorRole());
            doctorOrg.addDoctor(ub1515);

        }       
        
        // under Hospital enterprise
        // Patient organization - Patient role
        Organization  org2 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        org2.setName("Patient Department");
        RecordHistory recordHistory = ecoSystem.getRecordHistory();
        // patient 1
        Patient patient1 = org2.getPatientDirectory().createPtient("Pt1");
        UserAccount ub2 = org2.getUserAccountDirectory().createUserAccount();
        ub2.setPassword("pt1");
        ub2.setUsername("pt1");
        ub2.setName("pt1");
        ub2.setPatient(patient1);
        ub2.setRole(new PatientRole());
        
        Record record1 = new Record();
        record1.setRespiratoryRate(16.5f);
        record1.setHeartRate(72.0f);
        record1.setSystolicBloodPressure(120.0f);
        record1.setWeightInPounds(150.0f);
        record1.setStandTime(60);
        record1.setMoveTime(60);
        record1.setExcerciseTime(60);
        record1.setTotalTime();
        
        //Record record1 = new Record();
        record1.setPatientName("pt1");
        record1.setDiseaseName("Allergies");
        record1.setMedicineName("Cetirizine");
        record1.setDemandQuantity("3 cc.");
        record1.setHospitalName("National Hospital");
        patient1.addRecord(record1);
        patient1.setRecord(record1);
        recordHistory.addRecord(record1);

        Record record2 = new Record();
        record2.setPatientName("pt1");
        record2.setDiseaseName("Asthma");
        record2.setMedicineName("Ventolin");
        record2.setDemandQuantity("2 puffs");
        record2.setHospitalName("City Hospital");
        patient1.addRecord(record2);
        recordHistory.addRecord(record2);
        
        // patient 2
        Patient patient2 = org2.getPatientDirectory().createPtient("Pt2");
        UserAccount ub21 = org2.getUserAccountDirectory().createUserAccount();
        ub21.setPassword("pt2");
        ub21.setUsername("pt2");
        ub21.setName("pt2");
        ub21.setPatient(patient2);
        ub21.setRole(new PatientRole());
        
        Record record3 = new Record();
        record3.setRespiratoryRate(16.5f);
        record3.setHeartRate(72.0f);
        record3.setSystolicBloodPressure(120.0f);
        record3.setWeightInPounds(150.0f);
        record3.setStandTime(60);
        record3.setMoveTime(60);
        record3.setExcerciseTime(60);
        record3.setTotalTime();

        //Record record3 = new Record();
        record3.setPatientName("pt2");
        record3.setDiseaseName("Diabetes");
        record3.setMedicineName("Insulin");
        record3.setDemandQuantity("10 units");
        record3.setHospitalName("General Hospital");
        patient2.addRecord(record3);
        patient2.setRecord(record3);
        recordHistory.addRecord(record3);
        
        // Patient 3
        Patient patient3 = org2.getPatientDirectory().createPtient("Pt3");
        UserAccount ub3 = org2.getUserAccountDirectory().createUserAccount();
        ub3.setPassword("pt3");
        ub3.setUsername("pt3");
        ub3.setName("pt3");
        ub3.setPatient(patient3);
        ub3.setRole(new PatientRole());

        // Pt3 - Record 1
        Record record4 = new Record();
        record4.setRespiratoryRate(18.0f);
        record4.setHeartRate(80.0f);
        record4.setSystolicBloodPressure(130.0f);
        record4.setWeightInPounds(160.0f);
        record4.setStandTime(50);
        record4.setMoveTime(70);
        record4.setExcerciseTime(40);
        record4.setTotalTime();

        record4.setPatientName("pt3");
        record4.setDiseaseName("Hypertension");
        record4.setMedicineName("Amlodipine");
        record4.setDemandQuantity("5 mg");
        record4.setHospitalName("Regional Hospital");
        patient3.setRecord(record4);
        patient3.addRecord(record4);
        recordHistory.addRecord(record4);

        // Pt3 - Record 2
        Record record5 = new Record();
        record5.setPatientName("pt3");
        record5.setDiseaseName("Flu");
        record5.setMedicineName("Tamiflu");
        record5.setDemandQuantity("75 mg");
        record5.setHospitalName("Community Clinic");
        patient3.addRecord(record5);
        recordHistory.addRecord(record5);

        // Patient 4
        Patient patient4 = org2.getPatientDirectory().createPtient("Pt4");
        UserAccount ub4 = org2.getUserAccountDirectory().createUserAccount();
        ub4.setPassword("pt4");
        ub4.setUsername("pt4");
        ub4.setName("pt4");
        ub4.setPatient(patient4);
        ub4.setRole(new PatientRole());

        // Pt4 - Record 1
        Record record6 = new Record();
        record6.setRespiratoryRate(14.0f);
        record6.setHeartRate(68.0f);
        record6.setSystolicBloodPressure(115.0f);
        record6.setWeightInPounds(145.0f);
        record6.setStandTime(60);
        record6.setMoveTime(90);
        record6.setExcerciseTime(30);
        record6.setTotalTime();

        record6.setPatientName("pt4");
        record6.setDiseaseName("Cholesterol");
        record6.setMedicineName("Atorvastatin");
        record6.setDemandQuantity("20 mg");
        record6.setHospitalName("Metro Hospital");
        patient4.setRecord(record6);
        patient4.addRecord(record6);
        recordHistory.addRecord(record6);

        // Pt4 - Record 2
        Record record7 = new Record();
        record7.setPatientName("pt4");
        record7.setDiseaseName("Cold");
        record7.setMedicineName("Paracetamol");
        record7.setDemandQuantity("500 mg");
        record7.setHospitalName("City Clinic");
        patient4.addRecord(record7);
        recordHistory.addRecord(record7);
        
        Random random = new Random();
        List<String> diseases = Arrays.asList(
            "Hypertension", "Diabetes", "Asthma", "Chronic Obstructive Pulmonary Disease",
            "Heart Disease", "Allergies", "Pneumonia", "Cancer", "Migraine", "Arthritis"
        );
        List<String> medicines = Arrays.asList(
            "Amlodipine", "Metformin", "Albuterol", "Atorvastatin", 
            "Lisinopril", "Cetirizine", "Prednisone", "Tamoxifen", 
            "Ibuprofen", "Naproxen"
        );
        
        for (int i = 5; i <= 15; i++) { // 生成 10 個患者
            String patientName = "pt" + i;
            Patient patient = org2.getPatientDirectory().createPtient(patientName);
            UserAccount userAccount = org2.getUserAccountDirectory().createUserAccount();
            userAccount.setPassword(patientName.toLowerCase());
            userAccount.setUsername(patientName.toLowerCase());
            userAccount.setName(patientName);
            userAccount.setPatient(patient);
            userAccount.setRole(new PatientRole());
            for (int j = 1; j <= 3; j++) {
                Record record = new Record();

                record.setPatientName(patientName);

                // 隨機選擇病名和藥物
                String randomDisease = diseases.get(random.nextInt(diseases.size()));
                String randomMedicine = medicines.get(random.nextInt(medicines.size()));

                record.setDiseaseName(randomDisease);
                record.setMedicineName(randomMedicine);
                record.setDemandQuantity((j * 10) + " mg");
                record.setHospitalName("Hospital " + j);

                // 設置生理數據
                record.setRespiratoryRate(14.0f + random.nextFloat() * 2); // 隨機偏移
                record.setHeartRate(60.0f + random.nextInt(20));          // 隨機心率
                record.setSystolicBloodPressure(110.0f + random.nextInt(20)); // 隨機血壓
                record.setWeightInPounds(140.0f + random.nextInt(30));    // 隨機體重
                record.setStandTime(50 + j * 5);
                record.setMoveTime(60 + j * 10);
                record.setExcerciseTime(30 + j * 5);
                record.setTotalTime();

                // 添加到患者和全局記錄歷史中
                patient.setRecord(record);
                patient.addRecord(record);
                recordHistory.addRecord(record);
            }
        }
        
        ecoSystem.setRecordHistory(recordHistory);
        
        // under Hospital enterprise
        // Hospital organization - Hospital admin role, Hospital manager
        Organization  org8 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Hospital);
        org8.setName("Hospital");
        Employee employee20 = e1.getEmployeeDirectory().createEmployee("Emily");
        UserAccount ua22 = org8.getUserAccountDirectory().createUserAccount();
        ua22.setPassword("admin1");
        ua22.setUsername("admin1");
        ua22.setName("Emily");
        ua22.setEmployee(employee20);
        ua22.setRole(new HospitalAdminRole());
        
        if (org8 instanceof HospitalOrganization) {
            HospitalOrganization hospitalOrganization = (HospitalOrganization) org8;
            Employee hmemployee1 = e1.getEmployeeDirectory().createEmployee("manager1");
            UserAccount manager1 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager1", "manager1", new HospitalManager());
            manager1.setName("Manager One");
            manager1.setDepartment("Cancer");
            manager1.setEmployee(hmemployee1);

            
            Employee hmemployee2 = e1.getEmployeeDirectory().createEmployee("manager2");
            UserAccount manager2 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager2", "manager2", new HospitalManager());
            manager2.setName("Manager Two");
            manager2.setDepartment("Surgery");
            manager2.setEmployee(hmemployee2);
            
            
            Employee hmemployee3 = e1.getEmployeeDirectory().createEmployee("manager3");
            UserAccount manager3 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager3", "manager3", new HospitalManager());
            manager3.setName("Manager Three");
            manager3.setDepartment("Oncology");
            manager3.setEmployee(hmemployee3);
            
            
            Employee hmemployee4 = e1.getEmployeeDirectory().createEmployee("manager4");
            UserAccount manager4 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager4", "manager4", new HospitalManager());
            manager4.setName("Manager Four");
            manager4.setDepartment("Urology");
            manager4.setEmployee(hmemployee4);
            
            
            Employee hmemployee5 = e1.getEmployeeDirectory().createEmployee("manager5");
            UserAccount manager5 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager5", "manager5", new HospitalManager());
            manager5.setName("Manager Five");
            manager5.setDepartment("Psychiatry");
            manager5.setEmployee(hmemployee5);
            
            Employee hmemployee6 = e1.getEmployeeDirectory().createEmployee("manager6");
            UserAccount manager6 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager6", "manager6", new HospitalManager());
            manager6.setName("Manager Six");
            manager6.setDepartment("Cardiology");
            manager6.setEmployee(hmemployee6);

            Employee hmemployee7 = e1.getEmployeeDirectory().createEmployee("manager7");
            UserAccount manager7 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager7", "manager7", new HospitalManager());
            manager7.setName("Manager Seven");
            manager7.setDepartment("Neurology");
            manager7.setEmployee(hmemployee7);

            
            Employee hmemployee8 = e1.getEmployeeDirectory().createEmployee("manager8");
            UserAccount manager8 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager8", "manager8", new HospitalManager());
            manager8.setName("Manager Eight");
            manager8.setDepartment("Orthopedics");
            manager8.setEmployee(hmemployee8);

            
            Employee hmemployee9 = e1.getEmployeeDirectory().createEmployee("manager9");
            UserAccount manager9 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager9", "manager9", new HospitalManager());
            manager9.setName("Manager Nine");
            manager9.setDepartment("Dermatology");
            manager9.setEmployee(hmemployee9);

            
            Employee hmemployee10 = e1.getEmployeeDirectory().createEmployee("manager10");
            UserAccount manager10 = hospitalOrganization.getUserAccountDirectory().createHospitalManagerAccount("manager10", "manager10", new HospitalManager());
            manager10.setName("Manager Ten");
            manager10.setDepartment("Pediatrics");
            manager10.setEmployee(hmemployee10);
        }
        
        // under Insurance enterprise
        // Insurance organization - Insurance Company Admin, Insurance agent
        Organization  org4 = e2.getOrganizationDirectory().createOrganization(Organization.Type.Insurance);
        org4.setName("Insurance");
        Employee employee13 = org4.getEmployeeDirectory().createEmployee("Ins1");
        UserAccount ub45 = org4.getUserAccountDirectory().createUserAccount();
        ub45.setPassword("Ins1");
        ub45.setUsername("Ins1");
        ub45.setName("Ins1");
        ub45.setEmployee(employee13);
        ub45.setRole(new InsuranceCompanyAdmin());
        
        if (org4 instanceof InsuranceOrganization) {
            InsuranceOrganization insuranceOrganization = (InsuranceOrganization) org4;
            Employee agentEmployee1 = org4.getEmployeeDirectory().createEmployee("agent1");
            UserAccount agent1 = insuranceOrganization.getUserAccountDirectory().createAgentAccount("agent1", "agent1", new InsuranceAgent());
            agent1.setName("Agent One");
            agent1.setEmployee(agentEmployee1);

            Employee agentEmployee2 = org4.getEmployeeDirectory().createEmployee("agent2");
            UserAccount agent2 = insuranceOrganization.getUserAccountDirectory().createAgentAccount("agent2", "agent2", new InsuranceAgent());
            agent2.setName("Agent Two");
            agent2.setEmployee(agentEmployee2);
            
            Employee agentEmployee3 = org4.getEmployeeDirectory().createEmployee("agent3");
            UserAccount agent3 = insuranceOrganization.getUserAccountDirectory().createAgentAccount("agent3", "agent3", new InsuranceAgent());
            agent3.setName("Agent Three");
            agent3.setEmployee(agentEmployee3);
            
            Employee agentEmployee4 = org4.getEmployeeDirectory().createEmployee("agent4");
            UserAccount agent4 = insuranceOrganization.getUserAccountDirectory().createAgentAccount("agent4", "agent4", new InsuranceAgent());
            agent4.setName("Agent Four");
            agent4.setEmployee(agentEmployee4);
            
            Employee agentEmployee5 = org4.getEmployeeDirectory().createEmployee("agent5");
            UserAccount agent5 = insuranceOrganization.getUserAccountDirectory().createAgentAccount("agent5", "agent5", new InsuranceAgent());
            agent5.setName("Agent Five");
            agent5.setEmployee(agentEmployee5);
        }
        
        // under Government enterprise
        // Government organization
        Organization  org3 = e3.getOrganizationDirectory().createOrganization(Organization.Type.RegionalGovernment);
        org3.setName("Regional Government");
        
        // under Citizen Manager enterprise
        // Citizen Manager organization - Citizen manager role
        Organization  org6 = e3.getOrganizationDirectory().createOrganization(Organization.Type.CitizenManager);
        org6.setName("Citizen Manager");
        Employee employee32 = org6.getEmployeeDirectory().createEmployee("cti1");
        UserAccount ub6 = org6.getUserAccountDirectory().createUserAccount();
        ub6.setPassword("cti1");
        ub6.setUsername("cti1");
        ub6.setName("cti1");
        ub6.setEmployee(employee32);
        ub6.setRole(new CitizenManagerRole());

        // under HealthIntegration(HII) enterprise
        // HealthIntegration(HII) organization - Health integration admin
        Organization  org5 = e4.getOrganizationDirectory().createOrganization(Organization.Type.HII);
        org5.setName("HII");
        Employee employee12 = org5.getEmployeeDirectory().createEmployee("HII1");
        UserAccount ub44 = org5.getUserAccountDirectory().createUserAccount();
        ub44.setPassword("hii1");
        ub44.setUsername("hii1");
        ub44.setName("hii1");
        ub44.setEmployee(employee12);
        ub44.setRole(new HealthIntegrationAdmin());
        
        // under Pharmacy enterprise
        // Pharmacy organization - Pharmacy admin role
        Organization  org7 = e5.getOrganizationDirectory().createOrganization(Organization.Type.Pharmacy);
        org7.setName("Pharmacy");
        Employee employee15 = org7.getEmployeeDirectory().createEmployee("ph1");
        UserAccount ub7 = org7.getUserAccountDirectory().createUserAccount();
        ub7.setPassword("ph1");
        ub7.setUsername("ph1");
        ub7.setName("ph1");
        ub7.setEmployee(employee15);
        ub7.setRole(new PharmacyAdminRole());
        
        return ecoSystem;
    }       
}
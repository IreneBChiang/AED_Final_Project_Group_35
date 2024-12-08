/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene, Yushan
 */
public class Patient {
    private String patientName;
    private int patientID;
    private int age;
    private String streetAddress;
    private String town;
    private int zipCode;
    private String emailAddress;
    private int areaCode;
    private int phoneNumber;
    private String myDoctor;
    private UserAccount mydoctor;
    private UserAccount mypatient;
    private Record record;
    private List<Record> recordList;
    
     public Patient()
    {
        super();
        recordList = new ArrayList<>();
    }
    
    public List<Record> getRecordList() {
        return recordList;
    }

    public void addRecord(Record record) {
        this.recordList.add(record);
    }

    public void removeRecord(Record record) {
        this.recordList.remove(record);
    }
    
    public List<Record> searchRecordsByDisease(String diseaseName) {
    List<Record> result = new ArrayList<>();
    for (Record record : recordList) {
        if (record.getDiseaseName().equalsIgnoreCase(diseaseName)) {
            result.add(record);
        }
    }
    return result;
    }

   
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(String myDoctor) {
        this.myDoctor = myDoctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public UserAccount getMydoctor() {
        return mydoctor;
    }

    public void setMydoctor(UserAccount mydoctor) {
        this.mydoctor = mydoctor;
    }

    public UserAccount getMypatient() {
        return mypatient;
    }

    public void setMypatient(UserAccount mypatient) {
        this.mypatient = mypatient;
    }
      
    @Override
    public String toString() {
        return patientName; 
    }
}

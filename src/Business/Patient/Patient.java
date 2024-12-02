/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Insurance.Insurance;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dongyueli
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
    private Insurance insurance;
    
    
    public Patient()
    {
        super();
        //count++;
        //patientID=count;
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
    
    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
   
    @Override
    public String toString() {
        return patientName; 
    }
}

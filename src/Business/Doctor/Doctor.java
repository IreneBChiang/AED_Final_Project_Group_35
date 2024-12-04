/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

/**
 *
 * @author jiaye
 */
public class Doctor {

    private String doctorname;
    private int doctorID;
    private String title;
    private String hospital_served;
    
    
    public String getDoctorname() {
    return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHospital_served() {
        return hospital_served;
    }

    public void setHospital_served(String hospital_served) {
        this.hospital_served = hospital_served;
    }

    @Override
    public String toString() {
        return doctorname; 
    }
}

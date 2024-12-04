/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author jiaye
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;
    private static int count = 2000;  // 假設醫生ID從2000開始

    public DoctorDirectory() {
        this.doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public Doctor createDoctor(String doctorName, String title) {
        for (Doctor d : doctorList) {
            if (d.getDoctorname().equals(doctorName)) {
                return d;  
            }
        }
        Doctor doc = new Doctor();
        doc.setDoctorname(doctorName);
        doc.setTitle(title);
        doc.setDoctorID(generateUniqueID());
        doctorList.add(doc);
        return doc;
    }

    public int generateUniqueID() {
        return count++;
    }

    public void removeDoctor(Doctor doc) {
        doctorList.remove(doc);
    }

    public ArrayList<Doctor> searchDoctor(String key) {
        ArrayList<Doctor> searchDoctorDirectory = new ArrayList<>();
        for (Doctor doctor : doctorList) {
            if (doctor.getDoctorname().toLowerCase().startsWith(key.toLowerCase())) {
                searchDoctorDirectory.add(doctor);
            }
        }
        return searchDoctorDirectory;
    }

}

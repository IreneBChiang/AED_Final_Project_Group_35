/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author Irene, Yushan
 */
public class Record {
    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weightInPounds;   
    
    private int standTime;
    private int moveTime;
    private int excerciseTime;
    private int totalTime;
    
    private String  diseaseName;
    private String medicineName;
    private String demandQuantity;
    private String hospitalName;
    private String doctorName;
    private String PatientName;

    public Record(){
        respiratoryRate = 15;
        heartRate = 75;
        systolicBloodPressure = 113;
        weightInPounds = 132;
        standTime = 60;
        moveTime = 60;
        excerciseTime = 60;
        totalTime = 180;
        diseaseName = "Allergies";
        medicineName = "Cetirizine";
        demandQuantity = "2";
        hospitalName = "Elizabeth's medical center";
        PatientName = "";
    }
    
    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }
    
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDemandQuantity() {
        return demandQuantity;
    }

    public void setDemandQuantity(String demandQuantity) {
        this.demandQuantity = demandQuantity;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    
    public int getStandTime() {
        return standTime;
    }

    public void setStandTime(int standTime) {
        this.standTime = standTime;
    }

    public int getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(int moveTime) {
        this.moveTime = moveTime;
    }

    public int getExcerciseTime() {
        return excerciseTime;
    }

    public void setExcerciseTime(int excerciseTime) {
        this.excerciseTime = excerciseTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime() {
        this.totalTime = standTime + moveTime + excerciseTime;
    }
    
    @Override
    public String toString() {
        return diseaseName;
    }
    
    
}

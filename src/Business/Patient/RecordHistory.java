/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Irene, Yushan
 */
public class RecordHistory {
    private ArrayList<Record> recordList;
    
    public RecordHistory(){
        this.recordList = new ArrayList<>();
    }

    public ArrayList<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(ArrayList<Record> recordList) {
        this.recordList = recordList;
    }

    
    
    public void addRecord(Record record){
        //Record record = new Record();
        recordList.add(record);
    }
    
    public void removeRecord(Record record){
        recordList.remove(record);
    }
    
    public Record searchRecord(String patientName) {
        for(Record a: recordList){
            if(a.getPatientName().contains(patientName)){
                   
                return a;
            }
        }
        return null;
    }
    
    public ArrayList<Record> searchRecordList(String patientName) {
        ArrayList<Record> myRecordList = new ArrayList<>();
        for(Record a: recordList){
            if (a.getPatientName() != null && a.getPatientName().contains(patientName)) {
                myRecordList.add(a);
            }
        }
        return myRecordList;
    }
}

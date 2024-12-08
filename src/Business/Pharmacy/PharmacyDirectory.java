/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy;


import java.util.ArrayList;

/**
 *
 * @author jiaye
 */
public class PharmacyDirectory {
    
    private ArrayList<Pharmacy> pharmacyList;
    
    public PharmacyDirectory() {
        this.pharmacyList = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }   
    
    public void addPharmacy(String pharName, String pharAddr) {
        Pharmacy phar = new Pharmacy(pharName, pharAddr);
        phar.setPharmacy(pharName, pharAddr);
        pharmacyList.add(phar);
    }
    
    public void removePharmacy(Pharmacy ins){
        pharmacyList.remove(ins);
    }
    
    public ArrayList<Pharmacy> searchPharmacyList(String key)
    {
        ArrayList<Pharmacy> searchPharmacyDirectory = new ArrayList();
        for(Pharmacy pharmacy: pharmacyList)
        {
            if(pharmacy.getPharmacy_name().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPharmacyDirectory.add(pharmacy);
            }
        }
        return searchPharmacyDirectory;
    }   

}

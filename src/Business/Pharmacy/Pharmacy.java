/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy;

/**
 *
 * @author jiaye
 */
public class Pharmacy {

    String pharmacy_name;
    String pharmacy_address;
    
    
    public Pharmacy(String name, String addr) {
        this.pharmacy_name = name;
        this.pharmacy_address = addr;
    }
    
    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

    public String getPharmacy_address() {
        return pharmacy_address;
    }

    public void setPharmacy_address(String pharmacy_address) {
        this.pharmacy_address = pharmacy_address;
    }
    
    public void setPharmacy(String pharName, String pharAddr){
        this.pharmacy_name = pharName;
        this.pharmacy_address = pharAddr;
    }  
    
    @Override
    public String toString() {
        return getPharmacy_name();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.PharmacyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jiaye
 */
public class PharmacyOrganization extends Organization{
    private PharmacyDirectory pharmacyDirectory;
    
    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
        pharmacyDirectory = new PharmacyDirectory();
        setPharmacyList();
    }
    
     public void setPharmacyList() {
        if(pharmacyDirectory == null){
            pharmacyDirectory = new PharmacyDirectory();
        }
        pharmacyDirectory.addPharmacy("Pharmacy1", "123 Main St, Boston, MA");
        pharmacyDirectory.addPharmacy("Pharmacy2", "456 Elm St, Cambridge, MA");
        pharmacyDirectory.addPharmacy("Pharmacy3", "789 Oak St, Springfield, MA");
        pharmacyDirectory.addPharmacy("Pharmacy4", "101 Pine St, Worcester, MA");
        pharmacyDirectory.addPharmacy("Pharmacy5", "202 Maple St, Lowell, MA");

    }
    
    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }
    
    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyDirectory.getPharmacyList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacyAdminRole());
        return roles;
    }
    
}

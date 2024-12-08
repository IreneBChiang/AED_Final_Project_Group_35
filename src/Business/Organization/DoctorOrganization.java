/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class DoctorOrganization extends Organization{
    private ArrayList<UserAccount> doctors;
    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
        doctors = new ArrayList<>();
    }
    
    public void addDoctor(UserAccount userAccount){
        doctors.add(userAccount);
    }
    
    public void adddoctor(String username, String password, String name) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        
        if (this.getUserAccountDirectory().getUserAccountList().stream()
                .anyMatch(ua -> ua.getUsername().equals(username))) {
            throw new IllegalArgumentException("Username already exists: " + username);
        }
        
        UserAccount doctorAccount = this.getUserAccountDirectory().createAgentAccount(username, password, new DoctorRole());
        doctorAccount.setName(name);
        doctors.add(doctorAccount);
    }
    
    public void setdoctors(ArrayList<UserAccount> doctors){
        this.doctors = doctors;
    }
       
    public ArrayList<UserAccount> getDoctors(){
        return doctors;
    }
    
    public void removeDoctor(UserAccount doctor) {
        doctors.remove(doctor);
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
}

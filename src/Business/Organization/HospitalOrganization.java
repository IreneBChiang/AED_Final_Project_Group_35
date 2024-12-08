/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HospitalManager;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HospitalOrganization extends Organization{
    private ArrayList<UserAccount> hospitalManager;
    
    public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
        this.hospitalManager = new ArrayList<>();
    }
    
        public void addHospitalManager(String username, String password, String name) {
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
        
        UserAccount managerAccount = this.getUserAccountDirectory().createAgentAccount(username, password, new HospitalManager());
        managerAccount.setName(name);
        hospitalManager.add(managerAccount);
    }
    
    
    
    
    public void addHospitalManager(String username, String password, String name, String department) {
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
        
        UserAccount HospitalManagerAccount = this.getUserAccountDirectory().createHospitalManagerAccount(username, password, new HospitalManager());
        HospitalManagerAccount.setName(name);
        HospitalManagerAccount.setDepartment(department);
        hospitalManager.add(HospitalManagerAccount);
    }
    
    public ArrayList<UserAccount> getHospitalManager() {
        return hospitalManager;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalManager());
        return roles;
    }
}

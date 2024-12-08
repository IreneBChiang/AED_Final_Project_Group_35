/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceAgent;
import Business.Role.InsuranceCompanyAdmin;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Irene, Yushan
 */
public class InsuranceOrganization extends Organization{
    private ArrayList<UserAccount> insuranceAgents;
    
    public InsuranceOrganization() {
        super(Organization.Type.Insurance.getValue());
        this.insuranceAgents = new ArrayList<>();
    }
    
    public void addInsuranceAgent(String username, String password, String name) {
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
        
        UserAccount agentAccount = this.getUserAccountDirectory().createAgentAccount(username, password, new InsuranceAgent());
        agentAccount.setName(name);
        insuranceAgents.add(agentAccount);
    }
    
    public ArrayList<UserAccount> getInsuranceAgents() {
        return insuranceAgents;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceCompanyAdmin());
        return roles;
    }
}

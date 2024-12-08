/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HealthIntegrationAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Irene, Yushan
 */
public class HIIOrganization extends Organization{
    public HIIOrganization() {
        super(Organization.Type.HII.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthIntegrationAdmin());
        return roles;
    }
}

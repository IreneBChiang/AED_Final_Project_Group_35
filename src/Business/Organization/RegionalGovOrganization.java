/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author yushan
 */
public class RegionalGovOrganization extends Organization{
     public RegionalGovOrganization() {
        super(Organization.Type.RegionalGovernment.getValue());
    }
     
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }
}
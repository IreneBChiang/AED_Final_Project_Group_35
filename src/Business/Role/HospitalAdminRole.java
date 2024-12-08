/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdminRole.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jiaye
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, account, (HospitalOrganization)organization, enterprise, business);
    }
    
}

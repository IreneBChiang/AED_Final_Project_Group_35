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
import UserInterface.HospitalManagerRole.HospitalManagerRoleJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Irene
 */
public class HospitalManager extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalManagerRoleJPanel(userProcessContainer, account, (HospitalOrganization)organization, enterprise, business);
    }
}

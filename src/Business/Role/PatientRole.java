/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientHomePageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Irene
 */
public class PatientRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientHomePageJPanel(userProcessContainer, account, (PatientOrganization)organization, enterprise, business);
    }
}

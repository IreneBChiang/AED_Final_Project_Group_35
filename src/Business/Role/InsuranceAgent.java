/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.InsuranceRole.InsuranceAgentWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author Irene
 */
public class InsuranceAgent extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (InsuranceOrganization)organization, enterprise, business);
    }
}

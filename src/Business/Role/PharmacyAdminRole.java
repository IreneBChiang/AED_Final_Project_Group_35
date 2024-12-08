/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyAdminRole.PharmacyAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jiaye
 */
public class PharmacyAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
//        if (organization instanceof PharmacyOrganization) {
//            return new PharmacyAdminWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, enterprise, business);
//        } else {
//            // 處理錯誤，比如顯示錯誤訊息
//            return null;
//        }
        return new PharmacyAdminWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, (PharmacyEnterprise) enterprise, business);
        
    }

 
}
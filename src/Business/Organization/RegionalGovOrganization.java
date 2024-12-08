/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import Business.Network.Network;
/**
 *
 * @author yushan
 */
public class RegionalGovOrganization extends Organization{
    
    public ArrayList<UserAccount> getAllUserAccounts(ArrayList<Network> myNetwork) {
        ArrayList<UserAccount> allUserAccounts = new ArrayList<>();
        
        for(Network network : myNetwork){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    // Exclude Government Organization
                    if (organization.getClass().getSimpleName().equals("RegionalGovOrganization")) {
                        continue; // Skip this organization
                    }
                    
                    // Add all UserAccounts from this organization's UserAccountDirectory
                    if (organization.getUserAccountDirectory() != null) {
                        allUserAccounts.addAll(organization.getUserAccountDirectory().getUserAccountList());
                    }
                }
            }
        }

        return allUserAccounts;
    }
    
     public RegionalGovOrganization() {
        super(Organization.Type.RegionalGovernment.getValue());
    }
     
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }
}

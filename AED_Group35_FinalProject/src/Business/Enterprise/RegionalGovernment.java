/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dongyueli
 */
public class RegionalGovernment extends Enterprise{
    
    public RegionalGovernment(String name) {
        super(name, EnterpriseType.Government);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

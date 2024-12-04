/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author dongyueli
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        switch (type) {
        case Hospital:
            enterprise = new HospitalEnterprise(name);
            break;
        case Pharmacy:
            enterprise = new PharmacyEnterprise(name);
            break;
        case Government:
            enterprise = new RegionalGovernment(name);
            break;
        case Insurance:
            enterprise = new InsuranceEnterprise(name);
            break;
        case HealthInsurance:
            enterprise = new InsuranceEnterprise(name);
            break;
        default:
            throw new IllegalArgumentException("Invalid enterprise type: " + type);
        }

        enterpriseList.add(enterprise);
        return enterprise;
    } 
}

//        if (type == Enterprise.EnterpriseType.Hospital){
//            enterprise = new HospitalEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else if (type == Enterprise.EnterpriseType.Pharmacy) {
//            enterprise = new PharmacyEnterprise(name);
//            enterpriseList.add(enterprise);
//        } 
//        else if (type == Enterprise.EnterpriseType.Government) {
//            enterprise = new RegionalGovernment(name);
//            enterpriseList.add(enterprise);
//        } 
//        else if (type == Enterprise.EnterpriseType.Insurance) {
//            enterprise = new InsuranceEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else if (type == Enterprise.EnterpriseType.HealthInsurance) {
//            enterprise = new InsuranceEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        return enterprise;

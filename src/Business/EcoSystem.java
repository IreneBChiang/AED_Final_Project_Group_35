/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.RecordHistory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Aki
 */
public class EcoSystem  extends Organization{
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private RecordHistory recordHistory;
    
    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
          return ecoSystem;
    }
    private EcoSystem(){
        super(null);
        networkList  = new ArrayList<>();
        recordHistory = new RecordHistory();
    }

    public RecordHistory getRecordHistory() {
        return recordHistory;
    }

    public void setRecordHistory(RecordHistory recordHistory) {
        this.recordHistory = recordHistory;
    }

    public static EcoSystem getBusiness() {     
        return ecoSystem;
    }


    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

  
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {        
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}



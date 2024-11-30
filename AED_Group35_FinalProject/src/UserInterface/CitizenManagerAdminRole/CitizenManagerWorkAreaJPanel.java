/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CitizenManagerAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class CitizenManagerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CitizenManagerOrganization organization;
    private EcoSystem ecoSystem;
    JPanel workArea;
    /**
     * Creates new form DrugSalesWorkAreaJPanel
     */
    public CitizenManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CitizenManagerOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = (CitizenManagerOrganization)organization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) drugRequestJTable.getModel();    
        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if (request != null) {
        
            PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
            Object[] row = new Object[6];
            row[0] = patientDoctorWorkRequest;
            row[1] = patientDoctorWorkRequest.getDrugName();
            row[2] = patientDoctorWorkRequest.getDrugQuantity();
            row[3] = patientDoctorWorkRequest.getSender();
            row[4] = patientDoctorWorkRequest.getReceiveEnterprise();
            row[5] = patientDoctorWorkRequest.getPreStatus();
            
            model.addRow(row);
            }
        }  
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugRequestJTable = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Citizen Manager Work Area");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 350, -1));

        drugRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Person Informatino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(drugRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 500, 340));

        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JTable drugRequestJTable;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.RecordHistory;
import Business.UserAccount.UserAccount;
import Business.Patient.Record;
import UserInterface.PatientRole.ViewMedRecord;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiaye
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form DoctorJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.organization = (Organization)organization;
        this.enterprise = enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnViewPrescription = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));

        btnSearch.setText("SearchPatientByName");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Disease name", "Medicine name", "Demand Quantity", "Hospital name", "Patient name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel12.setText("Doctor Work Area");

        btnViewPrescription.setText("View Prescription");
        btnViewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btnViewPrescription)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewPrescription)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPrescriptionActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRecords.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select the product first.");
            return;
        }
        
        Record record = (Record)tblRecords.getValueAt(selectedRowIndex, 0);
        
        ViewPrescriptionJPanel panel = new ViewPrescriptionJPanel(userProcessContainer,userAccount, organization,enterprise,ecoSystem, record);
        userProcessContainer.add("ViewPrescriptionJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
 
    }//GEN-LAST:event_btnViewPrescriptionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText().trim();
        System.out.println(search);
        
        if (search.isBlank()) {
            JOptionPane.showMessageDialog(null, "Please enter a patient name to search.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ArrayList<Record> myRecordList = ecoSystem.getRecordHistory().searchRecordList(search);

        if (myRecordList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No matching records found.", "Information", JOptionPane.INFORMATION_MESSAGE);
            txtSearch.setText("");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblRecords.getModel();
        model.setRowCount(0);
        
        for(Record r: myRecordList){
            Object row[] = new Object[5];
            row[0] = r;
            row[1] = r.getMedicineName();
            row[2] = r.getDemandQuantity();
            row[3] = r.getHospitalName();
            row[4] = r.getPatientName();
            
            model.addRow(row);
        }
        
        txtSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewPrescription;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        
      DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();    
      model.setRowCount(0);
      for (Record record : ecoSystem.getRecordHistory().getRecordList()){
          Object[] row = new Object[6];
          row[0] = record;
          row[1] = record.getMedicineName();
          row[2] = record.getDemandQuantity();
          row[3] = record.getHospitalName();
          row[4] = record.getPatientName();

          model.addRow(row);
      }
    }
}
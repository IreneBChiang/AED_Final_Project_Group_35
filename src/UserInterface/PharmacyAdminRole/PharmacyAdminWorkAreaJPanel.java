/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.PharmacyOrganization;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pauline
 */
public class PharmacyAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;    
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacyOrganization pharmacyOrganization;
    private PharmacyEnterprise pharmacyEnterprise;
    private EcoSystem ecoSystem;
    /**
     * Creates new form ManagePharmaciesJPanel
     */
    public PharmacyAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, PharmacyOrganization pharmacyOrganization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.pharmacyOrganization = pharmacyOrganization;
        this.pharmacyEnterprise = (PharmacyEnterprise) enterprise; // 
        this.ecoSystem = ecoSystem;

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

        RemoveJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacy = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(221, 221, 252));
        setMaximumSize(new java.awt.Dimension(700, 410));
        setMinimumSize(new java.awt.Dimension(700, 410));

        RemoveJButton.setText("Remove");
        RemoveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveJButtonActionPerformed(evt);
            }
        });

        tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PharmacyName", "Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPharmacy);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setText("Manage Pharmacy");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(RemoveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(RemoveJButton))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmacy.getSelectedRow();
        
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected pharmacy?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Pharmacy selectedPharmacy = (Pharmacy) tblPharmacy.getValueAt(selectedRow, 0);
                pharmacyOrganization.getPharmacyDirectory().removePharmacy(selectedPharmacy);
                populateTable();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Pharmacy from the list.", "Warning", JOptionPane.WARNING_MESSAGE);
        }     
    }//GEN-LAST:event_RemoveJButtonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddPharmacyJPanel aijp = new AddPharmacyJPanel(userProcessContainer,userAccount, pharmacyOrganization, pharmacyEnterprise,ecoSystem);
        userProcessContainer.add("AddInsuranceJPanel", aijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPharmacy;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        ArrayList<Pharmacy> pharmacyList = pharmacyOrganization.getPharmacyList();

            DefaultTableModel model = (DefaultTableModel) tblPharmacy.getModel();
            model.setRowCount(0);

            for(Pharmacy p: pharmacyList){
                Object row[] = new Object[2];
                row[0] = p;
                row[1] = p.getPharmacy_address();
                model.addRow(row);
            }       
        
    }      
}

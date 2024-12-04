/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Employee.Employee;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongyueli
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        if (organization instanceof PatientOrganization) {
            for (Patient patient : organization.getPatientDirectory().getPatientList()) {
                Object[] row = new Object[2];
                row[0] = patient.getPatientID();
                row[1] = patient.getPatientName();
                model.addRow(row);

            }
        }else{
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getEmpId();
            row[1] = employee.getEmpName();
            model.addRow(row);
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
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addEmployeeJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Manage Employee");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 31, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 273, 126, -1));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 228, 126, -1));

        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 232, -1, -1));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
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
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 112, 480, 92));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 73, 139, -1));

        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        jLabel2.setText("Employee Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 278, -1, -1));

        addEmployeeJButton.setText("Add Employee");
        addEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeJButtonActionPerformed(evt);
            }
        });
        add(addEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 326, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 361, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeJButtonActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        if (organization instanceof PatientOrganization) {
            organization.getPatientDirectory().createPatient(name);


        }else{
            organization.getEmployeeDirectory().createEmployee(name);
        }
        
        populateTable(organization);
    }//GEN-LAST:event_addEmployeeJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}

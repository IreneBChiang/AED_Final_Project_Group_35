/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 @author Irene, Yushan
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {
    private JPanel container;
    private Enterprise enterprise;
    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        
        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            organizationJComboBox.addItem(organization);
//        }
    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
        if (!(organization instanceof PatientOrganization)) {  // 如果不是 PatientOrganization，才顯示
            organizationJComboBox.addItem(organization);
        }
    }
    }
    

    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();

        if (organization != null) {
            // check if there's role available in the organization
            if (organization.getSupportedRole().isEmpty()) {
                JOptionPane.showMessageDialog(null, "This organization has no roles available.");
            } else {
                for (Role role : organization.getSupportedRole()) {
                    roleJComboBox.addItem(role);
                }
            }
    }
    }
    
    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        // 清空現有表格數據
        model.setRowCount(0);

        // 獲取選中的組織
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();

        if (organization != null) {
            // 循環遍歷所選組織中的所有用戶帳號
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {

                // 建立每行顯示的數據
                Object row[] = new Object[3];
                row[0] = ua.getEmployee().getEmpName();  // 顯示員工的名稱
                row[1] = ua.getUsername();  // 顯示用戶名
                row[2] = ua.getRole().toString();  // 顯示角色名稱

                // 將行數據加入表格
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        createUserAccountJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(196, 225, 250));
        setForeground(new java.awt.Color(196, 225, 250));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel12.setText("Manage User Account");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 233, -1));

        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 135));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 233, -1));

        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 233, -1));

        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 233, -1));

        createUserAccountJButton.setText("Create Account");
        createUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountJButtonActionPerformed(evt);
            }
        });
        add(createUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            
            populateRoleComboBox(organization);
            popData();
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void createUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        Organization org = (Organization) organizationJComboBox.getSelectedItem();
        
            // 取得用戶名、密碼和名稱
        String username = nameJTextField.getText();
        String password = passwordJTextField.getText();
        String name = txtName.getText();  // 使用 txtName 來儲存用戶的真實名稱

        // 取得所選的角色
        Role role = (Role) roleJComboBox.getSelectedItem();
        

        if (org != null && role != null) {
            // 創建員工並將其加入組織的員工名單
            Employee employee = org.getEmployeeDirectory().createEmployee(name);

            // 創建用戶帳號並將其與所選角色相關聯
            org.getUserAccountDirectory().createUserAccount(username, password, employee, role);

            // 彈出提示框告知用戶帳號已創建
            JOptionPane.showMessageDialog(null, "User account created successfully!");

            // 更新顯示的帳戶資料
            popData();
        } else {
            // 如果組織或角色為空，顯示錯誤提示
            JOptionPane.showMessageDialog(null, "Please select a valid organization and role.");
        }
        
        
        
        
    }//GEN-LAST:event_createUserAccountJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserAccountJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtName;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}

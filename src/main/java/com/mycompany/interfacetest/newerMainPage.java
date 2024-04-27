/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetest;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.CardLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class newerMainPage extends javax.swing.JFrame {
    
    Connection studentConn;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    CardLayout mainpageCardLayout;
    
    public newerMainPage() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("avery.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));
        FlatLightLaf.setup();
        
        studentConn = InterfaceTest.studentConn();
        
        initComponents();
        mainpageCardLayout = (CardLayout)(cardPanel.getLayout());
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        backgroundPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        dashboardButtonLabel = new CustomizedElements.CustomizedButton();
        studentsButtonLabel = new CustomizedElements.CustomizedButton();
        sectionsButtonLabel = new CustomizedElements.CustomizedButton();
        attendanceButtonLabel = new CustomizedElements.CustomizedButton();
        jSeparator1 = new javax.swing.JSeparator();
        cardPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsCardStudentsTable = new javax.swing.JTable();
        fetchStudentsDataButton = new javax.swing.JButton();
        studentsCardStudentsSearchField = new javax.swing.JTextField();
        studentsCardSearchButton = new javax.swing.JButton();
        studentsCardSectionsCombobox = new javax.swing.JComboBox<>();
        fetchNewDataButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync");

        dashboardButtonLabel.setBackground(new java.awt.Color(159, 198, 216));
        dashboardButtonLabel.setText("Dashboard");
        dashboardButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dashboardButtonLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonLabelActionPerformed(evt);
            }
        });

        studentsButtonLabel.setBackground(new java.awt.Color(159, 198, 216));
        studentsButtonLabel.setText("Students");
        studentsButtonLabel.setToolTipText("");
        studentsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentsButtonLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsButtonLabelActionPerformed(evt);
            }
        });

        sectionsButtonLabel.setBackground(new java.awt.Color(159, 198, 216));
        sectionsButtonLabel.setText("Sections");
        sectionsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        attendanceButtonLabel.setBackground(new java.awt.Color(159, 198, 216));
        attendanceButtonLabel.setText("Attendance");
        attendanceButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(studentsButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(sectionsButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(attendanceButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(dashboardButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentsButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectionsButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendanceButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cardPanel.setLayout(new java.awt.CardLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jButton1)
                .addGap(75, 75, 75)
                .addComponent(jButton2)
                .addContainerGap(516, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(208, 208, 208))
        );

        cardPanel.add(dashboardPanel, "dashboardCard");

        studentsCardStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student Number", "Grade Level", "Strand"
            }
        ));
        jScrollPane2.setViewportView(studentsCardStudentsTable);
        studentsCardStudentsTable.getAccessibleContext().setAccessibleName("");

        fetchStudentsDataButton.setText("Fetch Data");
        fetchStudentsDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchStudentsDataButtonActionPerformed(evt);
            }
        });

        studentsCardSearchButton.setText("Search");
        studentsCardSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsCardSearchButtonActionPerformed(evt);
            }
        });

        studentsCardSectionsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Section", "ICT 12 A", "ICT 12 B", "ICT 12 C", "ICT 12 D", " " }));

        fetchNewDataButton.setText("Fetch New");
        fetchNewDataButton.setToolTipText("");
        fetchNewDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchNewDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
        studentsPanel.setLayout(studentsPanelLayout);
        studentsPanelLayout.setHorizontalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsPanelLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fetchStudentsDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(fetchNewDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(161, 161, 161)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addComponent(studentsCardSectionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentsCardSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        studentsPanelLayout.setVerticalGroup(
            studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsCardSearchButton)
                    .addComponent(studentsCardSectionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentsPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(fetchStudentsDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fetchNewDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        cardPanel.add(studentsPanel, "studentsCard");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fetchStudentsDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchStudentsDataButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sqlQuery = "SELECT * FROM ICT_12D";
            st = studentConn.createStatement();
            rs = st.executeQuery(sqlQuery);

            DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
            studentsTableModel.setRowCount(0);

            while (rs.next()) {
                String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                String studentNumber = String.valueOf(rs.getString("Student_Number"));
                String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));

                String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                studentsTableModel.addRow(studentTbData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_fetchStudentsDataButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    SwingUtilities.invokeLater(()-> {
                    try {
                        UIManager.setLookAndFeel(new FlatLightLaf());
                        SwingUtilities.updateComponentTreeUI(this);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FlatLaftest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    SwingUtilities.invokeLater(()-> {
                    try {
                        UIManager.setLookAndFeel(new FlatDarkLaf());
                        SwingUtilities.updateComponentTreeUI(this);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FlatLaftest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dashboardButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonLabelActionPerformed
        // TODO add your handling code here:
        mainpageCardLayout.show(cardPanel, "dashboardCard");
    }//GEN-LAST:event_dashboardButtonLabelActionPerformed

    private void studentsButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonLabelActionPerformed
        // TODO add your handling code here:
        mainpageCardLayout.show(cardPanel, "studentsCard");
    }//GEN-LAST:event_studentsButtonLabelActionPerformed

    private void studentsCardSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsCardSearchButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob = (DefaultTableModel) studentsCardStudentsTable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        studentsCardStudentsTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(studentsCardStudentsSearchField.getText()));
    }//GEN-LAST:event_studentsCardSearchButtonActionPerformed

    private void fetchNewDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchNewDataButtonActionPerformed
        // TODO add your handling code here:
         String selectedSection = (String) studentsCardSectionsCombobox.getSelectedItem();
        
        if("ICT 12 A".equals(selectedSection)) {
            System.out.println("Hello A");
            try {
                String sqlQuery = "SELECT * FROM ICT_12A";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if("ICT 12 B".equals(selectedSection)) {
            System.out.println("Hello B");
            try {
                String sqlQuery = "SELECT * FROM ICT_12B";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if("ICT 12 C".equals(selectedSection)) {
            System.out.println("Hello C");
            try {
                String sqlQuery = "SELECT * FROM ICT_12C";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if ("ICT 12 D".equals(selectedSection)) {
            System.out.println("Hello D");
            try {
                String sqlQuery = "SELECT * FROM ICT_12D";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
//        try {
//            String sqlQuery = "SELECT * FROM ICT_12D";
//            st = studentConn.createStatement();
//            rs = st.executeQuery(sqlQuery);
//
//            DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
//            studentsTableModel.setRowCount(0);
//
//            while (rs.next()) {
//                String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
//                String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
//                String studentNumber = String.valueOf(rs.getString("Student_Number"));
//                String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));
//
//                String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
//                studentsTableModel.addRow(studentTbData);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_fetchNewDataButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newerMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomizedElements.CustomizedButton attendanceButtonLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel cardPanel;
    private CustomizedElements.CustomizedButton dashboardButtonLabel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton fetchNewDataButton;
    private javax.swing.JButton fetchStudentsDataButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel navPanel;
    private CustomizedElements.CustomizedButton sectionsButtonLabel;
    private CustomizedElements.CustomizedButton studentsButtonLabel;
    private javax.swing.JButton studentsCardSearchButton;
    private javax.swing.JComboBox<String> studentsCardSectionsCombobox;
    private javax.swing.JTextField studentsCardStudentsSearchField;
    private javax.swing.JTable studentsCardStudentsTable;
    private javax.swing.JPanel studentsPanel;
    // End of variables declaration//GEN-END:variables
}

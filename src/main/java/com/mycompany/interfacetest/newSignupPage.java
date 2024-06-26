/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetest;

/**
 *
 * @author avery
 */
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class newSignupPage extends javax.swing.JFrame {

    /**
     * Creates new form newSignupPage
     */
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public newSignupPage() {
        initComponents();
        setIconImage();
        conn = InterfaceTest.loginConn();
                        try {
            // Import fonts
            File importAccentFont = new File("src/main/resources/Fonts/Inter-bold.ttf");
            File importHeadingFont = new File("src/main/resources/Fonts/Inter-Bold.ttf");
            File importBodyFont = new File("src/main/resources/Fonts/Inter-Regular.ttf");
            
            // Assign fonts to variables, set font size
            // * Goes here
            
            // Set font for UI **BELOW**
            signupTitle.setFont(Font.createFont(Font.TRUETYPE_FONT, importHeadingFont).deriveFont(48f));
            alreadyHaveAccountLabel.setFont(Font.createFont(Font.TRUETYPE_FONT, importBodyFont).deriveFont(12f));
            loginHyperlink.setFont(Font.createFont(Font.TRUETYPE_FONT, importBodyFont).deriveFont(12f));
            
        } catch (Exception e) {
            e.printStackTrace();
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

        backgroundPanel = new javax.swing.JPanel();
        sidepanelArt = new javax.swing.JLabel();
        signupTitle = new javax.swing.JLabel();
        firstnamePanel = new CustomizedElements.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        firstnameField = new CustomizedElements.LoginCustomTextfield();
        lastnamePanel = new CustomizedElements.RoundedPanel();
        jLabel6 = new javax.swing.JLabel();
        lastnameField = new CustomizedElements.LoginCustomTextfield();
        usernamePanel = new CustomizedElements.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new CustomizedElements.LoginCustomTextfield();
        checknameButton = new CustomizedElements.CustomizedButton();
        passwordPanel = new CustomizedElements.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new CustomizedElements.LoginCustomPasswordfield();
        confirmpasswordPanel = new CustomizedElements.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordField = new CustomizedElements.LoginCustomPasswordfield();
        confirmSignupButton = new CustomizedElements.CustomizedButton();
        alreadyHaveAccountLabel = new javax.swing.JLabel();
        loginHyperlink = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync - Sign Up");
        setPreferredSize(new java.awt.Dimension(1000, 610));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidepanelArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/signupArtPanel.png"))); // NOI18N

        signupTitle.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        signupTitle.setForeground(new java.awt.Color(31, 58, 104));
        signupTitle.setText("Sign Up");

        firstnamePanel.setBackground(new java.awt.Color(159, 198, 216));
        firstnamePanel.setPreferredSize(new java.awt.Dimension(290, 60));
        firstnamePanel.setRoundBottomLeft(55);
        firstnamePanel.setRoundBottomRight(55);
        firstnamePanel.setRoundTopLeft(55);
        firstnamePanel.setRoundTopRight(55);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/smallerUserIcon.png"))); // NOI18N

        firstnameField.setBackground(new java.awt.Color(159, 198, 216));
        firstnameField.setForeground(new java.awt.Color(21, 102, 168));
        firstnameField.setLabelText("First Name");

        javax.swing.GroupLayout firstnamePanelLayout = new javax.swing.GroupLayout(firstnamePanel);
        firstnamePanel.setLayout(firstnamePanelLayout);
        firstnamePanelLayout.setHorizontalGroup(
            firstnamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstnamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        firstnamePanelLayout.setVerticalGroup(
            firstnamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(firstnamePanelLayout.createSequentialGroup()
                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        lastnamePanel.setBackground(new java.awt.Color(159, 198, 216));
        lastnamePanel.setPreferredSize(new java.awt.Dimension(290, 60));
        lastnamePanel.setRoundBottomLeft(55);
        lastnamePanel.setRoundBottomRight(55);
        lastnamePanel.setRoundTopLeft(55);
        lastnamePanel.setRoundTopRight(55);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/smallerUserIcon.png"))); // NOI18N

        lastnameField.setBackground(new java.awt.Color(159, 198, 216));
        lastnameField.setForeground(new java.awt.Color(21, 102, 168));
        lastnameField.setLabelText("Last Name");

        javax.swing.GroupLayout lastnamePanelLayout = new javax.swing.GroupLayout(lastnamePanel);
        lastnamePanel.setLayout(lastnamePanelLayout);
        lastnamePanelLayout.setHorizontalGroup(
            lastnamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastnamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        lastnamePanelLayout.setVerticalGroup(
            lastnamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lastnamePanelLayout.createSequentialGroup()
                .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        usernamePanel.setBackground(new java.awt.Color(159, 198, 216));
        usernamePanel.setPreferredSize(new java.awt.Dimension(290, 60));
        usernamePanel.setRoundBottomLeft(55);
        usernamePanel.setRoundBottomRight(55);
        usernamePanel.setRoundTopLeft(55);
        usernamePanel.setRoundTopRight(55);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/smallerUserIcon.png"))); // NOI18N

        usernameField.setBackground(new java.awt.Color(159, 198, 216));
        usernameField.setForeground(new java.awt.Color(21, 102, 168));
        usernameField.setLabelText("Username");

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        checknameButton.setBackground(new java.awt.Color(109, 201, 183));
        checknameButton.setForeground(new java.awt.Color(255, 255, 255));
        checknameButton.setText("Check");
        checknameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checknameButtonActionPerformed(evt);
            }
        });

        passwordPanel.setBackground(new java.awt.Color(159, 198, 216));
        passwordPanel.setPreferredSize(new java.awt.Dimension(290, 60));
        passwordPanel.setRoundBottomLeft(55);
        passwordPanel.setRoundBottomRight(55);
        passwordPanel.setRoundTopLeft(55);
        passwordPanel.setRoundTopRight(55);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/newerLock.png"))); // NOI18N

        passwordField.setBackground(new java.awt.Color(159, 198, 216));
        passwordField.setForeground(new java.awt.Color(21, 102, 168));
        passwordField.setLabelText("Password");
        passwordField.setShowAndHide(true);

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        confirmpasswordPanel.setBackground(new java.awt.Color(159, 198, 216));
        confirmpasswordPanel.setPreferredSize(new java.awt.Dimension(290, 60));
        confirmpasswordPanel.setRoundBottomLeft(55);
        confirmpasswordPanel.setRoundBottomRight(55);
        confirmpasswordPanel.setRoundTopLeft(55);
        confirmpasswordPanel.setRoundTopRight(55);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signupIcons/newerLock.png"))); // NOI18N

        confirmPasswordField.setBackground(new java.awt.Color(159, 198, 216));
        confirmPasswordField.setForeground(new java.awt.Color(21, 102, 168));
        confirmPasswordField.setLabelText("Confirm Password");
        confirmPasswordField.setShowAndHide(true);

        javax.swing.GroupLayout confirmpasswordPanelLayout = new javax.swing.GroupLayout(confirmpasswordPanel);
        confirmpasswordPanel.setLayout(confirmpasswordPanelLayout);
        confirmpasswordPanelLayout.setHorizontalGroup(
            confirmpasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmpasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        confirmpasswordPanelLayout.setVerticalGroup(
            confirmpasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(confirmpasswordPanelLayout.createSequentialGroup()
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        confirmSignupButton.setBackground(new java.awt.Color(109, 201, 183));
        confirmSignupButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmSignupButton.setText("Confirm");
        confirmSignupButton.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        confirmSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmSignupButtonActionPerformed(evt);
            }
        });

        alreadyHaveAccountLabel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        alreadyHaveAccountLabel.setForeground(new java.awt.Color(21, 102, 168));
        alreadyHaveAccountLabel.setText("Already have an account?");

        loginHyperlink.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginHyperlink.setForeground(new java.awt.Color(21, 102, 168));
        loginHyperlink.setText("<html>\n<u>Login here</u>\n</html>");
        loginHyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginHyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginHyperlinkMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/EduSync-Logo.png"))); // NOI18N

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepanelArt)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                    .addComponent(signupTitle)
                                    .addGap(50, 50, 50))
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checknameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmpasswordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(alreadyHaveAccountLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(loginHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lastnamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(confirmSignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGap(101, 101, 101))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepanelArt)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(signupTitle))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(firstnamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastnamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checknameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(confirmSignupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alreadyHaveAccountLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checknameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checknameButtonActionPerformed
        // TODO add your handling code here:
        String usernameCheck = usernameField.getText();
        
        try {
            String sqlquery =  "SELECT * FROM UserLogin WHERE Username='"+usernameCheck+"'";
            pst = conn.prepareStatement(sqlquery);
            rs = pst.executeQuery();
            if(usernameCheck.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Empty username. Please enter a valid username", "Check Username", JOptionPane.WARNING_MESSAGE);
            }else if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Username already exists", "Check Username", JOptionPane.WARNING_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Username Available!", "Check Username", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_checknameButtonActionPerformed

    private void loginHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginHyperlinkMouseClicked
        // TODO add your handling code here:
        this.dispose();
        newLoginPage newLogin = new newLoginPage();
        newLogin.show();
    }//GEN-LAST:event_loginHyperlinkMouseClicked

    private void confirmSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmSignupButtonActionPerformed
        // TODO add your handling code here:
        String signupFirstname = firstnameField.getText();
        String signupLastname = lastnameField.getText();
        String signupUsername = usernameField.getText();
        String signupPassword = passwordField.getText();
        String signupConfirmPassword = confirmPasswordField.getText();
        
        if (signupFirstname.isEmpty()||signupLastname.isEmpty()||signupUsername.isEmpty()||signupPassword.isEmpty()||signupConfirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty fields detected. Please fill out all the fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else if (signupPassword.equals(signupConfirmPassword)) {
            try {
                String checkQuery = "SELECT * FROM UserLogin WHERE FirstName = '"+signupFirstname+"' AND LastName = '"+signupLastname+"'";
                pst = conn.prepareStatement(checkQuery);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "A user with the same first and last name already exists.", "Duplicate Name", JOptionPane.WARNING_MESSAGE);
                }else{
                    try {
                        String usernameConfirmationQuery =  "SELECT * FROM UserLogin WHERE Username='"+signupUsername+"'";
                        pst = conn.prepareStatement(usernameConfirmationQuery);
                        ResultSet usernameConfirmationResultSet = pst.executeQuery();
                        if(usernameConfirmationResultSet.next()) {
                            JOptionPane.showMessageDialog(null, "Username already exists", "Check Username", JOptionPane.WARNING_MESSAGE);
                        }else{
                            String sqlquery = "INSERT INTO UserLogin (FirstName, LastName, Username, UserPassword) VALUES ('"+signupFirstname+"','"+signupLastname+"','"+signupUsername+"','"+signupConfirmPassword+"')";
                            pst = conn.prepareStatement(sqlquery);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Registration Successful");
                            newLoginPage loginPage = new newLoginPage();
                            loginPage.show();
                            this.dispose();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else {
            System.out.println(signupPassword);
            System.out.println(signupConfirmPassword);
            JOptionPane.showMessageDialog(null, "Error", "Password does not match",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmSignupButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newSignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newSignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newSignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newSignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newSignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alreadyHaveAccountLabel;
    private javax.swing.JPanel backgroundPanel;
    private CustomizedElements.CustomizedButton checknameButton;
    private CustomizedElements.LoginCustomPasswordfield confirmPasswordField;
    private CustomizedElements.CustomizedButton confirmSignupButton;
    private CustomizedElements.RoundedPanel confirmpasswordPanel;
    private CustomizedElements.LoginCustomTextfield firstnameField;
    private CustomizedElements.RoundedPanel firstnamePanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private CustomizedElements.LoginCustomTextfield lastnameField;
    private CustomizedElements.RoundedPanel lastnamePanel;
    private javax.swing.JLabel loginHyperlink;
    private CustomizedElements.LoginCustomPasswordfield passwordField;
    private CustomizedElements.RoundedPanel passwordPanel;
    private javax.swing.JLabel sidepanelArt;
    private javax.swing.JLabel signupTitle;
    private CustomizedElements.LoginCustomTextfield usernameField;
    private CustomizedElements.RoundedPanel usernamePanel;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loginIcons/EduSync-Logo.png")));
    }
}

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
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class newLoginPage extends javax.swing.JFrame {

    /**
     * Creates new form newLoginPage
     */
    public newLoginPage() {
        initComponents();
        setIconImage();
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
        edusyncLogo = new javax.swing.JLabel();
        edusyncTitle = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        usernamePanel = new CustomizedElements.RoundedPanel();
        userIcon = new javax.swing.JLabel();
        loginUsernameField = new CustomizedElements.LoginCustomTextfield();
        PasswordPanel = new CustomizedElements.RoundedPanel();
        lockIcon = new javax.swing.JLabel();
        loginPasswordField = new CustomizedElements.LoginCustomPasswordfield();
        loginConfirmButton = new CustomizedElements.CustomizedButton();
        dontHaveAccountTitle = new javax.swing.JLabel();
        signupHyperlink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync - Login");
        setPreferredSize(new java.awt.Dimension(1000, 570));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidepanelArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/loginArtPanel.png"))); // NOI18N

        edusyncLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/EduSync-Logo.png"))); // NOI18N

        edusyncTitle.setFont(new java.awt.Font("Hanken Grotesk", 1, 14)); // NOI18N
        edusyncTitle.setForeground(new java.awt.Color(109, 201, 183));
        edusyncTitle.setText("EDUSYNC");

        loginTitle.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(31, 58, 104));
        loginTitle.setText("Login");

        usernamePanel.setBackground(new java.awt.Color(159, 198, 216));
        usernamePanel.setPreferredSize(new java.awt.Dimension(290, 60));
        usernamePanel.setRoundBottomLeft(55);
        usernamePanel.setRoundBottomRight(55);
        usernamePanel.setRoundTopLeft(55);
        usernamePanel.setRoundTopRight(55);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/MaleUser.png"))); // NOI18N

        loginUsernameField.setBackground(new java.awt.Color(159, 198, 216));
        loginUsernameField.setForeground(new java.awt.Color(31, 58, 104));
        loginUsernameField.setLabelText("Username");

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(userIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PasswordPanel.setBackground(new java.awt.Color(159, 198, 216));
        PasswordPanel.setRoundBottomLeft(55);
        PasswordPanel.setRoundBottomRight(55);
        PasswordPanel.setRoundTopLeft(55);
        PasswordPanel.setRoundTopRight(55);

        lockIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/newLock.png"))); // NOI18N

        loginPasswordField.setBackground(new java.awt.Color(159, 198, 216));
        loginPasswordField.setForeground(new java.awt.Color(31, 58, 104));
        loginPasswordField.setLabelText("Password");
        loginPasswordField.setShowAndHide(true);

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lockIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lockIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        loginConfirmButton.setBackground(new java.awt.Color(109, 201, 183));
        loginConfirmButton.setForeground(new java.awt.Color(250, 250, 250));
        loginConfirmButton.setText("Confirm");
        loginConfirmButton.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        loginConfirmButton.setShadowColor(new java.awt.Color(105, 140, 133));
        loginConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginConfirmButtonActionPerformed(evt);
            }
        });

        dontHaveAccountTitle.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dontHaveAccountTitle.setForeground(new java.awt.Color(21, 102, 168));
        dontHaveAccountTitle.setText("Don't have an account?");

        signupHyperlink.setForeground(new java.awt.Color(21, 102, 168));
        signupHyperlink.setText("<html>\n<u>Sign up here</u>\n</html>");
        signupHyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signupHyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupHyperlinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginTitle)
                        .addGap(184, 184, 184))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(edusyncLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(edusyncTitle))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(loginConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(138, 138, 138)
                                    .addComponent(dontHaveAccountTitle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(signupHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)))
                .addComponent(sidepanelArt))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepanelArt)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(edusyncLogo))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(edusyncTitle)))
                .addGap(26, 26, 26)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(loginConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dontHaveAccountTitle)
                    .addComponent(signupHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginConfirmButtonActionPerformed
        String loginUsername = loginUsernameField.getText();
        String loginPassword = loginPasswordField.getText();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserLogin", "Admin", "user123");
            String sqlquery = "SELECT * FROM login.login_credentials WHERE username='"+loginUsername+"' AND userpassword='"+loginPassword+"'"; 
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }else {
                JOptionPane.showMessageDialog(null, "Login successful.");
                this.dispose();
                newMainPage mainpage = new newMainPage();
                mainpage.dashboardUsernameLabel.setText("Hello " + loginUsername);
                mainpage.show();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginConfirmButtonActionPerformed

    private void signupHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupHyperlinkMouseClicked
        // TODO add your handling code here:
        this.dispose();
        SignUp signupPage = new SignUp();
        signupPage.setVisible(true);
    }//GEN-LAST:event_signupHyperlinkMouseClicked

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
            java.util.logging.Logger.getLogger(newLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomizedElements.RoundedPanel PasswordPanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel dontHaveAccountTitle;
    private javax.swing.JLabel edusyncLogo;
    private javax.swing.JLabel edusyncTitle;
    private javax.swing.JLabel lockIcon;
    private CustomizedElements.CustomizedButton loginConfirmButton;
    private CustomizedElements.LoginCustomPasswordfield loginPasswordField;
    private javax.swing.JLabel loginTitle;
    private CustomizedElements.LoginCustomTextfield loginUsernameField;
    private javax.swing.JLabel sidepanelArt;
    private javax.swing.JLabel signupHyperlink;
    private javax.swing.JLabel userIcon;
    private CustomizedElements.RoundedPanel usernamePanel;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loginIcons/EduSync-Logo.png")));
    }
}

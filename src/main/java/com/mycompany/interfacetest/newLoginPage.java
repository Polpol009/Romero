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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class newLoginPage extends javax.swing.JFrame {

    /**
     * Creates new form newLoginPage
     */
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
    public newLoginPage() {
        initComponents();
       
        conn = InterfaceTest.loginConn();
        
        setIconImage();
                try {
            // Import fonts
            File importTitleFont = new File("src/main/resources/Fonts/Anton-Regular.ttf");
            File importBodyFont = new File("src/main/resources/Fonts/MajorMonoDisplay-Regular.ttf");
            File importAccentFont = new File("src/main/resources/Fonts/OpenSans-Regular.ttf");
            File importEduSyncTitleFont = new File("src/main/resources/Fonts/HankenGrotesk-Bold.ttf");
            File importLoginTItleFont = new File("src/main/resources/Fonts/Inter-bold.ttf");
            File importBodyTextFont = new File("src/main/resources/Fonts/Inter-Regular.ttf");
            
            // Assign fonts to variables, set font size
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, importTitleFont).deriveFont(60f);
            Font bodyFont = Font.createFont(Font.TRUETYPE_FONT, importBodyFont).deriveFont(18f);
            Font accentFont = Font.createFont(Font.TRUETYPE_FONT, importAccentFont).deriveFont(14f);
            
            
            // Set font for UI **BELOW**
            edusyncTitle.setFont(Font.createFont(Font.TRUETYPE_FONT, importEduSyncTitleFont).deriveFont(14f));
            loginTitle.setFont(Font.createFont(Font.TRUETYPE_FONT, importLoginTItleFont).deriveFont(48f));
            dontHaveAccountLabel.setFont(Font.createFont(Font.TRUETYPE_FONT, importBodyTextFont).deriveFont(12f));
            signupHyperlink.setFont(Font.createFont(Font.TRUETYPE_FONT, importBodyTextFont).deriveFont(12f));
            
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
        edusyncLogo = new javax.swing.JLabel();
        edusyncTitle = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        loginConfirmButton = new CustomizedElements.CustomizedButton();
        dontHaveAccountLabel = new javax.swing.JLabel();
        signupHyperlink = new javax.swing.JLabel();
        passwordPanel = new CustomizedElements.RoundedPanel();
        lockIcon = new javax.swing.JLabel();
        loginPasswordField = new CustomizedElements.LoginCustomPasswordfield();
        usernamePanel = new CustomizedElements.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        loginUsernameField = new CustomizedElements.LoginCustomTextfield();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync - Login");

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidepanelArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/loginArtPanel.png"))); // NOI18N

        edusyncLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/EduSync-Logo.png"))); // NOI18N

        edusyncTitle.setFont(new java.awt.Font("Hanken Grotesk", 1, 14)); // NOI18N
        edusyncTitle.setForeground(new java.awt.Color(109, 201, 183));
        edusyncTitle.setText("EDUSYNC");

        loginTitle.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(31, 58, 104));
        loginTitle.setText("Login");

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

        dontHaveAccountLabel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dontHaveAccountLabel.setForeground(new java.awt.Color(21, 102, 168));
        dontHaveAccountLabel.setText("Don't have an account?");

        signupHyperlink.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        signupHyperlink.setForeground(new java.awt.Color(21, 102, 168));
        signupHyperlink.setText("<html>\n<u>Sign up here</u>\n</html>");
        signupHyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signupHyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupHyperlinkMouseClicked(evt);
            }
        });

        passwordPanel.setBackground(new java.awt.Color(159, 198, 216));
        passwordPanel.setForeground(new java.awt.Color(21, 102, 168));
        passwordPanel.setRoundBottomLeft(55);
        passwordPanel.setRoundBottomRight(55);
        passwordPanel.setRoundTopLeft(55);
        passwordPanel.setRoundTopRight(55);

        lockIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/newerLock.png"))); // NOI18N

        loginPasswordField.setBackground(new java.awt.Color(159, 198, 216));
        loginPasswordField.setForeground(new java.awt.Color(21, 102, 168));
        loginPasswordField.setLabelText("Password");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lockIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lockIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        usernamePanel.setBackground(new java.awt.Color(159, 198, 216));
        usernamePanel.setForeground(new java.awt.Color(21, 102, 168));
        usernamePanel.setRoundBottomLeft(55);
        usernamePanel.setRoundBottomRight(55);
        usernamePanel.setRoundTopLeft(55);
        usernamePanel.setRoundTopRight(55);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIcons/smallerUserIcon.png"))); // NOI18N

        loginUsernameField.setBackground(new java.awt.Color(159, 198, 216));
        loginUsernameField.setForeground(new java.awt.Color(21, 102, 168));
        loginUsernameField.setLabelText("Username");

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(usernamePanelLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(edusyncLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(edusyncTitle))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(dontHaveAccountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signupHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(loginConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginTitle)
                        .addGap(184, 184, 184)))
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
                .addGap(28, 28, 28)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(loginConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dontHaveAccountLabel)
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
        String loginPassword = loginUsernameField.getText();
        
        try {
            String sqlquery = "SELECT * FROM UserLogin WHERE UserName = ? and UserPassword = ?";
            pst = conn.prepareStatement(sqlquery);
            pst.setString(1, loginUsername);
            pst.setString(2, loginPassword);
            rs = pst.executeQuery();
            
            if(!rs.next()) {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }else {
                JOptionPane.showMessageDialog(null, "Login Successful");
                newerMainPage mainPage = new newerMainPage();
//                mainPage.dashboardUsernameLabel.setText("Hello " + loginUsername);
                mainPage.show();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserLogin", "Admin", "user123");
//            String sqlquery = "SELECT * FROM login.login_credentials WHERE username='"+loginUsername+"' AND userpassword='"+loginPassword+"'"; 
//            PreparedStatement pst = conn.prepareStatement(sqlquery);
//            ResultSet rs = pst.executeQuery();
//            
//            if(!rs.next()){
//                JOptionPane.showMessageDialog(null, "Invalid username or password.");
//            }else {
//                JOptionPane.showMessageDialog(null, "Login successful.");
//                this.dispose();
//                newMainPage mainpage = new newMainPage();
//                mainpage.dashboardUsernameLabel.setText("Hello " + loginUsername);
//                mainpage.show();
//            }
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_loginConfirmButtonActionPerformed

    private void signupHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupHyperlinkMouseClicked
        // TODO add your handling code here:
        this.dispose();
        newSignupPage signupPage = new newSignupPage();
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
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel dontHaveAccountLabel;
    private javax.swing.JLabel edusyncLogo;
    private javax.swing.JLabel edusyncTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lockIcon;
    private CustomizedElements.CustomizedButton loginConfirmButton;
    private CustomizedElements.LoginCustomPasswordfield loginPasswordField;
    private javax.swing.JLabel loginTitle;
    private CustomizedElements.LoginCustomTextfield loginUsernameField;
    private CustomizedElements.RoundedPanel passwordPanel;
    private javax.swing.JLabel sidepanelArt;
    private javax.swing.JLabel signupHyperlink;
    private CustomizedElements.RoundedPanel usernamePanel;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loginIcons/EduSync-Logo.png")));
    }
}

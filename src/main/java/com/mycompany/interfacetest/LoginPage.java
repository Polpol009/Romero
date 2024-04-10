/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author avery
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        
        try{
            // Import fonts
            File importTitleFont = new File("src/main/resources/Fonts/Anton-Regular.ttf");
            File importBodyFont = new File("src/main/resources/Fonts/MajorMonoDisplay-Regular.ttf");
            File importAccentFont = new File("src/main/resources/Fonts/OpenSans-Regular.ttf");
            
            // Assign fonts to variables, set font size
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, importTitleFont).deriveFont(60f);
            Font bodyFont = Font.createFont(Font.TRUETYPE_FONT, importBodyFont).deriveFont(18f);
            Font accentFont = Font.createFont(Font.TRUETYPE_FONT, importAccentFont).deriveFont(14f);
            
            // Set font for UI
            eduSyncTitle.setFont(titleFont);
            eduSyncSlogan.setFont(bodyFont);
            emailLabel.setFont(accentFont);
            passLabel.setFont(accentFont);
            notAMemberLabel.setFont(Font.createFont(Font.TRUETYPE_FONT, importAccentFont).deriveFont(12f));
            createAnAccountLabel.setFont(Font.createFont(Font.TRUETYPE_FONT, importAccentFont).deriveFont(12f));
            
            loginButton.setFont(Font.createFont(Font.TRUETYPE_FONT, importAccentFont).deriveFont(24f));
            
        }catch(Exception e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        bgPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        eduSyncTitle = new javax.swing.JLabel();
        eduSyncSlogan = new javax.swing.JLabel();
        ccstLogo = new javax.swing.JLabel();
        loginPanel = new RoundedPanel(15, new Color(70,131,166, 200));
        userIcon = new javax.swing.JLabel();
        passPanel = new RoundedPanel(15,new Color(225, 225, 225 ));
        passField = new javax.swing.JPasswordField();
        emailPanel = new RoundedPanel(15, new Color(225, 225, 225));
        usernameField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel1 = new RoundedPanel(15, new Color(255, 255, 255, 200));
        notAMemberLabel = new javax.swing.JLabel();
        createAnAccountLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync - Login");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(51, 51, 51));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setOpaque(false);
        sidePanel.setPreferredSize(new java.awt.Dimension(510, 570));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eduSyncTitle.setFont(new java.awt.Font("Anton", 0, 60)); // NOI18N
        eduSyncTitle.setForeground(new java.awt.Color(255, 255, 255));
        eduSyncTitle.setText("EduSync");
        sidePanel.add(eduSyncTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        eduSyncSlogan.setFont(new java.awt.Font("Major Mono Display", 0, 18)); // NOI18N
        eduSyncSlogan.setForeground(new java.awt.Color(255, 255, 255));
        eduSyncSlogan.setText("<html>\ntrack academic progress<br> seamlessly\n</html>");
        sidePanel.add(eduSyncSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        ccstLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newlogo.png"))); // NOI18N
        sidePanel.add(ccstLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 220, -1));

        bgPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginPanel.setBackground(new java.awt.Color(70, 131, 166));
        loginPanel.setOpaque(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts-xxl.png"))); // NOI18N
        loginPanel.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        passPanel.setBackground(new java.awt.Color(255, 255, 255));
        passPanel.setOpaque(false);
        passPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passField.setBackground(new java.awt.Color(223, 223, 223));
        passField.setForeground(new java.awt.Color(38, 55, 120));
        passField.setBorder(null);
        passField.setCaretColor(new java.awt.Color(38, 55, 120));
        passPanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        loginPanel.add(passPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 260, 40));

        emailPanel.setBackground(new java.awt.Color(255, 255, 255));
        emailPanel.setOpaque(false);
        emailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setBackground(new java.awt.Color(223, 223, 223));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(38, 55, 120));
        usernameField.setBorder(null);
        usernameField.setCaretColor(new java.awt.Color(38, 55, 120));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        emailPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        loginPanel.add(emailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 260, -1));

        passLabel.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");
        loginPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 20));

        emailLabel.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Username");
        loginPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        loginButton.setBackground(new java.awt.Color(56, 182, 255));
        loginButton.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 140, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notAMemberLabel.setForeground(new java.awt.Color(0, 0, 0));
        notAMemberLabel.setText("Not a member?");
        jPanel1.add(notAMemberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        createAnAccountLabel.setForeground(new java.awt.Color(56, 182, 255));
        createAnAccountLabel.setText("Create an Account");
        createAnAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAnAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAnAccountLabelMouseClicked(evt);
            }
        });
        jPanel1.add(createAnAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        loginPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 440, 40));

        bgPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 440, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newbgimage.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        bgPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String loginUsername = usernameField.getText();
        String loginPassword = passField.getText();
        
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
                newMainPage newMainPage = new newMainPage();
                newMainPage.dashboardUsernameLabel.setText("Hello " + loginUsername);
                newMainPage.show();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAnAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAnAccountLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        SignUp signupPage = new SignUp();
        signupPage.setVisible(true);
    }//GEN-LAST:event_createAnAccountLabelMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel ccstLogo;
    private javax.swing.JLabel createAnAccountLabel;
    private javax.swing.JLabel eduSyncSlogan;
    private javax.swing.JLabel eduSyncTitle;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel notAMemberLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacetest;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author avery
 */
public class InterfaceTest {
    
    public static Connection conn() {
        
        try {
            String url = "jdbc:ucanaccess://C://database//EduSync11.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        newLoginPage login = new newLoginPage();
        login.setVisible(true);
        
    }
}

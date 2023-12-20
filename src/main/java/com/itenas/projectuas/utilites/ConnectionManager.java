/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.utilites;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rizal
 */
public class ConnectionManager {

    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/database_w10";
    private String username = "root";
    private String password = "";

    public Connection LogOn() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public void LogOff() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

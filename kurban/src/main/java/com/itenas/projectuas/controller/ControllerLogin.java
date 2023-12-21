/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.controller;

import com.itenas.projectuas.utilites.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

/**
 *
 * @author rizal
 */
public class ControllerLogin {

    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public int login(String user, String pwd) {
        int stat = 0;
        try {
            Statement stm = con.createStatement();

            // Check for admin first
            ResultSet rsAdmin = stm.executeQuery("SELECT * FROM admin WHERE username = '" + user + "' and password = '" + pwd + "'");
            if (Objects.equals(user, rsAdmin.getString("username")) && Objects.equals(pwd, rsAdmin.getString("password"))) {
                stat = 1;  // Admin found
            } else {
                // Check for user
                ResultSet rsUser = stm.executeQuery("SELECT * FROM user WHERE username = '" + user + "' and password = '" + pwd + "'");
                if (Objects.equals(user, rsUser.getString("username")) && Objects.equals(pwd, rsUser.getString("password"))) {
                    stat = 2;  // User found
                }
            }

            return stat;
        } catch (SQLException ex) {
            // Handle SQL errors appropriately
            // e.g., log the error, display a user-friendly message
            ex.printStackTrace();
            return stat;
        }         
    }
}

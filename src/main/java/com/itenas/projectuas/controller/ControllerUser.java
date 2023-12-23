/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.controller;

import com.itenas.projectuas.entity.User;
import com.itenas.projectuas.utilites.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class ControllerUser {

    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public boolean insertUser(String username, String password, String nama, String alamat, String noTelp) {
        try {
            // Check for existing username
            PreparedStatement stmCheck = con.prepareStatement("SELECT * FROM user WHERE username = ?");
            stmCheck.setString(1, username);
            ResultSet rs = stmCheck.executeQuery();

            if (rs.next()) {
                // Username already exists
                return false;
            }

            // Username is available, proceed with insertion
            String query = "INSERT INTO user VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password); // Assuming password is hashed before insertion
            stm.setString(3, nama);
            stm.setString(4, alamat);
            stm.setString(5, noTelp);
            stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            // Handle SQL errors appropriately
            return false;
        }
    }

    public List<User> showUser() {
        List<User> listUser = new ArrayList<>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT* from User");
            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setNoTelp(rs.getString("nomor_telepon"));
                listUser.add(user);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listUser;
    }

}

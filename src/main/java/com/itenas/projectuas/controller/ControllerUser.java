/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.controller;

import com.itenas.projectuas.entity.User;
import com.itenas.projectuas.utilites.ConnectionManager;
import java.sql.Connection;
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
    
    public boolean insertUser(String username, String password, String alamat, String nama, String noTelp){
        String query = "INSERT INTO User values"
                + "('" + username + "', '" + password + "', '" + alamat + "', " + "'" + nama
                + "', '" + noTelp + "')";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        }catch (SQLException ex){
            return false;
        }
    }
    
    public List<User> showUser(){
        List<User> listUser = new ArrayList<>();        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT* from User");
            while(rs.next()){
                User user = new User();
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setNama(rs.getString("Alamat"));
                user.setNoTelp(rs.getString("Nomor_Telepon"));
                listUser.add(user);
            }
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return listUser;
    }
}

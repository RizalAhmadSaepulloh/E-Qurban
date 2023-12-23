/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.controller;

import com.itenas.projectuas.entity.Hewan;
import com.itenas.projectuas.entity.Transaksi;
import com.itenas.projectuas.entity.User;
import com.itenas.projectuas.utilites.AccountLoggedIn;
import com.itenas.projectuas.utilites.ConnectionManager;
import com.itenas.projectuas.utilites.ProductSelected;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class ControllerTransaksi {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public boolean insertTransaksi(User user, Hewan hewan, LocalDate tanggalBeli){
        user = AccountLoggedIn.getCurrentUser();
        hewan = ProductSelected.getHewan();
        String query = "INSERT INTO Transaksi (Username, Hewan_ID, Tanggal_Beli) VALUES "
                + "('" + user.getUsername() + "', '" + hewan.getIdHewan() + "', '" + tanggalBeli + "')";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex){
            return false;
        }
    }
}


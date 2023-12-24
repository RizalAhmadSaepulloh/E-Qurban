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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
    
   public List<Transaksi> showTransaksi(User user) {
    List<Transaksi> listtTransaksi = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    try {
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT Invoice, Nama_Hewan, Berat, Harga, Tanggal_beli\n"
                + "FROM transaksi\n"
                + "JOIN hewan ON transaksi.Hewan_ID = hewan.Hewan_ID\n"
                + "WHERE username = '" + user.getUsername() + "';");
        while (rs.next()) {
            Transaksi transaksi = new Transaksi();
            transaksi.setInvoice(rs.getString("transaksi.Invoice"));
            transaksi.setNamaHewan(rs.getString("hewan.Nama_Hewan"));
            transaksi.setBerat(rs.getDouble("hewan.Berat"));
            transaksi.setHarga(rs.getDouble("hewan.Harga"));
            transaksi.setTanggalBeli(LocalDate.parse(rs.getString("transaksi.Tanggal_beli"), formatter));
            listtTransaksi.add(transaksi);
        }
    } catch (SQLException ex) {
        System.out.println(ex.toString());
    }
    return listtTransaksi;
}
   public List<Transaksi> showTransaksiAdmin() {
    List<Transaksi> listtTransaksi = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    try {
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT transaksi.Invoice, hewan.Nama_Hewan, hewan.Berat, user.username, transaksi.Tanggal_beli, hewan.Harga\n"
                + "FROM transaksi\n"
                + "JOIN hewan ON transaksi.Hewan_ID = hewan.Hewan_ID\n"
                + "JOIN user ON user.username = transaksi.username ;");
        while (rs.next()) {
            Transaksi transaksi = new Transaksi();
            transaksi.setInvoice(rs.getString("Invoice"));
            transaksi.setNamaHewan(rs.getString("Nama_Hewan"));
            transaksi.setBerat(rs.getDouble("Berat"));
            transaksi.setHarga(rs.getDouble("Harga"));
            transaksi.setTanggalBeli(LocalDate.parse(rs.getString("Tanggal_beli"), formatter));
            transaksi.setUsername(rs.getString("username"));
            listtTransaksi.add(transaksi);
        }
    } catch (SQLException ex) {
        System.out.println(ex.toString());
    }
    return listtTransaksi;
}


}


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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Invoice.transaksi , Nama_Hewan.hewan , Berat.hewan , Harga.hewan , Tanggal_beli.transaksi from transaksi join hewan on transaksi.Hewan_ID = hewan.Hewan_ID join user on user.username = transaksi.username where user.username = '"+user+"';");
            while (rs.next()) {
                Transaksi transaksi = new Transaksi();
                transaksi.setInvoice(rs.getString("Invoice.transaksi"));
                transaksi.setNamaHewan(rs.getString("Nama_Hewan.hewan"));
                transaksi.setBerat(rs.getDouble("Berat.hewan"));
                transaksi.setHarga(rs.getDouble("Harga.hewan"));
                transaksi.setTanggalBeli(LocalDate.parse(rs.getString("Tanggal_beli.transaksi"), formatter));
                listtTransaksi.add(transaksi);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listtTransaksi;
    }
}


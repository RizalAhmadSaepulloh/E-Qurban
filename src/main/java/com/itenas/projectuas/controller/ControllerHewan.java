/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.controller;

import com.itenas.projectuas.entity.Hewan;
import com.itenas.projectuas.utilites.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M Alif Mi'Raj Jabbar
 */
public class ControllerHewan {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public boolean insertHewan(String idHewan, String namaHewan, double berat, double harga){
        String query = "insert into hewan values " 
                + "('"+idHewan+"', '" + namaHewan + "', " + berat + ", " + harga + ")";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex){
            return false;
        }
    }
    
    public List<Hewan> showHewan(){
        List<Hewan> listHewan = new ArrayList<>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT* from Hewan");
            while (rs.next()){
                Hewan hewan = new Hewan();
                hewan.setIdHewan(rs.getString("Hewan_ID"));
                hewan.setNamaHewan(rs.getString("Nama_Hewan"));
                hewan.setBerat(rs.getDouble("Berat"));
                hewan.setHarga(rs.getDouble("Harga"));
                listHewan.add(hewan);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listHewan;
    }
    
    public boolean updateHewan(String newId,String idHewan ,String namaHewan, double harga, double berat){
        String query = "UPDATE Hewan SET Hewan_ID = '"
                + newId + "', Nama = '" + namaHewan + "', Harga = " + harga + ", Berat = " + berat
                + " WHERE Hewan_ID = '" + idHewan + "'";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean deleteHewan(String id){
        String query = "DELETE from Hewan where Hewan_id = '" + id + "'";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
}
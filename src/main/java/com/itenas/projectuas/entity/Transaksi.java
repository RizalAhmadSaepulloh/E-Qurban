/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.entity;

import java.time.LocalDate;

public class Transaksi {
    private String invoice;
    private String namaHewan;
    private double berat;
    private String username;
    private LocalDate tanggalBeli;
    private double harga;
    
    public Transaksi() {
    }

    public Transaksi(String invoice, String namaHewan, double berat, String username, LocalDate tanggalBeli, double harga) {
        this.invoice = invoice;
        this.namaHewan = namaHewan;
        this.berat = berat;
        this.username = username;
        this.tanggalBeli = tanggalBeli;
        this.harga = harga;
    }

    

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public Double getBerat() {
        return berat;
    }

    public void setBerat(Double berat) {
        this.berat = berat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(LocalDate tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.utilites;

import com.itenas.projectuas.entity.Transaksi;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class Transaction {
    private static double selisih;
    private static double transfer;
    private static Transaksi transaksi;

    public static Transaksi getTransaksi() {
        return transaksi;
    }

    public static void setTransaksi(Transaksi transaksi) {
        Transaction.transaksi = transaksi;
    }
    
    public static double getSelisih() {
        return selisih;
    }

    public static void setSelisih(double selisih) {
        Transaction.selisih = selisih;
    }

    public static double getTransfer() {
        return transfer;
    }

    public static void setTransfer(double transfer) {
        Transaction.transfer = transfer;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.utilites;

import com.itenas.projectuas.entity.Hewan;
import java.time.LocalDate;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class ProductSelected {
    private static Hewan hewan;
    private static LocalDate tanggal;

    public static LocalDate getTanggal() {
        return tanggal;
    }

    public static void setTanggal(LocalDate tanggal) {
        ProductSelected.tanggal = tanggal;
    }
    
    public static Hewan getHewan() {
        return hewan;
    }

    public static void setHewan(Hewan hewan) {
        ProductSelected.hewan = hewan;
    }
}

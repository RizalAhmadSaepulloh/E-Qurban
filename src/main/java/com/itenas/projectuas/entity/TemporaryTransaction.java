/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.entity;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class TemporaryTransaction {
    private static String currentIdHewan;

    public static String getCurrentIdHewan() {
        return currentIdHewan;
    }

    public static void setCurrentIdHewan(String idHewan) {
        TemporaryTransaction.currentIdHewan = idHewan;
    }
    
}

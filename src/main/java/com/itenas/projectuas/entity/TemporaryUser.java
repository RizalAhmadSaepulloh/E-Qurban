/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.projectuas.entity;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class TemporaryUser {
    private static String currentUsername;
    
    public static String getCurrentUsername(){
        return currentUsername;
    }
    public static void setCurrentUsername(String username){
        currentUsername = username;
    }
}

/*
 * phonebook with java
 */
package com.mycompany.phonebook;

import javax.swing.JFrame;

/**
 *
 * @author Arshed
 */
public class Main {
    public static void main(String[] args) {
        
        Phonebook frame = new Phonebook();
        
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
    
}

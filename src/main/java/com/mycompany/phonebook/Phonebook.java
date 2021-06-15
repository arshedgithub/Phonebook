/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.phonebook;

/**
 *
 * @author Arshed
 */
  import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.util.Vector;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Phonebook extends JFrame{

    JTextField txtName;
    JTextField txtTelephone;
    JTextField txtEmail;
    JTextField txtSearchByName;
    
    JTable tblStudent;

    JComboBox<String> cmbType;
    JComboBox<String> cmbSearchByType;

    Phonebook(){
        
        setTitle("Phone Book");
        setLocation(300,200);
        setSize(600,400);

        Container con = getContentPane();
        FlowLayout lay = new FlowLayout();
        con.setLayout(lay);

        JLabel lblName = new JLabel("Name         :");
        JLabel lblTelephone = new JLabel("Telephone :");
        JLabel lblEmail = new JLabel("Email          :");
        JLabel lblType = new JLabel("Type            :");

        txtName = new JTextField(45);
        txtTelephone = new JTextField(45);
        txtEmail = new JTextField(45);

        String typeData[] = { "Family                                                                                                                                                ",
                             "Friend                                                                                                        ", 
                             "Relation                                                                                                      ",
                             "Other                                                                                                         " };
        DefaultComboBoxModel typeModel = new DefaultComboBoxModel(typeData);
        cmbType = new JComboBox<String>();
        cmbType.setModel(typeModel);

        JButton btnAdd = new JButton("       Add       ");
        JButton btnClear = new JButton("      Clear      ");
        JButton btnUpdate = new JButton("     Update     ");
        JButton btnDelete = new JButton("     Delete      ");
      
        JLabel lblSearchByName = new JLabel("Search By Name                    :");
        JLabel lblSearchByType = new JLabel("Search By Type                      :");

        txtSearchByName = new JTextField(37);
   
        String sbtypeData[] = { "All                                                                                                                           " };
        DefaultComboBoxModel sbtypeModel = new DefaultComboBoxModel(sbtypeData);
        cmbSearchByType = new JComboBox<String>();
        cmbSearchByType.setModel(sbtypeModel);

        JButton btnSearch = new JButton("        Search         ");
        JButton btnSearchClear = new JButton("     Search Clear     ");

        btnAdd.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e){ btnAddAP(e);  }    }   );
    

        Vector titles = new Vector();
        titles.add("Name");
        titles.add("Type");
        titles.add("Telephone");
        titles.add("Email");

        Vector data = new Vector();

        Vector r1 = new Vector();
        r1.add("Kamal");
        r1.add("Family");
        r1.add("0776666666");
        r1.add("kamal123@gmail.com");

        Vector r2 = new Vector();
        r2.add("Siriniwasa");
        r2.add("Friend");
        r2.add("0734456778");
        r2.add("siriniva@ymail.com");

        Vector r3 = new Vector();
        r3.add("Manel");
        r3.add("Friend");
        r3.add("0792345672");
        r3.add("manel.moi@gmail.com");

        data.add(r1);
        data.add(r2);
        data.add(r3);



        DefaultTableModel dataModel = new DefaultTableModel(data,titles);
        tblStudent = new JTable();

        tblStudent.setModel(dataModel);

        JScrollPane jspStTable = new JScrollPane();
        jspStTable.setPreferredSize( new Dimension(500,100) );

        jspStTable.setViewportView( tblStudent );

        con.add(lblName);
        con.add(txtName);
        con.add(lblTelephone);
        con.add(txtTelephone);
        con.add(lblEmail);
        con.add(txtEmail);
        con.add(lblType);
        con.add(cmbType);
        con.add(btnAdd);
        con.add(btnClear);
        con.add(btnUpdate);
        con.add(btnDelete);
        con.add(lblSearchByName);
        con.add(txtSearchByName);
        con.add(lblSearchByType);
        con.add(cmbSearchByType);
        con.add(btnSearch);
        con.add(btnSearchClear);

        con.add(jspStTable);


    }

    public void btnAddAP(ActionEvent e){
             String name = txtName.getText();
             String type = cmbType.getSelectedItem().toString();
             String telephone = txtTelephone.getText();
             String email = txtEmail.getText();

        Vector r = new Vector();
        r.add(name);
        r.add(type);
        r.add(telephone);
        r.add(email);

        DefaultTableModel model = (DefaultTableModel)tblStudent.getModel();
        model.addRow(r);
    }


}

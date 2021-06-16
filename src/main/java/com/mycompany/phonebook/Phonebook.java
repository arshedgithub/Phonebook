
package com.mycompany.phonebook;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * @author Arshed
 */
public class Phonebook extends JFrame{

    JTextField txtName = new JTextField(30), txtPhone = new JTextField(15), txtEmail = new JTextField(30), txtSearchName = new JTextField(20);
    
    JTable tblStudent;

    JComboBox<String> cmbType = new JComboBox<>();
    JComboBox<String> cmbSearchByType = new JComboBox<>();
    JButton addBtn = new JButton("Add"), updateBtn = new JButton("Update"), clearBtn = new JButton("Clear"), deleteBtn = new JButton("Delete");
    JButton search = new JButton("Search"), clearSearch = new JButton("Clear");
    JPanel pane1, pane2, pane3;
    
    Font font = new Font("Serif",Font.PLAIN,30);
    
    Phonebook(){
        
        setTitle("Phone Book");
        setLocation(300,200);
        setSize(500,500);

        Container con = getContentPane();
        con.setFont(font);
        con.setLayout(new FlowLayout());
        
        pane1 = new JPanel();
        pane1.setBounds(10, 10, 480, 150); 
        pane1.setBackground(Color.red);
        pane1.setLayout(new GridBagLayout());

        addItem(pane1, new JLabel("Name :"), 0, 0, 1, 1, GridBagConstraints.WEST);
        addItem(pane1, new JLabel("Phone :"), 0, 1, 1, 1, GridBagConstraints.WEST);
        addItem(pane1, new JLabel("Address :"), 0, 2, 1, 1, GridBagConstraints.WEST);
        addItem(pane1, new JLabel("Type :"), 0, 3, 1, 1, GridBagConstraints.WEST);
 
        String typeData[] = { "Family", "Friend ", "Relation", "Other  " };
        DefaultComboBoxModel typeModel = new DefaultComboBoxModel(typeData);
        cmbType.setModel(typeModel);

        addItem(pane1, txtName, 1, 0, 2, 1, GridBagConstraints.WEST);
        addItem(pane1, txtPhone, 1, 1, 1, 1, GridBagConstraints.WEST);
        addItem(pane1, txtEmail, 1, 2, 2, 1, GridBagConstraints.WEST);
        addItem(pane1, cmbType, 1, 3, 1, 1, GridBagConstraints.WEST);
        
        pane2 = new JPanel();
        pane2.setBounds(40,170,500,50);
        pane2.setBackground(Color.BLUE);
        pane2.setLayout(new FlowLayout());
        pane2.add(addBtn);
        pane2.add(updateBtn);
        pane2.add(clearBtn);
        pane2.add(deleteBtn);
        
        pane3 = new JPanel();
        pane3.setBounds(40, 250, 450, 100);
        pane3.setBackground(Color.GREEN);
        pane3.setLayout(new GridBagLayout());

        Box searchBox = Box.createVerticalBox();
        searchBox.setBorder(BorderFactory.createTitledBorder("search"));
        con.add(searchBox);
        
        String searchTypeData[] = { "All", "Family", "Friend ", "Relation", "Other" };
        DefaultComboBoxModel searchTypeModel = new DefaultComboBoxModel(searchTypeData);
        cmbSearchByType.setModel(searchTypeModel);

        addItem(pane3, new JLabel("Name :"), 0, 0, 1, 1, GridBagConstraints.WEST);
        addItem(pane3, txtSearchName, 1, 0, 1, 1, GridBagConstraints.WEST);
        addItem(pane3, new JLabel("Type :"), 2, 0, 1, 1, GridBagConstraints.WEST);
        addItem(pane3, cmbSearchByType, 3, 0, 1, 1, GridBagConstraints.WEST);
        addItem(pane3, search, 0, 1, 1, 1, GridBagConstraints.EAST);
        addItem(pane3, clearSearch, 1, 1, 1, 1, GridBagConstraints.WEST);



        
//
//        btnAdd.addActionListener( new ActionListener() { public void actionPerformed(ActionEvent e){ btnAddAP(e);  }    }   );
//    
//
//        Vector titles = new Vector();
//        titles.add("Name");
//        titles.add("Type");
//        titles.add("Telephone");
//        titles.add("Email");
//
//        Vector data = new Vector();
//
//        Vector r1 = new Vector();
//        r1.add("Kamal");
//        r1.add("Family");
//        r1.add("0776666666");
//        r1.add("kamal123@gmail.com");
//
//        Vector r2 = new Vector();
//        r2.add("Siriniwasa");
//        r2.add("Friend");
//        r2.add("0734456778");
//        r2.add("siriniva@ymail.com");
//
//        Vector r3 = new Vector();
//        r3.add("Manel");
//        r3.add("Friend");
//        r3.add("0792345672");
//        r3.add("manel.moi@gmail.com");
//
//        data.add(r1);
//        data.add(r2);
//        data.add(r3);
//
//
//
//        DefaultTableModel dataModel = new DefaultTableModel(data,titles);
//        tblStudent = new JTable();
//
//        tblStudent.setModel(dataModel);
//
//        JScrollPane jspStTable = new JScrollPane();
//        jspStTable.setPreferredSize( new Dimension(500,100) );
//
//        jspStTable.setViewportView( tblStudent );
//
        con.add(pane1);
        con.add(pane2);
        con.add(pane3);


//        con.add(lblName);
//        con.add(txtName);
//        con.add(lblTelephone);
//        con.add(txtTelephone);
//        con.add(lblEmail);
//        con.add(txtEmail);
//        con.add(lblType);
//        con.add(cmbType);
//        con.add(btnAdd);
//        con.add(btnClear);
//        con.add(btnUpdate);
//        con.add(btnDelete);
//        con.add(lblSearchByName);
//        con.add(txtSearchByName);
//        con.add(lblSearchByType);
//        con.add(cmbSearchByType);
//        con.add(btnSearch);
//        con.add(btnSearchClear);
//
//        con.add(jspStTable);
            pane1.setVisible(true);

    }

    public void btnAddAP(ActionEvent e){
        
        String name = txtName.getText();
        String type = cmbType.getSelectedItem().toString();
        String telephone = txtPhone.getText();
        String email = txtEmail.getText();

        Vector r = new Vector();
        r.add(name);
        r.add(type); 
        r.add(telephone);
        r.add(email);

        DefaultTableModel model = (DefaultTableModel)tblStudent.getModel();
        model.addRow(r);
        
    }

    private void addItem(JPanel p, JComponent c, int x,int y, int width, int height, int align){
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = x;
        gc.gridy = y;
        gc.gridheight = height;
        gc.gridwidth = width;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = GridBagConstraints.NONE;
        p.add(c,gc);
    }
}

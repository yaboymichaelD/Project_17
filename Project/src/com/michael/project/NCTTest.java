package com.michael.project;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;


public class NCTTest extends JFrame implements ActionListener{

    public NCTTest()
    {
        setTitle("NCT Center");
        setSize(800,800);
        setResizable(true);
        setLocation(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton testButton = new JButton("Display Customers");
        testButton.addActionListener(this);

        Container cpane;
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(testButton);
        /*CreateFileMenu();
        CreateEditMenu();*/

        /*JMenuBar menBar = new JMenuBar();
        setJMenuBar(menBar);
        menBar.setBackground(Color.PINK);
        menBar.add(fileMenu);
        menBar.add(editMenu);*/
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Display Customers"))
        {

            Customer[]    customer;         //declare the person array
            customer = new Customer[4];    //and then create it

            for (int i = 0; i < customer.length; i++) {
                customer[i] = new Customer();
                //read in data values
                customer[i].setFirstName(JOptionPane.showInputDialog(null,"Enter name:"));
                customer[i].setLastName (JOptionPane.showInputDialog(null,"Enter age:"));
                customer[i].setAddress(JOptionPane.showInputDialog(null,"Enter address:"));
                customer[i].setPhoneNum(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter phone:")));
                customer[i].setLicenceNum(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Lice Num:")));
            }
            // create a combo box
            JComboBox names = new JComboBox();
            // add all the names into it
            for (Customer pp : customer)
                names.addItem( pp.getFirstName());
            // Allow the user to pick one name from the combo box
            JOptionPane.showMessageDialog(null,names,"Person list", JOptionPane.PLAIN_MESSAGE);
            // find the index position of the one selected
            int idx = names.getSelectedIndex();
            // display this item from the array
            JOptionPane.showMessageDialog(null,"The person you picked was person no " + idx +
                    " whose full details are as follows: \n" + customer[idx].toString());
        }

        }
    }


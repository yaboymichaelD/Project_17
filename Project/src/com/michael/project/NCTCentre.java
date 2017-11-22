package com.michael.project;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.io.*;



public class NCTCentre extends JFrame implements ActionListener {

    private JMenu fileMenu;
    private JMenu editMenu;
    private JTextField txtfield;

    //Initialise Array for Cars (Must create looping structure for this)
    Car car1 = new Car();
    ArrayList<Car> cars;

    //Initialise Array for Customers
    Customer cust1 = new Customer();
    ArrayList<Customer> customers;

    public NCTCentre()
    {
        setTitle("NCT Center");
        setSize(800,800);
        setResizable(true);
        setLocation(800,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cpane;
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());

        CreateFileMenu();
        CreateEditMenu();

        JMenuBar menBar = new JMenuBar();
        setJMenuBar(menBar);
        menBar.setBackground(Color.PINK);
        menBar.add(fileMenu);
        menBar.add(editMenu);
    }

    private void CreateFileMenu(){
        JMenuItem login;
        fileMenu = new JMenu("Login");
    }

    private void CreateEditMenu(){
        JMenuItem test ;
        editMenu = new JMenu("Test");
        test = new JMenuItem("Create NCT Test");
        test.addActionListener(this);
        editMenu.add(test);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Create NCT Test"))
        {
            JOptionPane.showMessageDialog(null,"Welcome To NCT Center");
        }

    }


}

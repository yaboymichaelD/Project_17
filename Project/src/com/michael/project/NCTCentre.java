package com.michael.project;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class NCTCentre extends JFrame implements ActionListener{

    private JMenu fileMenu;
    private JMenu editMenu;
    private JTextField txtfield;


    //Initialise Array for Cars (Must create looping structure for this)
    Car car1 = new Car();
    ArrayList<Car> cars;

    //Initialise Array for Customers
    //Customer [] ncttest = new Customer[5];

    public NCTCentre()
    {
        setTitle("NCT Center");
        setSize(800,800);
        setResizable(true);
        setLocation(500,500);
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

              CreateTest ct = new CreateTest();
              ct.createTestFrame.setVisible(true);

                //Initially looking to create Customers from here. Inheritance causing problems.
                //for(int x=0; x<=5; x++) {

                //((JOptionPane.showInputDialog("Please Enter Drivers Name", "Test Creator")));

                //ncttest[x]=new Customer(firstName,lastName,address,phoneNum,licenceNum);
            }
        }

    }




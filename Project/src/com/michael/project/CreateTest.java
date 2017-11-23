package com.michael.project;

import javax.swing.*;
import java.awt.*;
import java.util.*;



public class CreateTest extends Customer {
    JFrame createTestFrame;
    double random = Math.random() * 1000000 + 100000000;

    public CreateTest() {

        //Initialise Array for Customers
        Customer[] ncttest = new Customer[5];


        //This Creates the Frame which is called within NCTCENTRE
        createTestFrame = new JFrame();
        createTestFrame.setTitle("Register Test For Customer");
        createTestFrame.setSize(1000, 1000);
        createTestFrame.setResizable(true);
        createTestFrame.setLocation(500, 500);
        createTestFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container cpane;
        cpane = createTestFrame.getContentPane();
        cpane.setLayout(new FlowLayout());

        //Gonna just set the looping Structure to 5 atm , will change in the future
        for (int x = 0; x <= 5; x++) {

            setFirstName((JOptionPane.showInputDialog(null,"Please Enter Customers First Name", "Customers Credentials")));
            setLastName((JOptionPane.showInputDialog(null,"Please Enter Customers Last Name", "Customers Credentials")));
            setAddress((JOptionPane.showInputDialog(null,"Please Enter Customers Address", "Customers Credentials")));
            setPhoneNum((Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter Customers Phone Number", "Customers Credentials"))));
            setLicenceNum((Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter Customers Licence Number", "Customers Credentials"))));
            setTestId(random);
            //Must Add CustID , TestID
            ncttest[x] = new Customer(getFirstName(), getLastName(), getAddress(), getPhoneNum(), getLicenceNum());

            display(ncttest);

        }}

        //trying to display customers
        public static void display(Customer[] ncttest) {

        JOptionPane.showMessageDialog(null,ncttest);


    }

}

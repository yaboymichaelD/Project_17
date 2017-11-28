package com.michael.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class NCTMainGUI extends JFrame {

    public NCTMainGUI() {

        //Sets Attributes of main GUI
        setTitle("Main GUI Unit");
        setSize(600, 800);
        setResizable(true);
        setLocation(0, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creates Buttons
        JButton adminButton = new JButton("Administrator");
        JButton testButton = new JButton("Test Car");

        Container cpane = getContentPane();
        //Sets layout and Adds Buttons to Contentpane
        cpane.setLayout(new FlowLayout());
        cpane.add(adminButton);
        cpane.add(testButton);


        //Used to open up instances of other classes via JButtons

        //Adds Action Listener to Admin Button
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NCTCentre nct = new NCTCentre();
                nct.setVisible(true);
            }
        });

        //Adds Actions Listener to Customer Button
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NCTTest ncttest = new NCTTest();
                ncttest.setVisible(true);
            }
        });
    }


        //Main

    public static void main(String[] args) throws IOException {
        NCTMainGUI gui = new NCTMainGUI();
        gui.setVisible(true);
    }


}

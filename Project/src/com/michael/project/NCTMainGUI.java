package com.michael.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        JButton custButton = new JButton("Customer");

        Container cpane = getContentPane();
        //Sets layout and Adds Buttons to Contentpane
        cpane.setLayout(new FlowLayout());
        cpane.add(adminButton);
        cpane.add(custButton);


        //Used to open up instances of other classes via JButtons

        //Adds Action Listener to Admin Button
        adminButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {



            }
        });

        //Adds Actions Listener to Customer Button
        custButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }






    //Main
    public static void main(String[]args){
        NCTMainGUI gui = new NCTMainGUI();
        gui.setVisible(true);
    }
}

package com.michael.project;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;


public class NCTTest extends JFrame implements ActionListener,Serializable {

    ArrayList<Customer> customerlist = new ArrayList<Customer>();

    public NCTTest() {
        setTitle("NCT Center");
        setSize(800, 800);
        setResizable(true);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Display Customers")) {


            try {
                loadFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            // create a combo box
            JComboBox names = new JComboBox();
            // add all the names into it
            for (Customer pp : customerlist)
                names.addItem(pp.getFirstName());
            // Allow the user to pick one name from the combo box
            JOptionPane.showMessageDialog(null, names, "Person list", JOptionPane.PLAIN_MESSAGE);
            // find the index position of the one selected
            int idx = names.getSelectedIndex();
            // display this item from the array
            JOptionPane.showMessageDialog(null, "The person you picked was person no " + idx +
                    " whose full details are as follows: \n" + customerlist.get(idx).toString());

        }
    }

    //Not working at the moment doe not load into JCombo or displays on Println
    public void loadFile() throws IOException {


        //ArrayList<Customer> customerlist = new ArrayList<Customer>();
        boolean keepgoing = true;
        try {
            File inFile = new File("customers.dat");
            FileInputStream inFileStream = new FileInputStream(inFile);
            ObjectInputStream in = new ObjectInputStream(inFileStream);
            customerlist = (ArrayList<Customer>) in.readObject();
            System.out.println(customerlist);
            for (Customer c : customerlist) {

                //JOptionPane.showMessageDialog(null,c.toString());

            }
        } catch (Exception e) {


        }


    }
}








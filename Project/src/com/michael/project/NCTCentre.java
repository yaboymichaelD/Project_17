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
    Customer [] ncttest = new Customer[5];

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

    private void CreateEditMenu(){
        JMenuItem viewusers;
        fileMenu = new JMenu("View All Tests");
    }

    private void CreateFileMenu(){
        JMenuItem test ;
        editMenu = new JMenu("Test");
        test = new JMenuItem("Create NCT Test");
        test.addActionListener(this);
        editMenu.add(test);

    }
    //This Event handles the Create NCT Test JMenu Item.
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Create NCT Test"))
        {
            for (int x = 0; x <= 5; x++) {
                //Car car = makeCar();
                Customer customer = makeCustomer();

                //PREVIOUSLY CREATED NEW FRAME AND PROMPTED TO ENTER THERE. NOW USING MAKE CAR
                //CreateTest ct = new CreateTest();
                //ct.createTestFrame.setVisible(true);

                ncttest[x] = new Customer();

                JOptionPane.showMessageDialog(null,ncttest);

                }
            }
        }

    private static Car makeCar() {
        String make, model, reg;
        int year, numdoors, numowners;
        double kms;

        make = JOptionPane.showInputDialog(null, "Please Enter the Make of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        model = JOptionPane.showInputDialog(null, "Please Enter the Model of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        reg = JOptionPane.showInputDialog(null, "Please Enter the Reg of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Year of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        numdoors = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number of Doors the Vehicle has", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        numowners = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number of Owners the Vehicle has had", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        kms = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number of Kilometers of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));

        Car car = new Car(make, model, year, kms, numdoors, numowners, reg);
        return car;


    }

    private static Customer makeCustomer(){
        String firstName,lastName,address;
        int phoneNum,licenceNum;
        double testId;
        double random = Math.random() * 1000000 + 100000000;

        firstName =((JOptionPane.showInputDialog(null,"Please Enter Customers First Name", "Customers Credentials",JOptionPane.QUESTION_MESSAGE)));
        lastName =((JOptionPane.showInputDialog(null,"Please Enter Customers Last Name", "Customers Credentials",JOptionPane.QUESTION_MESSAGE)));
        address = ((JOptionPane.showInputDialog(null,"Please Enter Customers Address", "Customers Credentials",JOptionPane.QUESTION_MESSAGE)));
        phoneNum = ((Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter Customers Phone Number", "Customers Credentials",JOptionPane.QUESTION_MESSAGE))));
        licenceNum = ((Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter Customers Licence Number", "Customers Credentials",JOptionPane.QUESTION_MESSAGE))));
        testId= (random);

        Customer customer = new Customer(firstName,lastName,address,phoneNum,licenceNum,testId);
        return customer;
    }

    }




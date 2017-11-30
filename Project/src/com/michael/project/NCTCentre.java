package com.michael.project;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;

public class NCTCentre extends JFrame implements ActionListener,Serializable {

    private JMenu fileMenu;
    private JMenu editMenu;
    private JTextField txtfield;


    //Initialise Array for Cars (Must create looping structure for this)
    Car car1 = new Car();
    List<Car> cars = new ArrayList<Car>();

    //Initialise Array for Customers
    List<Customer> customerlist = new ArrayList<Customer>();


    public NCTCentre() {
        setTitle("NCT Center");
        setSize(500, 500);
        setResizable(true);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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

    private void CreateFileMenu() {
        JMenuItem test;
        fileMenu = new JMenu("Test");
        test = new JMenuItem("Create NCT Test");
        test.addActionListener(this);
        fileMenu.add(test);

    }

    private void CreateEditMenu() {
        JMenuItem options;
        editMenu = new JMenu("Options");
        options = new JMenuItem("Exit to MainMenu");
        options.addActionListener(this);
        editMenu.add(options);
    }



    //This Event handles the Create NCT Test JMenu Item.
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Create NCT Test")) {
            while (JOptionPane.showConfirmDialog(null, "Make Customer?") == JOptionPane.YES_OPTION) {

                Customer customer = makeCustomer();
                customerlist.add(customer);
                Car car = makeCar();
                cars.add(car);

            }

            //System.out.println(customerlist);
            System.out.println(cars);

            try {
                save();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            try {
                saveCar();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            if (e.getActionCommand().equals("Exit to MainMenu")) {
                setVisible(false);

            }

        }

    }

    private static Car makeCar() {
        String make, model, reg;
        int year, numdoors, ownerslicence;
        double kms;

        make = JOptionPane.showInputDialog(null, "Please Enter the Make of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        model = JOptionPane.showInputDialog(null, "Please Enter the Model of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        reg = JOptionPane.showInputDialog(null, "Please Enter the Reg of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE);
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Year of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        numdoors = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number of Doors the Vehicle has", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        ownerslicence = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number of Owners the Vehicle has had", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));
        kms = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter the Number of Kilometers of the Vehicle", "Enter Car Details", JOptionPane.QUESTION_MESSAGE));

        Car car = new Car(make, model, year, kms, numdoors, ownerslicence, reg);
        return car;


    }

    private static Customer makeCustomer() {
        String firstName, lastName, address;
        int phoneNum, licenceNum;
        double testId;
        double random = Math.random() * 1000000 + 100000000;

        firstName = ((JOptionPane.showInputDialog(null, "Please Enter Customers First Name", "Customers Credentials", JOptionPane.QUESTION_MESSAGE)));
        lastName = ((JOptionPane.showInputDialog(null, "Please Enter Customers Last Name", "Customers Credentials", JOptionPane.QUESTION_MESSAGE)));
        address = ((JOptionPane.showInputDialog(null, "Please Enter Customers Address", "Customers Credentials", JOptionPane.QUESTION_MESSAGE)));
        phoneNum = ((Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Customers Phone Number", "Customers Credentials", JOptionPane.QUESTION_MESSAGE))));
        licenceNum = ((Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Customers Licence Number", "Customers Credentials", JOptionPane.QUESTION_MESSAGE))));
        testId = (random);

        Customer customer = new Customer(firstName, lastName, address, phoneNum, licenceNum);
        return customer;

        }

            private void save() throws IOException {
                System.out.println(customerlist);
                File outFile = new File("customers.dat");
                FileOutputStream fileOut = new FileOutputStream(outFile);
                ObjectOutputStream os = new ObjectOutputStream(fileOut);
                os.writeObject(customerlist);
                os.close();

            }

            private void saveCar() throws IOException{
                File outFile = new File("cars.dat");
                FileOutputStream fileOut = new FileOutputStream(outFile);
                ObjectOutputStream os = new ObjectOutputStream(fileOut);
                os.writeObject(cars);
                os.close();
            }




}





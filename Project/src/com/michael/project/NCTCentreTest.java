package com.michael.project;

import javax.swing.*;

public class NCTCentreTest {
   public static void main(String args []){
      //Testing Customer Object
      Customer c1 = new Customer();
      c1.setFirstName("Michael");
      c1.setLastName("O'Sullivan");
      c1.setAddress("Glengarriff");
      c1.setLicenceNum(00012);
      c1.setPhoneNum(02131232);

       JOptionPane.showMessageDialog(null,c1.toString(),"Test",JOptionPane.INFORMATION_MESSAGE);
   }
}

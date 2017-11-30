package com.michael.project;


import java.io.Serializable;

public class Customer extends Person implements Serializable {

    //attributes
    private double testId;
    private int custNum;


    public Customer() {
        super(); //Gets details from super class eg.Person
        testId = 0;
        custNum = 0;

    }

    //Must add testId + CustNum to this constructor
    public Customer(String firstName, String lastName, String address, int phoneNum, int licenceNum) {
        //Grabs Attributes from Super Class AKA Person
        super(firstName, lastName, address, phoneNum, licenceNum);
        this.testId = testId;
        this.custNum = custNum;

    }

    //Setters
    public void setTestId(double testId) {
        this.testId = testId;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    //Getters
    public double getTestId(double testId) {
        return testId;
    }

    public int getCustNum(int custNum) {
        return custNum;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

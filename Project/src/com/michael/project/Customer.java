package com.michael.project;



public class Customer extends Person {

    //attributes
    private double testId;
    private int custNum;


    public Customer()
    {
        super(); //Figure this out.
        testId = 0;
        custNum = 0;

    }
    //Must add testId + CustNum to this constructor
    public Customer(String firstName,String lastName,String address,int phoneNum,int licenceNum)
    {
        //Grabs Attributes from Super Class AKA Person
        super(firstName,lastName,address,phoneNum,licenceNum);
        this.testId = testId;
        this.custNum = custNum;

    }

    //Setters
    public void setTestId(double testId){
        this.testId = testId;
    }
    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    //Getters
    public double getTestId(double testId)
    {
        return testId;
    }
    public int getCustNum(int custNum)
    {
        return custNum;
    }
}

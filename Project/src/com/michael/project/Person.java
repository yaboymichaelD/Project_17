package com.michael.project;

public class Person {

    //Attributes
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNum;
    private int licenceNum;

    //no args constructor
    public Person()
    {
        this("unknown","unknown","unknown",0,0);
    }

    //Multi arg constructor
    public Person(String firstName, String lastName,String address,int phoneNum , int licenceNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.licenceNum = licenceNum;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setLicenceNum(int licenceNum) {
        this.licenceNum = licenceNum;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public int getLicenceNum() {
        return licenceNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum=" + phoneNum +
                ", licenceNum=" + licenceNum +
                '}';
    }
}

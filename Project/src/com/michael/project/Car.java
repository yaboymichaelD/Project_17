package com.michael.project;

public class Car {

    //Cars Attributes
    private String make;
    private String model;
    private String registration;
    private int year;
    private double kms;
    private int numDoors;
    private int numOwners;


    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setNumOwners(int numOwners) {
        this.numOwners = numOwners;
    }

    public void setRegistration(String registration){this.registration = registration;}

    //Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getKms() {
        return kms;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getNumOwners() {
        return numOwners;
    }

    public String getRegistration() {return registration;}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                ", year=" + year +
                ", kms=" + kms +
                ", numDoors=" + numDoors +
                ", numOwners=" + numOwners +
                '}';
    }
}

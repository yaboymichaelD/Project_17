package com.michael.project;

import java.io.Serializable;

public class Car implements Serializable {

    //Cars Attributes
    private String make;
    private String model;
    private String registration;
    private int year;
    private double kms;
    private int numDoors;
    private int ownersLicence;

    //No Argument Constructor for a Car object
    public Car(){
        this("unknown","unknown",0,0,0,0,"unknown");
    }
    //Multi Argument Constructor for a Car object
    public Car(String make,String model,int year, double kms,int numDoors, int ownersLicence, String registration)
    {
        setMake(make);
        setModel(model);
        setYear(year);
        setKms(kms);
        setNumDoors(numDoors);
        setNumOwners(ownersLicence);
        setRegistration(registration);
    }
    public Car(String make,String model)
    {
        setMake(make);
        setModel(model);
    }
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

    public void setNumOwners(int ownersLicence) {
        this.ownersLicence = ownersLicence;
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

    public int getOwnersLicence() {
        return ownersLicence;
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
                ", numOwners=" + ownersLicence +
                '}';
    }
}

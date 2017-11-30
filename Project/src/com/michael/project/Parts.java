package com.michael.project;

public class Parts extends Car {
    private String tires;
    private String seatbelts;
    private String suspension;
    private String exhausts;
    private String lights;

    public Parts(){
            super();
            tires = "Null Quality";
            seatbelts = "Null Quality";
            suspension = "Null Quality";
            exhausts = "Null Quality";
            lights = "Null Quality";
        //this("Null Quality","Null Quality","Null Quality","Null Quality","Null Quality");
    }

    public Parts(String make,String model,String tires,String seatbelts,String suspension,String exhausts,String lights){
        super(make,model); //2 arg constructor inside Car
        setTires(tires);
        setSeatbelts(seatbelts);
        setSuspension(suspension);
        setExhausts(exhausts);
        setLights(lights);
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setSeatbelts(String seatbelts) {
        this.seatbelts = seatbelts;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void setExhausts(String exhausts) {
        this.exhausts = exhausts;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public String getTires() {
        return tires;
    }

    public String getSeatbelts() {
        return seatbelts;
    }

    public String getSuspension() {
        return suspension;
    }

    public String getExhausts() {
        return exhausts;
    }

    public String getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "tires='" + tires + '\'' +
                ", seatbelts='" + seatbelts + '\'' +
                ", suspension='" + suspension + '\'' +
                ", exhausts='" + exhausts + '\'' +
                ", lights='" + lights + '\'' +
                '}';
    }
}

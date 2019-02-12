package com.example.unittesting;

public class Car extends MotorVehicle {
    private int numOfDoors;
    private String color;
    private boolean isFourWHeelDrive;
    private AutomotiveInformation automotiveInformation;

    public Car() {
    }

    public Car(String enging, String axels, String transmission, int numOfDoors, String color, boolean isFourWHeelDrive, AutomotiveInformation automotiveInformation) {
        super(enging, axels, transmission);
        this.numOfDoors = numOfDoors;
        this.color = color;
        this.isFourWHeelDrive = isFourWHeelDrive;
        this.automotiveInformation = automotiveInformation;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFourWHeelDrive() {
        return isFourWHeelDrive;
    }

    public void setFourWHeelDrive(boolean fourWHeelDrive) {
        isFourWHeelDrive = fourWHeelDrive;
    }

    public AutomotiveInformation getAutomotiveInformation() {
        return automotiveInformation;
    }

    public void setAutomotiveInformation(AutomotiveInformation automotiveInformation) {
        this.automotiveInformation = automotiveInformation;
    }
}

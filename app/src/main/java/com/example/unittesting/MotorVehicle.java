package com.example.unittesting;

public class MotorVehicle {
    private String enging;
    private String axels;
    private String transmission;

    public MotorVehicle() {
    }

    public MotorVehicle(String enging, String axels, String transmission) {
        this.enging = enging;
        this.axels = axels;
        this.transmission = transmission;
    }

    public String getEnging() {
        return enging;
    }

    public void setEnging(String enging) {
        this.enging = enging;
    }

    public String getAxels() {
        return axels;
    }

    public void setAxels(String axels) {
        this.axels = axels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}

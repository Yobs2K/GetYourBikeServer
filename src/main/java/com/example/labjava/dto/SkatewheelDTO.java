package com.example.labjava.dto;

public class SkatewheelDTO {

    private String name;

    private String shortDesc;

    private String fullDesc;

    private Double wheelSize; //Диаметр колёс, мм

    private String wheelHardness; //Жёсткость колёс, а-ля 95A

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public Double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelHardness() {
        return wheelHardness;
    }

    public void setWheelHardness(String wheelHardness) {
        this.wheelHardness = wheelHardness;
    }
}

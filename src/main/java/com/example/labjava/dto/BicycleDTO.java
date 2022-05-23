package com.example.labjava.dto;

public class BicycleDTO {

    private String name;

    private String shortDesc;

    private String fullDesc;

    private String frameType;

    private Double frameSize;

    private Double wheelSize;

    private String style;

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

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public Double getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Double frameSize) {
        this.frameSize = frameSize;
    }

    public Double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
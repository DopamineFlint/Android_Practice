package com.example.androidapp1.models;

public class RadiusPoint {
    private int radiusX = 0;
    private int radiusY = 0;

    public RadiusPoint(int radiusX, int radiusY) {
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }

    public void setRadiusX(int radiusX) {
        this.radiusX = radiusX;
    }

    public void setRadiusY(int radiusY) {
        this.radiusY = radiusY;
    }
}

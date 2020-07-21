package com.example.androidapp1.models;

public class Point {
    private float xAxis = 0;
    private float yAxis = 0;

    public Point(float x, float y) {
        this.xAxis = x;
        this.yAxis = y;
    }

    public float getxAxis() {
        return xAxis;
    }

    public float getyAxis() {
        return yAxis;
    }

    public void setxAxis(float x) {
        this.xAxis = x;
    }

    public void setyAxis(float y) {
        this.yAxis = y;
    }
}
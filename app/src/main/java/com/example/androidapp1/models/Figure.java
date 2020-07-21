package com.example.androidapp1.models;

import android.graphics.Canvas;

public abstract class Figure {
    private Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract void draw(Canvas canvas);

    public Point getPoint() {
        return point;
    }

    public void moveTo(float x, float y) {
        point.setxAxis(x);
        point.setyAxis(y);
    }
}

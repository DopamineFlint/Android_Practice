package com.example.androidapp1.models;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rectangle extends Square {
    Paint paint = new Paint();
    private float height;

    @Override
    public void draw(Canvas canvas) {
       canvas.drawRect(getPoint().getxAxis(), getPoint().getyAxis(),
               getPoint().getxAxis() + getEdgeSize(),
               getPoint().getyAxis() + getHeight(), paint);
    }

    public Rectangle(Point point, float width, float height) {
        super(point, width);
        this.height = height;
    }

    @Override
    public void changeColor(int color) {
        if (color == 1) {
            paint.setColor(Color.BLUE);
        }

        if (color == 2) {
            paint.setColor(Color.BLACK);
        }

        if (color == 3) {
            paint.setColor(Color.GREEN);
        }

        if (color == 4) {
            paint.setColor(Color.RED);
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

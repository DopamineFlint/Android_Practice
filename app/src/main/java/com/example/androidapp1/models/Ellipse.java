package com.example.androidapp1.models;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ellipse extends Circle implements ColorChangeable {
    private int radius2 = 0;
    private Paint paint = new Paint();

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

    public Ellipse(Point point, int radius, int radius2) {
        super(point, radius);
        this.radius2 = radius2;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawOval(getPoint().getxAxis(), getPoint().getyAxis(),
                getPoint().getxAxis()+getRadius2()*2,
                getPoint().getyAxis()+getRadius2()*2, paint);
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}

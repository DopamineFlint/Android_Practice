package com.example.androidapp1.models;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Figure {
    private Paint paint = new Paint();
    private int radius = 0;

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        canvas.drawCircle(getPoint().getxAxis(), getPoint().getyAxis(), radius, paint);
    }

    public Circle(Point p, int radius) {
        super(p);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

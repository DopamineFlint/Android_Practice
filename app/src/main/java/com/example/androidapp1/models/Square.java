package com.example.androidapp1.models;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Square extends Figure implements ColorChangeable {
    private float edgeSize;
    Paint paint = new Paint();

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(getPoint().getxAxis(), getPoint().getyAxis(),
                getPoint().getxAxis() + edgeSize,
                getPoint().getyAxis() + edgeSize, paint);
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

    public Square(Point point, float edgeSize) {
        super(point);
        this.edgeSize = edgeSize;
    }

    public float getEdgeSize() {
        return edgeSize;
    }

    public void setEdgeSize(float edgeSize) {
        this.edgeSize = edgeSize;
    }
}

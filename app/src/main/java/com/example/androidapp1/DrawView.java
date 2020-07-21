package com.example.androidapp1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/*public class DrawView extends View {
    Paint p;
    Rect rect;
    private int counter = 0;
    private float y = 0;
    private float yy = 0;

    DrawView(Context context) {
        super(context);
        Button btn = findViewById(R.id.button);
        init();
    }

    private void init() {
        boolean isUpdate;
        p = new Paint();
        rect = new Rect();
        Bundle transporter = ((Activity)getContext()).getIntent().getExtras();

        if (transporter != null) {
            yy = transporter.getFloat("arg");
        }

        p.setColor(Color.BLACK);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(75);
                        yy++;
                        postInvalidate();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /*public void setX(float x) {
        this.x = x;
    }*/

    /*public void setY(float y) {
        this.y = y;
    }*/

    /*public float getX() {
        return x;
    }*/

    /*public float getY() {
        return y;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = widthMeasureSpec;
        int height = heightMeasureSpec;
        super.onMeasure(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float x = canvas.getWidth() / 2;
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(x, yy, 30, p);
    }
}*/

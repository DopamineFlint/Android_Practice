package com.example.androidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.androidapp1.models.Circle;
import com.example.androidapp1.models.Ellipse;
import com.example.androidapp1.models.Point;
import com.example.androidapp1.models.Rectangle;
import com.example.androidapp1.models.Square;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonLeft;
    private Button buttonRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        buttonLeft = findViewById(R.id.buttonLeft);
        buttonRight = findViewById(R.id.buttonRight);
        FrameLayout fl = (FrameLayout) findViewById(R.id.canvasLayout);
        fl.addView(new DrawView(this));
    }

    public void onClickUp(View v) {
        DrawView.setAngle(1);
    }

    public void onClickDown(View v) {
        DrawView.setAngle(2);
    }

    public void onClickLeft(View v) {
        DrawView.setAngle(3);
    }

    public void onClickRight(View v) {
        DrawView.setAngle(4);
    }

    public void onClickStop(View v) {
        DrawView.setAngle(0);
    }

    public void onClickChangeFigure(View v) {
        DrawView.changeFigure();
    }

    public void onClickColor(View v) {
        DrawView.changeColor();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DrawView.setBoolToFalse();
    }

    //////////////////////////
    //here goes static class//
    //////////////////////////

    public static class DrawView extends View {
        private static Paint p;
        private static Rect rect;
        private static float yy = 200;
        private static float xx = 300;
        private static int angle = 0;
        private static boolean isTrue = true;
        private static int rad = 30;
        private static int figure = 1;
        private static int color = 1;
        private static int ovalX = 60;
        private static int ovalY = 60;
        Circle circle = new Circle(new Point(xx, yy), 100);
        Square square = new Square(new Point(xx, yy), 20);
        Ellipse ellipse = new Ellipse(new Point(xx, yy),100, 50);
        Rectangle rectangle = new Rectangle(new Point(xx, yy), 100, 150);

        DrawView(Context context) {
            super(context);
            init();
        }

        private void init() {
            p = new Paint();
            rect = new Rect();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(isTrue) {
                        try {
                            if (angle == 1) { //going up
                                Thread.sleep(10);
                                yy--;
                                postInvalidate();
                            }
                            if (angle == 2) { //going down
                                Thread.sleep(10);
                                yy++;
                                postInvalidate();
                            }
                            if (angle == 3) { //going left
                                Thread.sleep(10);
                                xx--;
                                postInvalidate();
                            }
                            if (angle == 4) { //going right
                                Thread.sleep(10);
                                xx++;
                                postInvalidate();
                            }

                            if (angle == 1 && figure == 2) {
                                Thread.sleep(10);
                                yy--;
                                ovalY--;
                                postInvalidate();
                            }
                            if (angle == 2 && figure == 2) {
                                Thread.sleep(10);
                                yy++;
                                ovalY++;
                                postInvalidate();
                            }
                            if (angle == 3 && figure == 2) {
                                Thread.sleep(10);
                                xx--;
                                ovalX--;
                                postInvalidate();
                            }
                            if (angle == 4 && figure == 2) {
                                Thread.sleep(10);
                                xx++;
                                ovalX++;
                                postInvalidate();
                            }

                            if (angle == 4 && figure == 3) {
                                Thread.sleep(10);
                                circle.moveTo(xx++, yy);
                                postInvalidate();
                            }
                            if (angle == 3 && figure == 3) {
                                Thread.sleep(10);
                                circle.moveTo(xx--, yy);
                                postInvalidate();
                            }
                            if (angle == 2 && figure == 3) {
                                Thread.sleep(10);
                                circle.moveTo(xx, yy++);
                                postInvalidate();
                            }
                            if (angle == 1 && figure == 3) {
                                Thread.sleep(10);
                                circle.moveTo(xx, yy--);
                                postInvalidate();
                            }

                            if (angle == 1 && figure == 4) { //4
                                Thread.sleep(10);
                                square.moveTo(xx, yy--);
                                postInvalidate();
                            }
                            if (angle == 2 && figure == 4) {
                                Thread.sleep(10);
                                square.moveTo(xx, yy++);
                                postInvalidate();
                            }
                            if (angle == 3 && figure == 4) {
                                Thread.sleep(10);
                                square.moveTo(xx--, yy);
                                postInvalidate();
                            }
                            if (angle == 4 && figure == 4) {
                                Thread.sleep(10);
                                square.moveTo(xx++, yy);
                                postInvalidate();
                            }

                            if (angle == 1 && figure == 5) { //4
                                Thread.sleep(10);
                                ellipse.moveTo(xx, yy--);
                                postInvalidate();
                            }
                            if (angle == 2 && figure == 5) {
                                Thread.sleep(10);
                                ellipse.moveTo(xx, yy++);
                                postInvalidate();
                            }
                            if (angle == 3 && figure == 5) {
                                Thread.sleep(10);
                                ellipse.moveTo(xx--, yy);
                                postInvalidate();
                            }
                            if (angle == 4 && figure == 5) {
                                Thread.sleep(10);
                                ellipse.moveTo(xx++, yy);
                                postInvalidate();
                            }

                            if (angle == 1 && figure == 6) { //4
                                Thread.sleep(10);
                                rectangle.moveTo(xx, yy--);
                                postInvalidate();
                            }
                            if (angle == 2 && figure == 6) { //4
                                Thread.sleep(10);
                                rectangle.moveTo(xx, yy++);
                                postInvalidate();
                            }
                            if (angle == 3 && figure == 6) { //4
                                Thread.sleep(10);
                                rectangle.moveTo(xx--, yy);
                                postInvalidate();
                            }
                            if (angle == 4 && figure == 6) { //4
                                Thread.sleep(10);
                                rectangle.moveTo(xx++, yy);
                                postInvalidate();
                            }

                            if (angle == 0) {
                                Thread.sleep(10);
                                postInvalidate();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        public static void changeFigure() {
            if (figure < 6) {
                figure++;
            } else {
                figure = 1;
            }
        }

        public static void changeColor() {
            if (color < 3) {
                color++;
            } else {
                color = 1;
            }
        }

        public static void setXaxis(float x) {
            xx = x;
        }

        public static void setYaxis(float y) {
            yy = y;
        }

        public static float getXaxis() {
            return xx;
        }

        public static float getYaxis() {
            return yy;
        }

        public static void setBoolToFalse() {
            isTrue = false;
        }

        public static void setAngle(int a) {
            angle = a;
            isTrue = true;
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int width = widthMeasureSpec;
            int height = heightMeasureSpec;
            super.onMeasure(width, height);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            canvas.drawColor(Color.WHITE);

            if (figure == 1) {
                canvas.drawCircle(xx, yy, rad, p);
            }
            if (figure == 2) {
                canvas.drawOval(xx, yy, ovalX*2, ovalY*2, p);
            }
            if (figure == 3) {
                circle.draw(canvas);
            }
            if (figure == 4) {
                square.draw(canvas);
            }
            if (figure == 5) {
                ellipse.draw(canvas);
            }
            if (figure == 6) {
                rectangle.draw(canvas);
            }

            square.changeColor(color);
            ellipse.changeColor(color);
            rectangle.changeColor(color);
        }
    }
}

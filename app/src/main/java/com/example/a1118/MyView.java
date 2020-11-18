package com.example.a1118;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class MyView extends View {
    //Paint 객체 배열 생성
    private Paint[] mForegrounds = { makePaint(Color.BLACK), makePaint(Color.BLUE), makePaint(Color.GREEN), makePaint(Color.RED) };
    //r 랜덤 객체 생성
    private static Random r = new Random();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //캔버스 배경색 지정
        canvas.drawColor(Color.YELLOW);
        //x축 좌표 설정
        int width = getWidth();
        //y축 좌표
        int height = getHeight();
        //무작위 원 20개 생성
        for (int i = 0; i < 20; i++) {
            //랜덤한 위치 x축 좌표를 설정
            float x = r.nextInt(width);
            float y = r.nextInt(height);
            //랜덤한 반지름 값 생성
            float radius = r.nextInt(80);
            //색상은 Paint 객체 배열의 값을 사용
            Paint circleColor = mForegrounds[r.nextInt(mForegrounds.length)];
            //원을 그림
            canvas.drawCircle(x, y, radius, circleColor);
        }
    }

    private Paint makePaint(int color) {
        //paint 객체 P 생성
        Paint p = new Paint();
        //p의 생상을 매개변수로 받은 색으로 지정 함
        p.setColor(color);
        //p 객체 리턴
        return (p);
    }
}
package com.example.a1118;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;



public class MyView2 extends View {
    public MyView2(Context context) {
        super(context);
    }

    public MyView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //paint 객체 생성
        Paint paint = new Paint();
        //비트맵을 이용하여 R.drawable.cat 사진 출력
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        //비트맵을 캠버스에  표시
        canvas.drawBitmap(b, 0, 0, null);
    }
}


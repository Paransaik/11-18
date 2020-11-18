package com.example.a1118;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MyView2 객체 생성
        MyView2 w = new MyView2(this);
        //w을 화면에 뿌려줌
        setContentView(w);
    }
}
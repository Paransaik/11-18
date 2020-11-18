package com.example.a1118;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //MyView 객체 생성
    private MyView mMyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.layout.activity_main을 화면에 뿌려줌
        setContentView(R.layout.activity_main);
        //myView를 xml myView와 맵핑
        mMyView = (MyView) findViewById(R.id.myview);
    }

    public void redraw(View v) {
        //onDraw호출
        mMyView.invalidate();
    }

    public void openActivity2() {
        //MainActivity2호출
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //메뉴 생성
        MenuInflater inflater = getMenuInflater();
        //메뉴 xml 매핑
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //메뉴 item 생성
        int id = item.getItemId();
        //메뉴 menu1일 경우 MainActivity2호출
        if (id == R.id.menu1) openActivity2();
        //메뉴 menu2일 경우 앱 종료
        if (id == R.id.menu2) moveTaskToBack(true);
        return super.onOptionsItemSelected(item);
    }
}
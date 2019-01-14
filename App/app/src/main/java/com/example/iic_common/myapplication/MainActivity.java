package com.example.iic_common.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Atmega;
    Button Aduino;
    Button com;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Idwn");
        // 버튼 선언
        com=(Button)findViewById(R.id.com);
        // 버튼 기능 구현
        com.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setTitle("com");
            }
        });
    }
}

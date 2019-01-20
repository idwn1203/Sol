package com.example.iic_common.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Atmega;
    Button Aduino;
    Button Start;
    Button Stop;
    Button Send;


    private MediaRecorder mRecorder = null;
    int cnt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Idwn");
        // 버튼 선언
        Start = (Button) findViewById(R.id.Start);
        Stop = (Button) findViewById(R.id.Stop);
        Send = (Button) findViewById(R.id.Send);
        // 버튼 기능 구현

        Start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cnt =1;
                StartRec();
                //StartRec();
                //CompareVoice();
                //SendVoice();
            }
        });
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt =2;
                StopRec();
            }
        });
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompareVoice();
                if (cnt == 1)
                    Toast.makeText(getApplicationContext(), "일치", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "불일치", Toast.LENGTH_SHORT).show();
            }

        });

    }
/*
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.On:
                break;
            case R.id.Off:
                break;
        }
    }*/

    private void StartRec() {
        setTitle("Start");
        //mRecorder = new MediaRecorder();
        //mRecorder.start();
    }

    private void StopRec() {
        setTitle("Stop");
        // mRecorder.stop();
    }

    private void SendVoice() {
        setTitle("test2");
    }

    private void CompareVoice() {
        setTitle("Controller");
    }
}



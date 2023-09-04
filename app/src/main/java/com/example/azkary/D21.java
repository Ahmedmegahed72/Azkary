package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D21 extends AppCompatActivity {
    ImageView m211,m212;
    MediaPlayer mp21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d21);

        m211=findViewById(R.id.m211);
        m212=findViewById(R.id.m212);
        mp21=MediaPlayer.create(this,R.raw.s21);

        m211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp21.pause();
            }
        });

        m212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp21.start();
            }
        });
    }
}
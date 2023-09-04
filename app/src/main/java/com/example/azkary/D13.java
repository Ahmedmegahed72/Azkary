package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D13 extends AppCompatActivity {
    ImageView m131,m132;
    MediaPlayer mp13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d13);

        m131 = findViewById(R.id.m131);
        m132 = findViewById(R.id.m132);
        mp13 = MediaPlayer.create(this, R.raw.s13);

        m131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.pause();
            }
        });

        m132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
            }
        });
    }}
package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D16 extends AppCompatActivity {

    ImageView m161,m162;
    MediaPlayer mp16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d16);


        m161 = findViewById(R.id.m161);
        m162 = findViewById(R.id.m162);
        mp16 = MediaPlayer.create(this, R.raw.s16);

        m161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp16.pause();
            }
        });

        m162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp16.start();
            }
        });
    }}
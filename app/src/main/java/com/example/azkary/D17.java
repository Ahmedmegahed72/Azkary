package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D17 extends AppCompatActivity {

    ImageView m171,m172;
    MediaPlayer mp17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d17);

        m171=findViewById(R.id.m171);
        m172=findViewById(R.id.m172);
        mp17=MediaPlayer.create(this,R.raw.s17);

        m171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp17.pause();
            }
        });

        m172.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp17.start();
            }
        });
    }}
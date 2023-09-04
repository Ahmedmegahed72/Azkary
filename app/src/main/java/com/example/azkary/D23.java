package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D23 extends AppCompatActivity {
    ImageView m231,m232;
    MediaPlayer mp23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d23);

        m231=findViewById(R.id.m231);
        m232=findViewById(R.id.m232);
        mp23=MediaPlayer.create(this,R.raw.s23);

        m231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp23.pause();
            }
        });

        m232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp23.start();
            }
        });}}
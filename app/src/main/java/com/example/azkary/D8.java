package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D8 extends AppCompatActivity {

    ImageView m81,m82;
    MediaPlayer mp8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d8);

        m81=findViewById(R.id.m81);
        m82=findViewById(R.id.m82);
        mp8=MediaPlayer.create(this,R.raw.s8);

        m81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.pause();
            }
        });

        m82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });}}

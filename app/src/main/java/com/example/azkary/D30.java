package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D30 extends AppCompatActivity {
    ImageView m301,m302;
    MediaPlayer mp30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d30);
        m301 = findViewById(R.id.m301);
        m302 = findViewById(R.id.m302);
        mp30 = MediaPlayer.create(this, R.raw.s30);

        m301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp30.pause();
            }
        });
    }}
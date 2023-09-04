package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D24 extends AppCompatActivity {
    ImageView m241,m242;
    MediaPlayer mp24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d24);

        m241=findViewById(R.id.m241);
        m242=findViewById(R.id.m242);
        mp24=MediaPlayer.create(this,R.raw.s24);

        m241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp24.pause();
            }
        });

        m242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp24.start();
            }
        });
    }
}
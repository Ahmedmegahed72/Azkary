package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D26 extends AppCompatActivity {
    ImageView m261,m262;
    MediaPlayer mp26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d26);

        m261 = findViewById(R.id.m261);
        m262 = findViewById(R.id.m262);
        mp26 = MediaPlayer.create(this, R.raw.s26);

        m261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp26.pause();
            }
        });

        m262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp26.start();
            }
        });

    }
    }
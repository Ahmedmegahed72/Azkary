package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D4 extends AppCompatActivity {
    ImageView m41,m42;
    MediaPlayer mp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);

        m41=findViewById(R.id.m41);
        m42=findViewById(R.id.m42);
        mp4=MediaPlayer.create(this,R.raw.s4);

        m41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.pause();
            }
        });

        m42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
    }
}
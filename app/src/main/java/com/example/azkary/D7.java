package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D7 extends AppCompatActivity {

    ImageView m71,m72;
    MediaPlayer mp7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d7);

        m71=findViewById(R.id.m71);
        m72=findViewById(R.id.m72);
        mp7=MediaPlayer.create(this,R.raw.s7);

        m71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.pause();
            }
        });

        m72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });
    }
}
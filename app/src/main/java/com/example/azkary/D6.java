package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D6 extends AppCompatActivity {

    ImageView m61,m62;
    MediaPlayer mp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d6);

        m61=findViewById(R.id.m61);
        m62=findViewById(R.id.m62);
        mp6=MediaPlayer.create(this,R.raw.s6);

        m61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.pause();
            }
        });

        m62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
    }
}
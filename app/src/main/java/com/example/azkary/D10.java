package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D10 extends AppCompatActivity {
    ImageView m101,m102;
    MediaPlayer mp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d10);

        m101=findViewById(R.id.m101);
        m102=findViewById(R.id.m102);
        mp10=MediaPlayer.create(this,R.raw.s10);

        m101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.pause();
            }
        });

        m102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
            }
        });
    }
}
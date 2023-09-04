package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D15 extends AppCompatActivity {

    ImageView m151,m152;
    MediaPlayer mp15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d15);

        m151=findViewById(R.id.m151);
        m152=findViewById(R.id.m152);
        mp15=MediaPlayer.create(this,R.raw.s15);

        m151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp15.pause();
            }
        });

        m152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp15.start();
            }
        });
    }
}
package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D25 extends AppCompatActivity {

    ImageView m251,m252;
    MediaPlayer mp25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d25);

        m251=findViewById(R.id.m251);
        m252=findViewById(R.id.m252);
        mp25=MediaPlayer.create(this,R.raw.s25);

        m251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp25.pause();
            }
        });

        m252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp25.start();
            }
        });
    }
}
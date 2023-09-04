package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D5 extends AppCompatActivity {
    ImageView m51,m52;
    MediaPlayer mp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d5);

        m51=findViewById(R.id.m51);
        m52=findViewById(R.id.m52);
        mp5=MediaPlayer.create(this,R.raw.s5);

        m51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.pause();
            }
        });

        m52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
    }
}
package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D18 extends AppCompatActivity {

    ImageView m181,m182;
    MediaPlayer mp18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d18);

        m181=findViewById(R.id.m181);
        m182=findViewById(R.id.m182);
        mp18=MediaPlayer.create(this,R.raw.s18);

        m181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp18.pause();
            }
        });

        m182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp18.start();
            }
        });
    }
}
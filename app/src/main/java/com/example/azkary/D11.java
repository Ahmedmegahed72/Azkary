package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D11 extends AppCompatActivity {
    ImageView m111,m112;
    MediaPlayer mp11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d11);

        m111=findViewById(R.id.m111);
        m112=findViewById(R.id.m112);
        mp11=MediaPlayer.create(this,R.raw.s11);

        m111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.pause();
            }
        });

        m112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
            }
        });

    }
}
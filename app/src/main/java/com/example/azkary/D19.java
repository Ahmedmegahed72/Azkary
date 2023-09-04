package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D19 extends AppCompatActivity {
    ImageView m191,m192;
    MediaPlayer mp19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d19);

        m191=findViewById(R.id.m191);
        m192=findViewById(R.id.m192);
        mp19=MediaPlayer.create(this,R.raw.s19);

        m191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp19.pause();
            }
        });

        m192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp19.start();
            }
        });
    }

}
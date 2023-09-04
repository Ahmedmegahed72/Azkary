package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D14 extends AppCompatActivity {
    ImageView m141,m142;
    MediaPlayer mp14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d14);

        m141=findViewById(R.id.m141);
        m142=findViewById(R.id.m142);
        mp14=MediaPlayer.create(this,R.raw.s14);

        m141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.pause();
            }
        });

        m142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.start();
            }
        });

    }
}
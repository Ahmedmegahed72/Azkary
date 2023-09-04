package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D29 extends AppCompatActivity {
    ImageView m291,m292;
    MediaPlayer mp29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d29);

        m291=findViewById(R.id.m291);
        m292=findViewById(R.id.m292);
        mp29=MediaPlayer.create(this,R.raw.s29);

        m291.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp29.pause();
            }
        });

        m292.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp29.start();
            }
        });
    }
}
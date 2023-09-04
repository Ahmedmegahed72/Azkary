package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D20 extends AppCompatActivity {
    ImageView m201,m202;
    MediaPlayer mp20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d20);

        m201=findViewById(R.id.m201);
        m202=findViewById(R.id.m202);
        mp20=MediaPlayer.create(this,R.raw.s20);

        m201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp20.pause();
            }
        });

        m202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp20.start();
            }
        });
    }
}
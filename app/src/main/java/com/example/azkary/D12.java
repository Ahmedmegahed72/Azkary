package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D12 extends AppCompatActivity {


    ImageView m121,m122;
    MediaPlayer mp12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d12);

        m121=findViewById(R.id.m121);
        m122=findViewById(R.id.m122);
        mp12=MediaPlayer.create(this,R.raw.s12);

        m121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.pause();
            }
        });

        m122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
            }
        });
    }
}
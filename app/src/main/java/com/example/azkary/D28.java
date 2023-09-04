package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D28 extends AppCompatActivity {
    ImageView m281,m282;
    MediaPlayer mp28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d28);

        m281=findViewById(R.id.m281);
        m282=findViewById(R.id.m282);
        mp28=MediaPlayer.create(this,R.raw.s28);

        m281.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp28.pause();
            }
        });

        m282.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp28.start();
            }
        });
    }
}
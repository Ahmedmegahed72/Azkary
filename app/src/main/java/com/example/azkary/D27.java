package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D27 extends AppCompatActivity {
    ImageView m271, m272;
    MediaPlayer mp27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d27);
        Context context = getApplicationContext();

        m271 = findViewById(R.id.m271);
        m272 = findViewById(R.id.m272);
        mp27 = MediaPlayer.create(getApplicationContext(), R.raw.s27);

            m271.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp27.pause();
                }
            });

            m272.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp27.start();
                }
            });

    }
}
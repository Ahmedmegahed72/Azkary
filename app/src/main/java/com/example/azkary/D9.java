package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D9 extends AppCompatActivity {
    ImageView m91,m92;
    MediaPlayer mp9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d9);

        m91=findViewById(R.id.m91);
        m92=findViewById(R.id.m92);
        mp9=MediaPlayer.create(this,R.raw.s9);

        m91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.pause();
            }
        });

        m92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
            }
        });
    }
}
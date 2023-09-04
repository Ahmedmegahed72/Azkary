
package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class D22 extends AppCompatActivity {
    ImageView m221,m222;
    MediaPlayer mp22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d22);

        m221=findViewById(R.id.m221);
        m222=findViewById(R.id.m222);
        mp22=MediaPlayer.create(this,R.raw.s22);

        m221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp22.pause();
            }
        });

        m222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp22.start();
            }
        });
    }
}
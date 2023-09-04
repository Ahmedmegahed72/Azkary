package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    int x=0;
    static  int y=0;
    ProgressBar progress_bar;
    Button sbah,Reset_btn;
    TextView txt_progress,textView2,textView1;
    void show()
    {
        progress_bar.setProgress(x);
        txt_progress.setText(x+"%");
        textView2.setText(y+"");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        progress_bar=findViewById(R.id.prgress_bar);
        sbah=findViewById(R.id.sbah);
        textView2=findViewById(R.id.textView2);
        textView1=findViewById(R.id.textView);
        txt_progress=findViewById(R.id.txt_progress);

        Reset_btn=findViewById(R.id.Reset_btn);
        Reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=y=0;
                show();
            }
        });
        sbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x<=90)
                {
                    x+=10;
                    y+=1;
                    show();

                }
                else
                {
                    x=0;
                    y+=1;
                    show();
                }
            }


        });
    }

}


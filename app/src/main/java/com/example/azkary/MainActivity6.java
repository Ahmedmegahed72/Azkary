package com.example.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity6 extends AppCompatActivity {
    ImageButton btn_sebha,btn_quran,btn_Azkar,btn_Sunah,HsnElmuslim,Ruqia;
    ImageView btn_navigation,setting_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn_sebha=findViewById(R.id.btn_sebha);
        btn_quran=findViewById(R.id.btn_quran);
        btn_Azkar=findViewById(R.id.btn_Azkar);
        TextView textView=findViewById(R.id.setting);
        ImageView setting_img=findViewById(R.id.setting_img);
        setting_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setTextColor(getResources().getColor(R.color.teal_800));
                textView.setBackgroundColor(getResources().getColor(R.color.gray));
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MainActivity4.f=false;
                        finish();
                        System.exit(0);
                    }
                });
            }
        });
        btn_Azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,zekr_activity.class);
                startActivity(intent);
            }
        });
        btn_Sunah=findViewById(R.id.btn_Sunah);
        btn_Sunah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,hadith.class);
                startActivity(intent);
            }
        });
        HsnElmuslim=findViewById(R.id.HsnElmuslim);
        HsnElmuslim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this, list_actvity.class);
                startActivity(intent);
            }
        });
        Ruqia=findViewById(R.id.Ruqia);
        Ruqia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,two_button.class);
                startActivity(intent);
            }
        });
        btn_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,Quran.class);
                startActivity(intent);
            }
        });
        btn_navigation=findViewById(R.id.btn_navigation);

        btn_sebha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class zekr_activity extends AppCompatActivity {
    public static String alAzkarType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zekr);




        Button sabahButton = findViewById(R.id.button_sabah);

        sabahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الصباح";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "sabah");
                startActivity(intent);
            }
        });



        Button masaaButton = findViewById(R.id.button_masaa);

        masaaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار المساء";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "masaa");
                startActivity(intent);
            }
        });

        Button AzanButton = findViewById(R.id.button_azan);

        AzanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الأذان";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Azan");
                startActivity(intent);
            }
        });

        Button NommButton = findViewById(R.id.btn_sleep);

        NommButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار النوم";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Nomm");
                startActivity(intent);
            }
        });
        Button MusicinButton = findViewById(R.id.button_musicin);

        MusicinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الدخول الي المسجد";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Musicin");
                startActivity(intent);
            }
        });
        Button MusicoutButton = findViewById(R.id.button_musicout);

        MusicoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الخروج من المسجد";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Musicout");
                startActivity(intent);
            }
        });
        Button PrayzikrButton = findViewById(R.id.button_prayout);

        PrayzikrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "الذكر بعد الصلاه";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Pray");
                startActivity(intent);
            }
        });




        Button PathinButton = findViewById(R.id.button_pathin);

        PathinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "دعاء الدخول للخلاء";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Pathin");
                startActivity(intent);
            }
        });



        Button PathoutButton = findViewById(R.id.button_pathout);

        PathoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "دعاء الخروج من الخلاء";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Pathout");
                startActivity(intent);
            }
        });

        Button WodainButton = findViewById(R.id.button_wadoa);

        WodainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "الذكر عند الوضوء";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Wodain");
                startActivity(intent);
            }
        });

        Button WodaoutButton = findViewById(R.id.button_wadoaout);

        WodaoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "الذكر بعد الفراغ من الوضوء";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Wodaout");
                startActivity(intent);
            }
        });
        Button HomeinButton = findViewById(R.id.button_homein);

        HomeinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الدخول الي المنزل";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Homein");
                startActivity(intent);
            }
        });
        Button HomeoutButton = findViewById(R.id.button_homeout);

        HomeoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الخروج من المنزل";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Homeout");
                startActivity(intent);
            }
        });

        Button MusicgoButton = findViewById(R.id.button_musicgo);

        MusicgoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار  الذهاب الي المسجد";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Musicgo");
                startActivity(intent);
            }
        });




        Button BreakfastButton = findViewById(R.id.button_breakfast);

        BreakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "الدعاء عند افطار الصائم";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Breakfast");
                startActivity(intent);
            }
        });
        Button ClothButton = findViewById(R.id.button_cloth);

        ClothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "دعاء لبس الثوب";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Cloth");
                startActivity(intent);
            }
        });
        Button NommupButton = findViewById(R.id.button_sleepup);

        NommupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أذكار الإستيقاظ من النوم";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Nummup");
                startActivity(intent);
            }
        });
        Button QuranzikrButton = findViewById(R.id.button_quran);

        QuranzikrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alAzkarType = "أدعيه من القران الكريم";
                Intent intent = new Intent(zekr_activity.this, Alazkar.class);
                intent.putExtra(Alazkar.INTENT_RESULT, "Quranzikr");
                startActivity(intent);
            }
        });



    }

}



package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Alazkar extends AppCompatActivity {

    public static final String INTENT_RESULT = "com.example.azkary.RESULT";
    public static String zikrClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_azkar);

        Intent intent = getIntent();

        String result = intent.getStringExtra(INTENT_RESULT);

        displayAzkar(result);

    }


    private void displayAzkar(String zikrType) {

        List<Zikr> azkar = new ArrayList<>();

        if(zikrType.equals("masaa")) {
            azkar = DataManager.getInstance().getMasaaZikr();

        } else if(zikrType.equals("sabah")) {
            azkar = DataManager.getInstance().getSabahZikr();
        }  else if(zikrType.equals("Azan")) {
            azkar = DataManager.getInstance().getmAzanZikrZikr();
        } else if(zikrType.equals("Nomm")) {
            azkar = DataManager.getInstance().getmNommZikr();
        }
        else if(zikrType.equals("Musicin")) {
            azkar = DataManager.getInstance().getmMusiinZikr();
        }
        else if(zikrType.equals("Musicout")) {
            azkar = DataManager.getInstance().getmMusicoutZikr();
        }
        else if(zikrType.equals("Pray")) {
            azkar = DataManager.getInstance().getMparyZikr();
        }
        else if(zikrType.equals("Pathin")) {
            azkar = DataManager.getInstance().getmPathinZikr();
        }
        else if(zikrType.equals("Pathout")) {
            azkar = DataManager.getInstance().getmPathoutZikr();
        }
        else if(zikrType.equals("Homein")) {
            azkar = DataManager.getInstance().getmHomeinZikr();
        } else if(zikrType.equals("Homeout")) {
            azkar = DataManager.getInstance().getmHomeoutZikr();
        }
        else if(zikrType.equals("Wodain")) {
            azkar = DataManager.getInstance().getmWadoainZikr();
        }
        else if(zikrType.equals("Wodaout")) {
            azkar = DataManager.getInstance().getmWadoaoutZikr();
        }

        else if(zikrType.equals("Musicgo")) {
            azkar = DataManager.getInstance().getmMusicgoZikr();
        }
        else if(zikrType.equals("Breakfast")) {
            azkar = DataManager.getInstance().getmBreakfastZikr();
        }
        else if(zikrType.equals("Quranzikr")) {
            azkar = DataManager.getInstance().getmQuranZikr();
        } else if(zikrType.equals("Nummup")) {
            azkar = DataManager.getInstance().getmNommupZikr();
        } else if(zikrType.equals("Cloth")) {
            azkar = DataManager.getInstance().getmClothZikr();
        }











        RecyclerView zikrRecyclerView = findViewById(R.id.list_zikr);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        zikrRecyclerView.setLayoutManager(linearLayoutManager);

        ZikrRecyclerAdapter zikrRecyclerAdapter =
                new ZikrRecyclerAdapter(this, azkar);

        zikrRecyclerView.setAdapter(zikrRecyclerAdapter);

    }
}
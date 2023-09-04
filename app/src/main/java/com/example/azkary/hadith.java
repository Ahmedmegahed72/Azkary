package com.example.azkary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class hadith extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<String>> {
    private  static  String url="https://jsonware.com/api/v1/json/00e0482a-9b4b-467c-9c44-d6cc90e7945b";
    ListView lv_items;
    ProgressBar progressBar;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadith);
        lv_items=findViewById(R.id.lv_items);
        progressBar=findViewById(R.id.prog);

        LoaderManager loaderManager=getSupportLoaderManager();
        loaderManager.initLoader(0,null,hadith.this).forceLoad();

        lv_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> ListView, View row, int position, long id) {
                if(position==0) {
                    intent = new Intent(hadith.this, fadl_el_elm.class);
                }
                if(position==1) {
                    intent = new Intent(hadith.this, sadka.class);
                }
                if(position==2) {
                    intent = new Intent(hadith.this, sapr.class);
                }
                if(position==3) {
                    intent = new Intent(hadith.this, tsamoh.class);
                }
                if(position==4) {
                    intent = new Intent(hadith.this, hegg.class);
                }
                if(position==5) {
                    intent = new Intent(hadith.this, br_el_waldain.class);
                }
                if(position==6) {
                    intent = new Intent(hadith.this, sdek.class);
                }
                if(position==7) {
                    intent = new Intent(hadith.this, twba.class);
                }
                if(position==8) {
                    intent = new Intent(hadith.this, fadl_zekr_Allah.class);
                }
                if(position==9) {
                    intent = new Intent(hadith.this, nazafa.class);
                }
                startActivity(intent);
            }
        });
    }

    @NonNull
    @Override
    public Loader<ArrayList<String>> onCreateLoader(int id, @Nullable Bundle args) {
        progressBar.setVisibility(View.VISIBLE);
        return new Add(hadith.this,url);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<String>> loader, ArrayList<String> Add) {
        progressBar.setVisibility(View.GONE);
        if(Add.size()==0)
        {
            Toast.makeText(getApplicationContext(),"no internet connection",Toast.LENGTH_SHORT).show();
        }
        final ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.list_items,Add);
        lv_items.setAdapter(adapter);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<String>> loader) {

    }
}
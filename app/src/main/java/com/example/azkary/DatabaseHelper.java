package com.example.azkary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    static final String  DATABASE_NAME="RegisterationDatabase";
    static final String  TAG="DatabaseHelper";
    static final String  TABLE_NAME="RegisterationDetails";
    static final String  user="RegisterationDetails";
    static final String  NAME="name";
    static final String  PHONE="phone";
    static final String  EMAIL="email";
    static final String  ID="id";
    static final String  PASSWORD="password";
    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,PHONE TEXT,EMAIL TEXT,PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }
    public boolean AddData(String name,String phone,String email,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("PHONE",phone);
        contentValues.put("EMAIL",email);
        contentValues.put("PASSWORD",password);
        long result=db.insert("user",null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean CheckEmail(String email)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM user WHERE email =? ",new String[] {email});
        if(cursor.getCount()>0)
            return true;
        else
            return  false;
    }
    public boolean CheckUsers(String email,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM user WHERE email =? And password =?",new String[] {email,password});
        if(cursor.getCount()>0)
            return true;
        else
            return  false;
    }
}

package com.example.pc.memory_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC on 7/1/2017.
 */

public class Database extends SQLiteOpenHelper {
    public Database(Context context)
    {
        super(context,"GameDatabase",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("Create Table tblScore( ID INTEGER PRIMARY KEY  AUTOINCREMENT,Username NVARCHAR(30) NOT NULL,Score INTEGER NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}

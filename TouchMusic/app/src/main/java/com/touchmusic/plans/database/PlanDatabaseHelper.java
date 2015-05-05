package com.touchmusic.plans.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cardelar on 29/03/15.
 */
public class PlanDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "plantable.db";
    private static final int DATABASE_VERSION = 1;


    public PlanDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        PlanTable.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        PlanTable.onUpgrade(db, oldVersion, newVersion);
    }
}

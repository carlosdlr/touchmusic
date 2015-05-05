package com.touchmusic.plans.database;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by cardelar on 29/03/15.
 */
public class PlanTable {

    // Database table
    public static final String TABLE_PLAN = "plan";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_VALUE = "value";
    public static final String COLUMN_DESCRIPTION = "description";


    // Database creation SQL statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_PLAN
            + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_VALUE + " numeric(10,5) not null, "
            + COLUMN_DESCRIPTION + " text not null"
            + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
                                 int newVersion) {
        Log.w(PlanTable.class.getName(), "Upgrading database from version "
                + oldVersion + " to " + newVersion
                + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_PLAN);
        onCreate(database);
    }
}

package com.DSI31g2.sweet_tunisia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class HelperDestination extends SQLiteOpenHelper {
    private static final String DB_NAME = "sweet_tunisia.db";
    private static final int VERSION = 1;
    private static final String TABLE_NAME = "destination";
    private static final String describe_col = "describe_destination";
    private static final String localisation_col = "localisation_destination";

    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + describe_col + " text," + localisation_col + " text);";


    public HelperDestination(Context context) {
        super(context, DB_NAME, null, VERSION);
        Log.d("db", "data base is created");
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Log.d("db", "data base is created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        onCreate(db);

    }

    public void addDestination(SQLiteDatabase db, Destination destination) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(describe_col, destination.getDescribe_destination());
        contentValues.put(localisation_col, destination.getLocalisation_destination());

        db.insert(TABLE_NAME, null, contentValues);

    }

    public List<Destination> showDestination(SQLiteDatabase db) {

        List<Destination> list = new ArrayList<>();
        String columns[] = {describe_col, localisation_col};
        Cursor cursor = db.query(TABLE_NAME, columns, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            if (cursor.moveToFirst()) {
                do {

                    Destination destination = new Destination(cursor.getString(0), cursor.getString(1), cursor.getString(2));


                } while (cursor.moveToNext());

            }
            return list;

        }


        return list;
    }
}

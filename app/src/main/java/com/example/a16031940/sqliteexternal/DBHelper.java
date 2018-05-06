package com.example.a16031940.sqliteexternal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Fifalines.db";
    private static final String COL0 = "ID";
    private static final String COL1 = "name";
    private static final int DATABASE_VER = 1;

    public  DBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + DATABASE_NAME + "(" + COL0 + "INTEGER PRIMARY KEY AUTOINCREMENT," + COL1 + "TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldDB, int newDb) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        onCreate(db);
    }

    public String getData(int id) {
        SQLiteDatabase sdb = this.getWritableDatabase();
        String[] params = new String[]{String.valueOf(id)};
        Cursor cursor = sdb.rawQuery("SELECT * FROM FifaTable WHERE iD = ?", params);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        return cursor.getString(1);

    }


}


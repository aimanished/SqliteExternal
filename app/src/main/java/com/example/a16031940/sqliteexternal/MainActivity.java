package com.example.a16031940.sqliteexternal;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    EditText tv;
//    Button btn, btn2;
//    Cursor cursor;

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tv = findViewById(R.id.tvResults);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent homeIntent = new Intent(MainActivity.this, Home.class);
            startActivity(homeIntent);
            finish();
        }
    },SPLASH_TIME_OUT);

        // main activity is where i put my launcher.  I WILL ONLY MAKE 3 fking pages!!! Need do blog!

//
//        DBHelper db = new DBHelper(this);
//        String query = db.getData(5);
//
//        tv.setText(query);
    }
}

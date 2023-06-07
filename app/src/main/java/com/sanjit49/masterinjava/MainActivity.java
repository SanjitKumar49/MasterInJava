package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Thread thread = new Thread() {
            public  void run() {
                try
                {
                    sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    startActivity(new Intent(MainActivity.this,Home.class));
                    finish();
                }
            }

        };thread.start();
    }
}
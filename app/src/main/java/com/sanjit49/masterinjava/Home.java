package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    private CardView oops;
    private CardView javaframwork;
    private CardView adavancejava;
    private CardView j2me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CardView corejava = findViewById(R.id.corejava);
        CardView dsa = findViewById(R.id.dsa);
        CardView oops=findViewById(R.id.oops);
        javaframwork=findViewById(R.id.framework);
        j2me=findViewById(R.id.j2me);
        adavancejava=findViewById(R.id.adavncejava);
        this.setTitle("Home");


        corejava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Topic.class);
                intent.putExtra("Topic","corejava");
                startActivity(intent);
            }
        });
        oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Topic.class);
                intent.putExtra("Topic","OOPS");
                startActivity(intent);
            }
        });
        javaframwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Peragraph.class);
                intent.putExtra("java","dsanotes");
                startActivity(intent);
            }
        });
        dsa.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent(Home.this,Topic.class);
           intent.putExtra("Topic","DSA");
           startActivity(intent);
       }
   });
        adavancejava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Work in process...", Toast.LENGTH_SHORT).show();
            }
        });
        j2me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Peragraph.class);
                intent.putExtra("java","interview");
                startActivity(intent);
            }
        });


    }
}
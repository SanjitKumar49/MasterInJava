package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Topic extends AppCompatActivity {
    String[] number ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        String[] number ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",};
        String[] DSA={"Arrays","Strings","2D Arrays","Searching & Sorting","Backtracking","Linked list","Stack & Queues","Greedy Algorithm","Binary Trees","Binary Search Trees","Heap & hashing","Graphs","Tries","Dynamic Programming","Bit Manipulation","Segment Trees"};
        String[] Corejava={"Introduction of Java","Datatype,Variable,Keyword","Conditional Statements","Looping Statements","Control Statements","Operators & Method","Array & String "};
        String[] OOPS={"class & Object","Abstraction, Encapsulation, Enheritance and Polymorphism","Super & This keyword,Access Specifier","Exception handling,Threading,Package"};
        ListView listView = findViewById(R.id.listview);
        String come=getIntent().getStringExtra("Topic");
        switch (come) {
            case "DSA": {
                custombaseadapter custombaseadapter = new custombaseadapter(getApplicationContext(), DSA, number);
                listView.setAdapter(custombaseadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String selectedItem = (String) adapterView.getItemAtPosition(i);
                        if (i == 0) {
                            Intent intent = new Intent(Topic.this, OptionforDSA.class);
                            intent.putExtra("DSA", "Array");
                            startActivity(intent);
                        }
                        if (i == 1) {
                            Intent intent = new Intent(Topic.this, OptionforDSA.class);
                            intent.putExtra("DSA", "String");
                            startActivity(intent);
                        }
                        if (i == 2) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                            Intent intent = new Intent(Topic.this, OptionforDSA.class);
//                            intent.putExtra("DSA", "String");
//                            startActivity(intent);
                        }
                        if (i == 3) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 4) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 5) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 6) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 7) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 8) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 9) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 10) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 11) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 12) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 13) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 14) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();

//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 15) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();
//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }
                        if (i == 16) {
                            Toast.makeText(Topic.this, "Work In Process..", Toast.LENGTH_SHORT).show();
//                        Intent intent=new Intent(Topic.this, OptionforDSA.class);
//                        intent.putExtra("DSA","String");
//                        startActivity(intent);
                        }


                    }
                });
                break;
            }
            case "corejava": {
                custombaseadapter custombaseadapter = new custombaseadapter(getApplicationContext(), Corejava, number);
                listView.setAdapter(custombaseadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String selectedItem = (String) adapterView.getItemAtPosition(i);
                        if (i == 0) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "introduction");
                            startActivity(intent);
                        }
                        if (i == 1) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "Datatype");
                            startActivity(intent);
                        }
                        if (i == 2) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "if");
                            startActivity(intent);
                        }
                        if (i == 3) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "for");
                            startActivity(intent);
                        }
                        if (i == 4) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "break");
                            startActivity(intent);
                        }
                        if (i == 5) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "op");
                            startActivity(intent);
                        }
                        if (i == 6) {
                            Intent intent = new Intent(Topic.this, Peragraph.class);
                            intent.putExtra("java", "Array");
                            startActivity(intent);
                        }
                    }
                });
                break;
            }
        }
        if (come.equals("OOPS")) {
            custombaseadapter custombaseadapter = new custombaseadapter(getApplicationContext(), OOPS, number);
            listView.setAdapter(custombaseadapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String selectedItem = (String) adapterView.getItemAtPosition(i);
                    if (i==0){
                        Intent intent=new Intent(Topic.this, Peragraph.class);
                        intent.putExtra("java","class");
                        startActivity(intent);
                    }
                    if (i==1){
                        Intent intent=new Intent(Topic.this, Peragraph.class);
                        intent.putExtra("java","oops");
                        startActivity(intent);
                    }
                    if (i==2){
                        Intent intent=new Intent(Topic.this, Peragraph.class);
                        intent.putExtra("java","super");
                        startActivity(intent);
                    }
                    if (i==3){
                        Intent intent=new Intent(Topic.this, Peragraph.class);
                        intent.putExtra("java","exception");
                        startActivity(intent);
                    }

                }
            });
        }

    }
}
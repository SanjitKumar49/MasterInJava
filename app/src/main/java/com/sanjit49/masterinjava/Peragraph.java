package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class Peragraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peragraph);
        PDFView pdfView=findViewById(R.id.pdfview);
        String come=getIntent().getStringExtra("java");
        // core java
        if (come.equals("introduction")){
            pdfView.fromAsset("Histroy.pdf").load();
        }
        if (come.equals("Datatype")){
            pdfView.fromAsset("Datatype.pdf").load();
        }
        if (come.equals("if")){
            pdfView.fromAsset("Conditional.pdf").load();
        }
        if (come.equals("for")){
            pdfView.fromAsset("Looping.pdf").load();
        }
        if (come.equals("break")){
            pdfView.fromAsset("Control.pdf").load();
        }
        if (come.equals("op")){
            pdfView.fromAsset("Opertors.pdf").load();
        }
        if (come.equals("Array")){
            pdfView.fromAsset("Array.pdf").load();
        }

        //oops concept
        if (come.equals("class")){
            pdfView.fromAsset("Class.pdf").load();
        }
        if (come.equals("oops")){
            pdfView.fromAsset("OOPS.pdf").load();
        }
        if (come.equals("super")){
            pdfView.fromAsset("Super.pdf").load();
        }
        if (come.equals("exception")){
            pdfView.fromAsset("Exception.pdf").load();
        }

      // DSA notes;
        if (come.equals("dsanotes")){
            pdfView.fromAsset("dsanotes.pdf").load();
        }
        // interview notes;
        if (come.equals("interview")){
            pdfView.fromAsset("interview.pdf").load();
        }


    }
}
package com.example.click;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class firstLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        TableRow mtable = (TableRow) findViewById(R.id.hh1);

        mtable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(firstLayout.this,secondlayout.class));
            }
        });
    }
}
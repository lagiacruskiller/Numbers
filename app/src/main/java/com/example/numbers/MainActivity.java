package com.example.numbers;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button resetbtn;
    private TextView noticeboard, displaybox;
    FloatingActionButton counterbtn;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        resetbtn = findViewById(R.id.resetbtn);
        noticeboard = findViewById(R.id.noticeboard);
        displaybox = findViewById(R.id.displaybox);
        counterbtn = findViewById(R.id.counterbtn);
        counterbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                displaybox.setText(counter);
            }
        });

    }
}

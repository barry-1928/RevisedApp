package com.example.dell.task1_spider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    String s;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s = getIntent().getStringExtra("Access");
        textView = (TextView) findViewById(R.id.textview1);
        textView.setText(s);
    }
}

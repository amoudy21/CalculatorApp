package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView answerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        answerView = (TextView) findViewById(R.id.answerTextView);
        Intent intent = getIntent();
        String s = intent.getStringExtra("answer");
        answerView.setText(s);
    }
}
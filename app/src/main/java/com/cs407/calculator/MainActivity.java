package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View view){
        EditText topEditText = (EditText) findViewById(R.id.topEditText);
        EditText botEditText = (EditText) findViewById(R.id.botEditText);

        int answer = Integer.parseInt(topEditText.getText().toString()) + Integer.parseInt(botEditText.getText().toString());

        Intent intent = new Intent(this,DisplayActivity.class);
        intent.putExtra("answer",String.valueOf(answer));
        startActivity(intent);
    }

    public void subClick(View view){
        EditText topEditText = (EditText) findViewById(R.id.topEditText);
        EditText botEditText = (EditText) findViewById(R.id.botEditText);

        int answer = Integer.parseInt(topEditText.getText().toString()) - Integer.parseInt(botEditText.getText().toString());

        Intent intent = new Intent(this,DisplayActivity.class);
        intent.putExtra("answer",String.valueOf(answer));
        startActivity(intent);
    }

    public void multClick(View view){
        EditText topEditText = (EditText) findViewById(R.id.topEditText);
        EditText botEditText = (EditText) findViewById(R.id.botEditText);

        int answer = Integer.parseInt(topEditText.getText().toString()) * Integer.parseInt(botEditText.getText().toString());

        Intent intent = new Intent(this,DisplayActivity.class);
        intent.putExtra("answer",String.valueOf(answer));
        startActivity(intent);
    }

    public void divClick(View view){
        EditText topEditText = (EditText) findViewById(R.id.topEditText);
        EditText botEditText = (EditText) findViewById(R.id.botEditText);

        Intent intent = new Intent(this,DisplayActivity.class);
        if(Integer.parseInt(botEditText.getText().toString()) != 0) {
            int answer = Integer.parseInt(topEditText.getText().toString()) / Integer.parseInt(botEditText.getText().toString());
            intent.putExtra("answer",String.valueOf(answer));
        }else{
            intent.putExtra("answer","Undefined");
        }
        startActivity(intent);
    }
}
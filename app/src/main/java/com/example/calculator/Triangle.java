package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Triangle extends AppCompatActivity {
    Button button3;
    EditText text3;
    EditText text1;
    EditText text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        findViewById(R.id.text3);
        findViewById(R.id.text4);
        findViewById(R.id.text1);
        findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n=Integer.parseInt(text1.getText().toString());
               double n1=Integer.parseInt(text3.getText().toString());
               double area= 0.5*n1*n;
               text4.setText(String.valueOf(area));
            }
        });
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Rectangle extends AppCompatActivity {
EditText length,width,ans2;
Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        findViewById(R.id.length);
        findViewById(R.id.width);
        findViewById(R.id.ans2);
        findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n= Integer.parseInt(length.getText().toString());
                double n1= Integer.parseInt(width.getText().toString());
                double area=n*n1;
                ans2.setText(String.valueOf(area));
            }
        });
    }
}
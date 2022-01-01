package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Square extends AppCompatActivity {
    EditText tx3;
    EditText tx5;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        findViewById(R.id.tx3);
        findViewById(R.id.tx5);
        findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n= Integer.parseInt(tx3.getText().toString());

                double area= n*n;
                tx5.setText(String.valueOf(area));

            }
        });

    }
}
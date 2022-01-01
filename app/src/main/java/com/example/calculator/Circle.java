package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Circle extends AppCompatActivity {
Button button;
EditText tx1,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
findViewById(R.id.button);
findViewById(R.id.tx1);
findViewById(R.id.ans);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        double n= Integer.parseInt(tx1.getText().toString());
        double area=n*n*(3.14);
        ans.setText(String.valueOf(area));

    }
});
    }
}
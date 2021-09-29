package com.example.multiplebuttonsonclickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "ONE", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                Toast.makeText(MainActivity.this, "TWO", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                Toast.makeText(MainActivity.this, "THREE", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
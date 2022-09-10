package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();


            String name = bundle.getString("name");
            String age = bundle.getString("age");

            TextView textname = findViewById(R.id.oneone);
            TextView textname2 = findViewById(R.id.onetwo);

            textname.setText(name);
            textname2.setText(age);
        }
    }

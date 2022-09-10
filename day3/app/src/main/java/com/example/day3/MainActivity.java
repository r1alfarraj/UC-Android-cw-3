package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textname = findViewById(R.id.oneone);

        EditText textname2 = findViewById(R.id.onetwo);


        Button travel = findViewById(R.id.button);


        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = textname.getText().toString();
                String age = textname2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra( "name",name);
                intent.putExtra("age",age);

                startActivity(intent);


            }
        });
    }
}
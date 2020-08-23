package com.aswal.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class ListOfExercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_exercises);

        LinearLayout button1 = (LinearLayout)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfExercises.this, AbsDay.class);
                startActivity(intent);

            }
        });

        LinearLayout button2 = (LinearLayout)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfExercises.this, LegsDay.class);
                startActivity(intent);

            }
        });

        LinearLayout button3 = (LinearLayout)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfExercises.this, ChestDay.class);
                startActivity(intent);

            }
        });


    }
}

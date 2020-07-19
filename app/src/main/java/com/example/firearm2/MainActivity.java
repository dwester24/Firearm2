package com.example.firearm2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Qualification Text View
        TextView qual = findViewById(R.id.qual_courses);

        //Set on click listener
        qual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qualIntent = new Intent(MainActivity.this, QualificationActivity.class);
                startActivity(qualIntent);
            }
        });

        //Find Calculator Text View
        TextView calculator = findViewById(R.id.calculator);

        //Set Calculator on click listener
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calIntent);
            }
        });
    }
}
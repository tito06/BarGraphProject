package com.example.bargraphproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button b1;

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = findViewById(R.id.userName);
        ed2 = findViewById(R.id.userPass);
        b1  = findViewById(R.id.btn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((ed1.getText().toString().equals("admin")) && (ed2.getText().toString().equals("abcd"))){
                    Intent intent = new Intent(MainActivity.this, GraphActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(MainActivity.this, "Incorrect UserName or Password", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}

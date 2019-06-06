package com.example.bargraphproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraphActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5;
    Button btn;

    int num1, num2, num3, num4, num5;

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);


        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        btn = findViewById(R.id.sub);

        barChart = findViewById(R.id.barChart);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Integer.parseInt(ed1.getText().toString())>=5 && Integer.parseInt(ed1.getText().toString())<=20){
                    num1 = Integer.parseInt(ed1.getText().toString());
                } else{
                    Toast.makeText(getApplicationContext(), "please enter number between 5 to 20",Toast.LENGTH_LONG).show();
                }
                if (Integer.parseInt(ed2.getText().toString())>=5 && Integer.parseInt(ed2.getText().toString())<=20){
                    num2 = Integer.parseInt(ed2.getText().toString());
                } else{
                    Toast.makeText(getApplicationContext(), "please enter number between 5 to 20",Toast.LENGTH_LONG).show();
                }
                if (Integer.parseInt(ed3.getText().toString())>=5 && Integer.parseInt(ed3.getText().toString())<=20){
                    num3 = Integer.parseInt(ed3.getText().toString());
                } else{
                    Toast.makeText(getApplicationContext(), "please enter number between 5 to 20",Toast.LENGTH_LONG).show();
                }

                if (Integer.parseInt(ed4.getText().toString())>=5 && Integer.parseInt(ed4.getText().toString())<=20){
                    num4 = Integer.parseInt(ed4.getText().toString());
                } else{
                    Toast.makeText(getApplicationContext(), "please enter number between 5 to 20",Toast.LENGTH_LONG).show();
                }

                if (Integer.parseInt(ed5.getText().toString())>=5 && Integer.parseInt(ed5.getText().toString())<=20){
                    num5 = Integer.parseInt(ed5.getText().toString());
                } else{
                    Toast.makeText(getApplicationContext(), "please enter number between 5 to 20",Toast.LENGTH_LONG).show();
                }



                ArrayList<BarEntry> barEntries = new ArrayList<>();
                barEntries.add(new BarEntry(0, num1));
                barEntries.add(new BarEntry(1, num2));
                barEntries.add(new BarEntry(2, num3));
                barEntries.add(new BarEntry(3, num4));
                barEntries.add(new BarEntry(4, num5));

                BarDataSet barDataSet=  new BarDataSet(barEntries, "numbers");

                barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);


                BarData barData = new BarData(barDataSet);
                barChart.setData(barData);

            }
        });



    }
}

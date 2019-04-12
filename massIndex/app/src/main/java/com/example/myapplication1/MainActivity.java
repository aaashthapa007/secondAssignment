package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText height, weight, result;
    Button btnbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);
        btnbmi = findViewById(R.id.btnbmi);

        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double heightValue = Double.parseDouble(height.getText().toString());
                double weightValue = Double.parseDouble(weight.getText().toString());
                double meterHeight = (heightValue)/100;
                double bmiresult = (weightValue)/(meterHeight*meterHeight);
                result.setText(bmiresult+"");

                if (bmiresult<18.5){
                    Toast.makeText(MainActivity.this, "underweight", Toast.LENGTH_SHORT).show();
                }
                else if(bmiresult>=18.5 && bmiresult<24.9){
                    Toast.makeText(MainActivity.this, "normal weight", Toast.LENGTH_SHORT).show();
                }
                else if (bmiresult>=25 && bmiresult>=29.9){
                    Toast.makeText(MainActivity.this, "Overweight", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Obesity", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

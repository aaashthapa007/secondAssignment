package com.example.calculatetaxamount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText text;
        Button Result;
        double tax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =findViewById(R.id.text1);
        Result = findViewById(R.id.btnresult);

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double Salary = Double.parseDouble(text.getText().toString());
            Double yearlysal = Salary*12;
            if (yearlysal>0 && yearlysal<200000){
                    tax = 0.01*yearlysal;
                }
            else if (yearlysal>200000 && yearlysal<350000){
                    tax = 0.01*200000 + 0.15*(yearlysal-200000);
                }
                else{
                    tax = 0.01*200000 + 0.15*150000 + 0.25*(yearlysal-350000);
            }
                Toast.makeText(MainActivity.this, "Tax is "+tax, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

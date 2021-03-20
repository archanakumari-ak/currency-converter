package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String amtINR = editText.getText().toString();
        double amtINRd = Double.parseDouble(amtINR);
        double amtUSDd = amtINRd * 0.014;
        String amtUSD = String.format("%.2f",amtUSDd);
        Toast.makeText(this, amtUSD + "USD", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
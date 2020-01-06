package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToEuro(View view) {
        EditText amountString = (EditText) findViewById(R.id.amountNumber);

        double amount = Double.parseDouble(amountString.getText().toString());
        double euros = amount * 0.91;
        Toast.makeText(this, "It's "+euros+" euros.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

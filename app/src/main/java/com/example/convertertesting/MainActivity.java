package com.example.convertertesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private TextView textView2;
    private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Submitted !", Toast.LENGTH_SHORT).show();
//                String s = editTextNumber.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.20462 * kg;
//
//                textView2.setText("The pound value is :"+ pound);
//
//
//            }
//        });
    }
    public void calc(View view)
    {
        Toast.makeText(MainActivity.this, "Submitted !", Toast.LENGTH_SHORT).show();
        String s = editTextNumber.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.20462 * kg;

        textView2.setText("The pound value is :"+ pound);

    }
}
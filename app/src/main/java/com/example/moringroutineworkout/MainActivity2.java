package com.example.moringroutineworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1= findViewById(R.id.editText_1);
        et2= findViewById(R.id.editText_2);


    }

    public void goToActivity3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        double message1 = Double.parseDouble(et1.getText().toString());
        double message2 = Double.parseDouble(et2.getText().toString());
        double temp3=message1/100;
        double temp2 =message2/(temp3*temp3);
        String temp="";
        if(temp2<18.5) {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Underweght";
        }
        else if(temp2>=18.5 && temp2 <= 24.9)
        {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Normal weight";
        }
        else if(temp2>=25 && temp2<=29.9)
        {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Pre-obesity";
        }
        else if(temp2>=30 && temp2<=34.9)
        {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Obesity class I";
        }
        else if(temp2>=35 && temp2<=39.9)
        {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Obesity class II";
        }
        else if(temp2>=40)
        {
            temp = "Your BMI Is: " + String.valueOf(String.format("%.1f", temp2)) + " You Are Obesity class III";
        }

        intent.putExtra("key1",temp);
        startActivity(intent);

    }
}
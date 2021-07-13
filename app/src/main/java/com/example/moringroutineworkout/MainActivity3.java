package com.example.moringroutineworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        String message = intent.getStringExtra("key1");
        TextView textView = findViewById(R.id.text_3);
        textView.setText(message);
    }

    public void goToActivity4(View view) {
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void goToActivity5(View view) {
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}
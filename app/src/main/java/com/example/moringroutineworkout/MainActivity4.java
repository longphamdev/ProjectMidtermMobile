package com.example.moringroutineworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[];
    int image[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
    int video[]={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        recyclerView=findViewById(R.id.recyclerView1);

        s1=getResources().getStringArray(R.array.ex_name_weight);
        s2=getResources().getStringArray(R.array.time_weight);

        myAdapter1 myadapter1=new myAdapter1(this,s1,s2,video,image);

        recyclerView.setAdapter(myadapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
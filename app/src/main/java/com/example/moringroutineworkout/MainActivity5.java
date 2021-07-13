package com.example.moringroutineworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity5 extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[];
    int image[]={R.drawable.a1,R.drawable.b1,R.drawable.c1,R.drawable.d1,R.drawable.e1,R.drawable.f1,R.drawable.g1,R.drawable.h1,R.drawable.i1,R.drawable.k1,R.drawable.l1};
    int video[]={R.raw.a1,R.raw.b1,R.raw.c1,R.raw.d1,R.raw.e1,R.raw.f1,R.raw.g1,R.raw.h1,R.raw.i1,R.raw.k1,R.raw.l1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        recyclerView=findViewById(R.id.recyclerView2);

        s1=getResources().getStringArray(R.array.ex_name_height);
        s2=getResources().getStringArray(R.array.time_height);

        myAdapter2 myadapter2=new myAdapter2(this,s1,s2,video,image);

        recyclerView.setAdapter(myadapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
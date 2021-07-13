package com.example.moringroutineworkout;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter1 extends RecyclerView.Adapter<myAdapter1.myViewHolder1> {

    Context context;
    String data1[],data2[];
    int image[],video[];

    public myAdapter1 (Context ct, String s1[],String s2[],int vid[],int img[]){
        context=ct;
        data1=s1;
        data2=s2;
        image=img;
        video=vid;
    }

    @Override
    public myViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row_1,parent,false);
        return new myViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(myAdapter1.myViewHolder1 holder, int position) {
        holder.myTxt1.setText(data1[position]);
        holder.myTxt2.setText(data2[position]);
        holder.myTxt3.setText("Click for video instruction.");
        holder.myImageView.setImageResource(image[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,SecondActivity_1.class);
                intent.putExtra("Video",video[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class myViewHolder1 extends RecyclerView.ViewHolder {
        TextView myTxt1,myTxt2,myTxt3;
        ImageView myImageView;
        ConstraintLayout mainLayout;

        public myViewHolder1(View itemView) {
            super(itemView);

            myTxt1=itemView.findViewById(R.id.myTxt1);
            myTxt2=itemView.findViewById(R.id.myTxt2);
            myTxt3=itemView.findViewById(R.id.myTxt3);
            myImageView=itemView.findViewById(R.id.myImageView);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}

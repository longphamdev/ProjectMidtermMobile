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

public class myAdapter2 extends RecyclerView.Adapter<myAdapter2.myViewHolder2> {

    Context context;
    String data1[],data2[];
    int image[],video[];

    public myAdapter2 (Context ct, String s1[],String s2[],int vid[],int img[]){
        context=ct;
        data1=s1;
        data2=s2;
        image=img;
        video=vid;
    }

    @Override
    public myViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row_2,parent,false);
        return new myViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(myAdapter2.myViewHolder2 holder, int position) {
        holder.myTxt1.setText(data1[position]);
        holder.myTxt2.setText(data2[position]);
        holder.myTxt3.setText("Click for video instruction.");
        holder.myImageView.setImageResource(image[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,SecondActivity_2.class);
                intent.putExtra("Video",video[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class myViewHolder2 extends RecyclerView.ViewHolder {
        TextView myTxt1,myTxt2,myTxt3;
        ImageView myImageView;
        ConstraintLayout mainLayout;

        public myViewHolder2(View itemView) {
            super(itemView);

            myTxt1=itemView.findViewById(R.id.myTxt10);
            myTxt2=itemView.findViewById(R.id.myTxt20);
            myTxt3=itemView.findViewById(R.id.myTxt30);
            myImageView=itemView.findViewById(R.id.myImageView1);
            mainLayout=itemView.findViewById(R.id.mainLayout1);
        }
    }
}

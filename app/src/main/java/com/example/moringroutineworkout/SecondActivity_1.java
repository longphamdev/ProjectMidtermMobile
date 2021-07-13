package com.example.moringroutineworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class SecondActivity_1 extends AppCompatActivity {
    VideoView videoview2;
    int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);

        videoview2=findViewById(R.id.videoView2);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("Video"))
            data=getIntent().getIntExtra("Video",1);
        else
            Toast.makeText(this,"No data",Toast.LENGTH_SHORT).show();
    }

    private void setData()
    {
        videoview2.setVideoPath("android.resource://"+getPackageName()+"/"+data);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoview2);
        videoview2.setMediaController(mediaController);
    }
}
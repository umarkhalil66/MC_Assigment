package com.example.fisrt_application;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    MediaPlayer med;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name=getIntent().getStringExtra("name").toString();
        int id=getResources().getIdentifier(name,"drawable",getPackageName());
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.setImageResource(id);
        int md=getResources().getIdentifier(name,"raw",getPackageName());
        med=MediaPlayer.create(getApplicationContext(),md);
        med.start();

    }
}
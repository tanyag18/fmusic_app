package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

     Button h;

    public void init(){

        h=(Button)findViewById(R.id.home);
        h.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent b= new Intent(Main2Activity.this,MainActivity.class);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        ImageButton play=(ImageButton)findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b= new Intent(Main2Activity.this,Main3Activity.class);
            }
        });
    }
}

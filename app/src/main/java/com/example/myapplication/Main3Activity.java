package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {


     Button h1,b;

    public void init1(){

        h1=(Button)findViewById(R.id.hb);
        h1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent b= new Intent(Main3Activity.this,MainActivity.class);
            }

        });

        b=(Button)findViewById(R.id.two);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent b= new Intent(Main3Activity.this,Main2Activity.class);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init1();
    }
}

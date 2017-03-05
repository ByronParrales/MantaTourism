package com.example.rosario.mantatourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rosario on 02/03/2017.
 */

public class Bar extends AppCompatActivity {
    Button btn1, btn2, btn3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        mp = MediaPlayer.create(this, R.raw.clic);
    }
    public void bar (View view){
        mp.start();

    }

    public void bar2 (View view){
        mp.start();

    }

    public void bar3 (View view){
        mp.start();

    }
}
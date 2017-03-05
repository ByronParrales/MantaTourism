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

public class Hoteles extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        mp = MediaPlayer.create(this, R.raw.clic);

    }
    public void hotel1 (View view){
        mp.start();
        Intent intenthotel1 = new Intent(Hoteles.this, MapaHotel1.class);
        startActivity(intenthotel1);

    }

    public void hotel2 (View view){
        mp.start();

    }

    public void hotel3 (View view){
        mp.start();

    }

    public void hotel4 (View view){
        mp.start();

    }
}
package com.example.rosario.mantatourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rosario on 02/03/2017.
 */

public class Explorar extends AppCompatActivity {
    TextView tv1;
    ImageView imageView1, imageView2, imageView3, imageView4;
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorar);


        tv1 = (TextView)findViewById(R.id.tv1);
        imageView1= (ImageView)findViewById(R.id.imageView1);
        imageView2= (ImageView)findViewById(R.id.imageView2);
        imageView3= (ImageView)findViewById(R.id.imageView3);
        imageView4= (ImageView)findViewById(R.id.imageView4);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);

        mp = MediaPlayer.create(this, R.raw.clic);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Explorar.this, Hoteles.class);
                startActivity(intent);
            }
        });

    }


    public void discoteca (View view){
        mp.start();
        Intent intentdisco = new Intent(Explorar.this, Discotecas.class);
        startActivity(intentdisco);
    }

    public void playa (View view){
        mp.start();
        Intent intentplaya = new Intent(Explorar.this, Playas.class);
        startActivity(intentplaya);

    }

    public void bar (View view){
        mp.start();
        Intent intentbar = new Intent(Explorar.this, Bar.class);
        startActivity(intentbar);
    }

    public void comentar (View view){
        mp.start();
        Intent intentcomentar = new Intent(Explorar.this, Comentar.class);
        startActivity(intentcomentar);
    }

}
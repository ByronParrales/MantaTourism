package com.example.rosario.mantatourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rosario on 02/03/2017.
 */

public class Comentar extends AppCompatActivity {
    Button btncomentar;
    EditText etmail, et1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentar);

        btncomentar = (Button)findViewById(R.id.btncomentar);
        et1 = (EditText)findViewById(R.id.et1);
        etmail = (EditText)findViewById(R.id.etEmail);
        mp = MediaPlayer.create(this, R.raw.clic);

    }

    public void comentar (View view){
        mp.start();
        Intent intentcomentar =new Intent(Comentar.this, Explorar.class);
        startActivity(intentcomentar);
    }
}
package com.example.rosario.mantatourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Rosario on 02/03/2017.
 */

public class SeleccionPais extends AppCompatActivity {

    TextView tvTitulo, tvTitulo2;
    CheckBox cbdata1, cbdata2;
    Button btnContinuar;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_pais);


        tvTitulo = (TextView)findViewById(R.id.tvTitulo);
        tvTitulo2= (TextView)findViewById(R.id.tvTitulo2);
        cbdata1 = (CheckBox)findViewById(R.id.cbdata1);
        cbdata2 = (CheckBox)findViewById(R.id.cbdata2);
        btnContinuar = (Button)findViewById(R.id.btnContinuar);

        mp = MediaPlayer.create(this, R.raw.clic);


        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent = new Intent(SeleccionPais.this, IniciaSecion.class);
                startActivity(intent);
            }
        });
    }
}
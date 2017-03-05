package com.example.rosario.mantatourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rosario on 02/03/2017.
 */

public class IniciaSecion extends AppCompatActivity {
    TextView tvIniciar;
    EditText etNombre, etContraseña;
    Button btnIniciar, btnRegistrar, btnFacebook, btnGmail;
    CheckBox cbdata;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia_sesion);

        tvIniciar = (TextView)findViewById(R.id.tvIniciar);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etContraseña = (EditText)findViewById(R.id.etContraseña);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);
        btnRegistrar= (Button)findViewById(R.id.btnRegistrar);
        cbdata = (CheckBox)findViewById(R.id.cbdata);

        mp = MediaPlayer.create(this, R.raw.clic);

    }

    public void Iniciar (View view){
        mp.start();
        Intent intentinicia = new Intent(IniciaSecion.this, Explorar.class);
        startActivity(intentinicia);

    }

    public void Registrar (View view){
        mp.start();
        Intent intentregistar = new Intent(IniciaSecion.this, Registrar.class);
        startActivity(intentregistar);
    }

    public void facebook (View view){
        Intent intentfacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(intentfacebook);
    }

    public void gmail (View view){
        Intent intentgmail = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
        startActivity(intentgmail);
    }


}
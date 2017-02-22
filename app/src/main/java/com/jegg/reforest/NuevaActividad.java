package com.jegg.reforest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NuevaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_actividad);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // habilitar el boton hacia atras
    }
}

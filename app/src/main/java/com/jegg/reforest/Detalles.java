package com.jegg.reforest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // habilitar el boton hacia atras
    }
}

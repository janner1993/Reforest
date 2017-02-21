package com.jegg.reforest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EscogerUbicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_ubicacion);
    }

    public void irDetalles (View v){
        Intent intent = new Intent(this, Detalles.class);
        startActivity(intent);
        finish();
    }
}

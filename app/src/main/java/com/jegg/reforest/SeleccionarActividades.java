package com.jegg.reforest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SeleccionarActividades extends AppCompatActivity {
    private String nombredeactividad;
    private String tipoactividad;
    private SharedPreferences mispreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // habilitar el boton hacia atras
        mispreferencias=getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        nombredeactividad= mispreferencias.getString("nombre","no existe la variable");
        tipoactividad =mispreferencias.getString("tipoactividad", "no existe la variable");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                startActivity(new Intent(SeleccionarActividades.this, Menu.class));
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void irNuevaActividad(View v){
        Intent intent = new Intent(this, NuevaActividad.class);
        startActivity(intent);
        finish();
    }

    public void irEscogerUbicacion(View v){
        Intent intent = new Intent(this, EscogerUbicacion.class);
        startActivity(intent);
        finish();
    }
}

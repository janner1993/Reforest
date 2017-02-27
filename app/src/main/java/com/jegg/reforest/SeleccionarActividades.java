package com.jegg.reforest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SeleccionarActividades extends AppCompatActivity {
    private String nombredeactividad;
    private String tipoactividad;
    private SharedPreferences mispreferencias;
    CheckBox nueva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);
        mispreferencias=getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        nombredeactividad= mispreferencias.getString("nombre","no existe la variable");
        tipoactividad = mispreferencias.getString("tipoactividad", "no existe la variable");
        Log.e("shareddata:",nombredeactividad + " "+ tipoactividad);
        Log.e("tipoactividad:",tipoactividad);
        LinearLayout selectActividades = (LinearLayout)findViewById(R.id.lyactividades);
        nueva = new CheckBox(SeleccionarActividades.this);
        nueva.setText(nombredeactividad);
        selectActividades.addView(nueva);
        nueva.setTop(50);
        nueva.setTextSize(20);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(10,10,20,20);
        nueva.setLayoutParams(lp);
        nueva.setTypeface(null, Typeface.BOLD);
        int states[][] = {{android.R.attr.state_checked}, {}};
        int colors[] = {Color.BLACK, Color.BLACK};
        CompoundButtonCompat.setButtonTintList(nueva, new ColorStateList(states, colors));



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                startActivity(new Intent(SeleccionarActividades.this, Menu.class));// aqui activamos la navegacion hacia atras
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

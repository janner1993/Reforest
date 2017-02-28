package com.jegg.reforest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class NuevaActividad extends AppCompatActivity {
    private EditText cajaNombre;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_actividad);
        cajaNombre = (EditText) findViewById(R.id.etNombreActividad);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                startActivity(new Intent(NuevaActividad.this, SeleccionarActividades.class));
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void nuevaActividad (View v){
        String nombreActividad = cajaNombre.getText().toString();
        String tipoActividad = spinner.getSelectedItem().toString();
        Log.e("tipo", tipoActividad);


        if (nombreActividad.equals("")){ // el usuario no ha digitado nada
            Toast.makeText(NuevaActividad.this, "LLENAR EL CAMPO DE NOMBRE", Toast.LENGTH_SHORT).show(); // mostrar un mensaje
        }
        else {
            SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("nombre", nombreActividad);
            editor.putString("tipoactividad", tipoActividad);
            editor.apply();
        }
    }

}

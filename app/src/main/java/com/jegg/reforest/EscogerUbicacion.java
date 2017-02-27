package com.jegg.reforest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class EscogerUbicacion extends AppCompatActivity implements View.OnClickListener {

    LinearLayout button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_ubicacion);

        button = (LinearLayout) findViewById(R.id.btnAgregarLote);
        button.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                startActivity(new Intent(EscogerUbicacion.this, SeleccionarActividades.class));
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void irDetalles (View v){
        Intent intent = new Intent(this, Detalles.class);
        startActivity(intent);
        finish();
    }

    public void irMapa (View v){
        Intent intent = new Intent(this,Mapa.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnAgregarLote:

                break;
        }
    }
}

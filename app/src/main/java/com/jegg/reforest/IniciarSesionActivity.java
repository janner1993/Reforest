package com.jegg.reforest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesionActivity extends AppCompatActivity {
    private EditText cajaCorreo;
    private EditText cajaContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // habilitar el boton hacia atras

        cajaCorreo = (EditText) findViewById(R.id.tvCorreo);
        cajaContraseña = (EditText) findViewById(R.id.tvContraseña);
    }

    public void irRegistro(View view){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
        finish();
    }

    public void iniciarSesion (View v){
        String correo = cajaCorreo.getText().toString();
        String contraseña = cajaContraseña.getText().toString();

        if (correo.equals("") || contraseña.equals("")){ // el usuario no ha digitado nada
            Toast.makeText(IniciarSesionActivity.this, "LLENAR CAMPOS", Toast.LENGTH_SHORT).show(); // mostrar un mensaje
        }

    }
}

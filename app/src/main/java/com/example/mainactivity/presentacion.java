package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class presentacion extends AppCompatActivity {
    private TextView tvPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        tvPersona=findViewById(R.id.tvPersona);

        String nombre = getIntent().getStringExtra("nombre");
        tvPersona.setText("¡Bienvenido " + nombre+"!");
    }
    public void Form (View view){
        Intent siguiente = new Intent(this, formulario.class);
        startActivity(siguiente);
    }
    public void Volver (View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}